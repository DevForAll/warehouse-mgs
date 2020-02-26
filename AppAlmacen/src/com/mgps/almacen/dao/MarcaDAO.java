package com.mgps.almacen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.mgps.almacen.database.ConexionDB;
import com.mgps.almacen.entity.MarcaTO;
import com.mgps.almacen.service.ICrudDao;

public class MarcaDAO  implements ICrudDao<MarcaTO>{

	
	
	  Connection cn = null;
	  Statement stm = null;
	  PreparedStatement ps = null;
	  ResultSet rs = null;
	  String sql = null;
	  int ok;
	  List<MarcaTO> lista = null;
	  MarcaTO cat = null;
	  
	  private int generaCodigo() throws SQLException {
		    sql = "SELECT MAX(MARC_IDMARCA)+ 1 FROM TB_MARCA    LIMIT 1 ";
		    stm = cn.createStatement();
		    rs = stm.executeQuery(sql);
		    rs.next();
		    int cont = rs.getInt(1);
		    rs.close();
			  int xcod =0;
			  if (cont < 0) {
			  xcod =1+ cont;
			  } else {
			     xcod = 1+ cont;
			  }
			    return cont;
			  }
	  
	  
	  final String SQL_ADICIONAR = "{call SP_MARCA_INSERTAR(?,?,?)}";
	  
	  @Override
	  public int create(MarcaTO t) throws Exception {
		  
		  	  int ok;
		    try {
		     cn = ConexionDB.getConexion2020();
		      cn.setAutoCommit(false);
		      //int cod = generaCodigo();

		    int cod = generaCodigo();
		    t.setIdMarca(cod);
		      
		      ps = cn.prepareCall(SQL_ADICIONAR);
		      // preparar los valores que le pasamos al sp
		      ps.setInt(1, t.getIdMarca());
		      ps.setString(2, t.getNombre());
		      ps.setString(3, t.getDescripcion());
		      // ejecutar sp
		      ok = ps.executeUpdate() == 1 ? 1 : 0;
		      ps.close();
		      cn.commit();// confirma que transaccion se realizado con exito
		    } catch ( SQLException e) {
		      try {
		        cn.rollback();// deshace la transaccion
		      } catch (SQLException e1) {
		      }
		      throw e;
		    } finally {
		      // cn.close();
		    }
		    return ok;
		  
	  }

	  @Override
	  public int update(MarcaTO t) throws Exception {
	    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	  }

	  @Override
	  public int delete(MarcaTO t) throws Exception {
	    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	  }

	

	@Override
	public MarcaTO find(Object t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MarcaTO> readAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MarcaTO> readAll(Object t, int op) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}
