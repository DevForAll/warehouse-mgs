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
import com.mgps.almacen.service.ICrudDao;

public class MarcaDAO  implements ICrudDao<MarcaTO>{

	
	
	  Connection cn = null;
	  Statement stm = null;
	  PreparedStatement ps = null;
	  	  CallableStatement cs = null;
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
	  

	  final String SQL_ACTUALIZAR = "{call SP_MARCA_ACTUALIZAR(?,?,?)}";
	  
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
		  	 int ok;
	    try {
			cn = ConexionDB.getConexion2020();
			cn.setAutoCommit(false);
			cs = cn.prepareCall(SQL_ACTUALIZAR);
			cs.setInt(1, t.getIdMarca());
			cs.setString(2, t.getNombre());
			cs.setString(3, t.getDescripcion());
		
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
	  public int delete(MarcaTO t) throws Exception {
	    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	  }

	

	  

		@Override
		public List<MarcaTO> readAll() throws Exception {
			
						
			   lista = new ArrayList<>();
			   try { 
			     cn = ConexionDB.getConexion2020();
			     sql = "SELECT * FROM TB_MARCA";
			     stm = cn.createStatement();
			     //ejecutar comando
			     rs = stm.executeQuery(sql);
			     while (rs.next()) {
			       cat = new MarcaTO();
			       cat.setIdMarca(rs.getInt(1));
			       cat.setNombre(rs.getString(2));
			       cat.setDescripcion(rs.getString(3));
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
		 public MarcaTO find(Object t) throws Exception {
			 cat = null;
			 try {
				cn = ConexionDB.getConexion2020();
				ps = cn.prepareStatement("SELECT * FROM TB_MARCA WHERE MARC_IDMARCA=?");
				ps.setString(1, (String) t);
				rs = ps.executeQuery();
				if (rs.next()) {
					cat = new MarcaTO();
					cat.setIdMarca(Integer.parseInt(rs.getString(1)));
					cat.setNombre(rs.getString(2));
					cat.setDescripcion(rs.getString(3));
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
	public List<MarcaTO> readAll(Object t, int op) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public MarcaTO findA(Object t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<MarcaTO> readAllBuscar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}
