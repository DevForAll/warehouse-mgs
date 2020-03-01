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
import com.mgps.almacen.entity.CategoriaTO;
import com.mgps.almacen.entity.EspecialidadTO;
import com.mgps.almacen.service.ICrudDao;

public class EspecialidadDAO implements ICrudDao<EspecialidadTO> {

	

	  CallableStatement cs = null;
	  Connection cn = null;
	  Statement stm = null;
	  PreparedStatement ps = null;
	  ResultSet rs = null;
	  String sql = null;
	  int ok;
	  List<EspecialidadTO> lista = null;
	  EspecialidadTO cat = null;
	  
	  private int generaCodigo() throws SQLException {
		    sql = "SELECT MAX(ESPE_IDCESPECIALIDAD)+ 1 FROM TB_ESPECIALIDAD    LIMIT 1; ";
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
	  
	  
	  final String SQL_ADICIONAR = "{call SP_ESPECIALIDAD_INSERTAR(?,?,?)}";

	  final String SQL_ACTUALIZAR = "{call SP_ESPECIALIDAD_ACTUALIZAR(?,?,?)}";
	  
	  @Override
	  public int create(EspecialidadTO t) throws Exception {
		  
		  	  int ok;
		    try {
		     cn = ConexionDB.getConexion2020();
		      cn.setAutoCommit(false);
		      //int cod = generaCodigo();

		    int cod = generaCodigo();
		    t.setIdEspecialidad(cod);
		      
		      ps = cn.prepareCall(SQL_ADICIONAR);
		      // preparar los valores que le pasamos al sp
		      ps.setInt(1, t.getIdEspecialidad());
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
	 public int update(EspecialidadTO t) throws Exception {
		  	 int ok;
	    try {
			cn = ConexionDB.getConexion2020();
			cn.setAutoCommit(false);
			cs = cn.prepareCall(SQL_ACTUALIZAR);
			cs.setInt(1, t.getIdEspecialidad());
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
	  public int delete(EspecialidadTO t) throws Exception {
	    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	  }

	

	@Override
	public List<EspecialidadTO> readAll() throws Exception {
		
					
		   lista = new ArrayList<>();
		   try {
		     cn = ConexionDB.getConexion2020();
		     sql = "SELECT * FROM TB_ESPECIALIDAD";
		     stm = cn.createStatement();
		     //ejecutar comando
		     rs = stm.executeQuery(sql);
		     while (rs.next()) {
		       cat = new EspecialidadTO();
		       cat.setIdEspecialidad(rs.getInt(1));
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
	 public EspecialidadTO find(Object t) throws Exception {
		 cat = null;
		 try {
			cn = ConexionDB.getConexion2020();
			ps = cn.prepareStatement("SELECT * FROM TB_ESPECIALIDAD WHERE ESPE_IDCESPECIALIDAD=?");
			ps.setString(1, (String) t);
			rs = ps.executeQuery();
			if (rs.next()) {
				cat = new EspecialidadTO();
				cat.setIdEspecialidad(Integer.parseInt(rs.getString(1)));
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
	public List<EspecialidadTO> readAll(Object t, int op) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EspecialidadTO findA(Object t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EspecialidadTO> readAllBuscar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
