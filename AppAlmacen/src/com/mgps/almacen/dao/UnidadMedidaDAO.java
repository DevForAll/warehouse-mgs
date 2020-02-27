package com.mgps.almacen.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mgps.almacen.entity.CategoriaTO;
import com.mgps.almacen.entity.UnidadMedidaTO;
import com.mgps.almacen.database.ConexionDB;
import com.mgps.almacen.service.ICrudDao;



public class UnidadMedidaDAO implements ICrudDao<UnidadMedidaTO> {
	
	  Connection cn = null;
	  Statement stm = null;
	  PreparedStatement ps = null;
	  CallableStatement cs = null;
	  ResultSet rs = null;
	  String sql = null;
	  int ok;
	  List<UnidadMedidaTO> lista = null;
	  UnidadMedidaTO cat = null;
	  
	  private int generaCodigo() throws SQLException {
		    sql = "SELECT MAX(UNID_COD)+ 1 FROM TB_UNIDAD_MEDIDA    LIMIT 1 ";
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
	  
	  
	  final String SQL_ADICIONAR = "{call SP_UNIDADMEDIDA_INSERTAR(?,?,?,?)}";
	  

	  final String SQL_ACTUALIZAR = "{call SP_UNIDADMEDIDA_ACTUALIZAR(?,?,?,?)}";
	  
	  
	  @Override
	  public int create(UnidadMedidaTO t) throws Exception {
		  
		  	  int ok;
		    try {
		     cn = ConexionDB.getConexion2020();
		      cn.setAutoCommit(false);
		      //int cod = generaCodigo();

		    int cod = generaCodigo();
		    t.setCod(cod);
		      
		      ps = cn.prepareCall(SQL_ADICIONAR);
		      // preparar los valores que le pasamos al sp
		      ps.setInt(1, t.getCod());
		      ps.setString(2, t.getDescripcion());
		      ps.setString(3, t.getDescripcionCorta());
		      ps.setString(4, t.getCodigoSunat());
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
	 public int update(UnidadMedidaTO t) throws Exception {
		  	 int ok;
	    try {
			cn = ConexionDB.getConexion2020();
			cn.setAutoCommit(false);
			cs = cn.prepareCall(SQL_ACTUALIZAR);
			cs.setInt(1, t.getCod());
			cs.setString(2, t.getDescripcion());
			cs.setString(3, t.getDescripcionCorta());
		    cs.setString(4, t.getCodigoSunat());
		
			ok = cs.executeUpdate() == 1 ? 1 : 0;
			cs.close();
			cn.commit();	//CONFIRMA QUE SE ACTUALIZO CON EXITO
		} catch (SQLException e) {
			try {
				cn.rollback();
			} catch (Exception e1) {
			}
			throw e;
		} finally {
			//cn.close();
		}
	    return ok;
	 }
	   
	  

	  @Override
	  public int delete(UnidadMedidaTO t) throws Exception {
	    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	  }

	  @Override
	  public UnidadMedidaTO find(Object t) throws SQLException {
	    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	  }

	
	@Override
	public List<UnidadMedidaTO> readAll(Object t, int op) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UnidadMedidaTO> readAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


}
