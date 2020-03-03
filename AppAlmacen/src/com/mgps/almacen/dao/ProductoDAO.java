package com.mgps.almacen.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Date;

import com.mgps.almacen.database.ConexionDB;
import com.mgps.almacen.entity.ProductoTO;
import com.mgps.almacen.service.ICrudDao;

public class ProductoDAO  implements ICrudDao<ProductoTO> {
	
	

	  Connection cn = null;
	  Statement stm = null;
	  PreparedStatement ps = null;
	  	  CallableStatement cs = null;
	  ResultSet rs = null;
	  String sql = null;
	  int ok;
	  List<ProductoTO> lista = null;
	  ProductoTO cat = null;
	  
	  private int generaCodigo() throws SQLException {
		    sql = "SELECT MAX(PROD_FECHAVEN)+ 1 FROM TB_PRODUCTOS    LIMIT 1 ";
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
	  
	  
	  
	  

	  final String SQL_ADICIONAR = "{call SP_PRODUCTOS_INSERTAR(?,?,?,?,?,?,?,?,?,?,?)}";

	  final String SQL_ACTUALIZAR = "{call SP_MARCA_ACTUALIZAR(?,?,?)}";
	  
	  @Override
	  public int create(ProductoTO t) throws Exception {
		  
		  	  int ok;
		    try {
		     cn = ConexionDB.getConexion2020();
		      cn.setAutoCommit(false);
		     int cod = generaCodigo();
		    t.setIdproducto(cod);
		      
		      ps = cn.prepareCall(SQL_ADICIONAR);
		      // preparar los valores que le pasamos al sp
		      ps.setInt(1, t.getIdproducto());
		      ps.setString(2, t.getDescripcion());
		      ps.setInt(3, t.getCategoriaTO().getIdCategoria());
		      ps.setInt(4, t.getMarcaTO().getIdMarca());
		      ps.setInt(5, t.getCodigo());
		      ps.setString(6, t.getUbicacion());
		      ps.setDouble(7, t.getPrecioCompra());
		      ps.setInt(8, t.getStock());
		      ps.setInt(9, t.getMinStock());
		      ps.setString(10, t.getVen());
		      ps.setDate(11, (java.sql.Date) t.getFechaVen());
		      
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
	public int update(ProductoTO t) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(ProductoTO t) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ProductoTO find(Object t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductoTO findA(Object t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductoTO> readAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductoTO> readAllBuscar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductoTO> readAll(Object t, int op) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	  

}
