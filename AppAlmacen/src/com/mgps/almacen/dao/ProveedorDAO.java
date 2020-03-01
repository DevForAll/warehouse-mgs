package com.mgps.almacen.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mgps.almacen.database.ConexionDB;
import com.mgps.almacen.entity.MarcaTO;
import com.mgps.almacen.entity.ProveedorTO;
 import com.mgps.almacen.service.ICrudDao;

public class ProveedorDAO implements ICrudDao<ProveedorTO>{

	
	

	  Connection cn = null;
	  Statement stm = null;
	  PreparedStatement ps = null;
	  CallableStatement cs = null;
	  ResultSet rs = null;
	  String sql = null;
	  int ok;
	  List<ProveedorTO> lista = null;
	  ProveedorTO cat = null;
	  
	  private int generaCodigo() throws SQLException {
		    sql = "SELECT MAX(PROV_IDPROVEEDOR)+ 1 FROM TB_PROVEEDORES    LIMIT 1 ";
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
	  
	  
	  final String SQL_ADICIONAR = "{call SP_PROVEEDORES_INSERTAR(?,?,?,?,?)}";
	  
	  final String SQL_ACTUALIZAR = "{call SP_PROVEEDORES_ACTUALIZAR(?,?,?,?,?)}";
	  
	  
	  
	  @Override
	  public int create(ProveedorTO t) throws Exception {
		  
		  	  int ok;
		    try {
		     cn = ConexionDB.getConexion2020();
		      cn.setAutoCommit(false);
		      //int cod = generaCodigo();

		    int cod = generaCodigo();
		    t.setIdProveedor(cod);
		      
		      ps = cn.prepareCall(SQL_ADICIONAR);
		      // preparar los valores que le pasamos al sp
		      ps.setInt(1, t.getIdProveedor());
		      ps.setString(2, t.getRazonSocial());
		      ps.setString(3, t.getDireccion());
		      ps.setString(4, t.getRuc());
		      ps.setString(5, t.getTelefono());
			    
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
	 public int update(ProveedorTO t) throws Exception {
		  	 int ok;
	    try {
			cn = ConexionDB.getConexion2020();
			cn.setAutoCommit(false);
			cs = cn.prepareCall(SQL_ACTUALIZAR);
			cs.setInt(1, t.getIdProveedor());
			cs.setString(2, t.getRazonSocial());
			cs.setString(3, t.getDireccion());
		    cs.setString(4, t.getRuc());
		    cs.setString(5, t.getTelefono());
		    
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
		public int delete(ProveedorTO t) throws Exception {
			// TODO Auto-generated method stub
			return 0;
		}



		@Override
		public List<ProveedorTO> readAll() throws Exception {
			
						
			   lista = new ArrayList<>();
			   try { 
			     cn = ConexionDB.getConexion2020();
			     sql = "SELECT * FROM TB_PROVEEDORES";
			     stm = cn.createStatement();
			     //ejecutar comando
			     rs = stm.executeQuery(sql);
			     while (rs.next()) {
			       cat = new ProveedorTO();
			       cat.setIdProveedor(rs.getInt(1));
			       cat.setRazonSocial(rs.getString(2));
			       cat.setDireccion(rs.getString(3));
			       cat.setRuc(rs.getString(4));
			       cat.setTelefono(rs.getString(5));
			       lista.add(cat);
			     }
			     rs.close();
			     stm.close();
			   } catch (Exception e) {
			     throw e;
			   } finally {
			   }
			       return lista;
		}

		

		 @Override
		 public ProveedorTO find(Object t) throws Exception {
			 cat = null;
			 try {
				cn = ConexionDB.getConexion2020();
				ps = cn.prepareStatement("SELECT * FROM TB_PROVEEDORES WHERE PROV_IDPROVEEDOR=?");
				ps.setString(1, (String) t);
				rs = ps.executeQuery();
				if (rs.next()) {
					cat = new ProveedorTO();
					cat.setIdProveedor(Integer.parseInt(rs.getString(1)));
					cat.setRazonSocial(rs.getString(2));
					cat.setDireccion(rs.getString(3));
					cat.setRuc(rs.getString(4));
					cat.setTelefono(rs.getString(5));
					
				}
				rs.close();
				ps.close();
			} catch (SQLException e) {
				throw e;
			} finally {
			}
			 return cat;
		 }
	  
		
		
		
		
		
		
		
		@Override
		public List<ProveedorTO> readAll(Object t, int op) throws Exception {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ProveedorTO findA(Object t) throws Exception {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<ProveedorTO> readAllBuscar() throws Exception {
			// TODO Auto-generated method stub
			return null;
		}
}
