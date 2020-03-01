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
import com.mgps.almacen.entity.EmpleadoTO;
import com.mgps.almacen.service.ICrudDao;


public class EmpleadosDAO implements ICrudDao<EmpleadoTO> {

	
	
	 Connection cn = null;
	  Statement stm = null;
	  PreparedStatement ps = null;
	  CallableStatement cs = null;
	  ResultSet rs = null;
	  String sql = null;
	  int ok;
	  List<EmpleadoTO> lista = null;
	  EmpleadoTO cat = null;
	  final String SQL_ADICIONAR = "{call SP_EMPLEADOS_INSERTAR(?,?,?,?,?,?)}";
	  final String SQL_ACTUALIZAR = "{call SP_EMPLEADOS_ACTUALIZAR(?,?,?,?,?,?)}";
	  
 private int generaCodigo() throws SQLException {
   sql = "SELECT MAX(EMPL_IDEMPLEADO)+ 1 FROM TB_EMPLEADOS    LIMIT 1 ";
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
	  
@Override
public int create(EmpleadoTO t) throws Exception {  
 	int ok;
   try {
    cn = ConexionDB.getConexion2020();
    cn.setAutoCommit(false);
    int cod = generaCodigo();
    t.setIdEmpleado(cod);
     
    ps = cn.prepareCall(SQL_ADICIONAR);
    // preparar los valores que le pasamos al sp
    ps.setInt(1, t.getIdEmpleado());
    ps.setString(2, t.getApellido());
    ps.setString(3, t.getNombre());
    ps.setString(4, t.getEmail());
    ps.setString(5, t.getDni());
  //  ps.setInt(6, t.getEspecialidad().getIdEspecialidad());
     ps.setInt(6, t.getCODEspecialidad());
    
    
    // ejecutar sp
    ok = ps.executeUpdate() == 1 ? 1 : 0;
    ps.close();
    cn.commit();// confirma que transaccion se realizado con exito
  } catch ( SQLException e) {
    try {
      cn.rollback();// deshace la transaccion
    } catch (Exception e1) {
    }
    throw e;
   } finally {
      //cn.close();
	}
   return ok;
}

 
  @Override
public int update(EmpleadoTO t) throws Exception {
	  	 int ok;
   try {
		cn = ConexionDB.getConexion2020();
		cn.setAutoCommit(false);
		cs = cn.prepareCall(SQL_ACTUALIZAR);
		cs.setInt(1, t.getIdEmpleado());
		cs.setString(2, t.getApellido());
		cs.setString(3, t.getNombre());
		cs.setString(4, t.getEmail());
		cs.setString(5, t.getDni());
		cs.setInt(6,t.getCODEspecialidad());
		//cs.setInt(6,t.getEspecialidad().getIdEspecialidad());
		
		// cs.setInt(6, t.getEspecialidad());
		
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
  public List<EmpleadoTO> readAll() throws Exception {
    lista = new ArrayList<>();
    try {
      cn = ConexionDB.getConexion2020();
      sql = "select * from TB_EMPLEADOS";
      stm = cn.createStatement();
      //ejecutar comando
      rs = stm.executeQuery(sql);
      while (rs.next()) {
        cat = new EmpleadoTO();
        cat.setIdEmpleado(rs.getInt(1));
        cat.setApellido(rs.getString(2));
        cat.setNombre(rs.getString(3));
        cat.setEmail(rs.getString(4));
        cat.setDni(rs.getString(5));
       cat.setCODEspecialidad(rs.getInt(6));
        
       // cat.getEspecialidad().getIdEspecialidad().getInt(6);
        
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
  public EmpleadoTO find(Object t) throws Exception {
 	 cat = null;
 	 try {
 		cn = ConexionDB.getConexion2020();
 		ps = cn.prepareStatement("SELECT * FROM TB_EMPLEADOS WHERE EMPL_IDEMPLEADO=?");
 		ps.setString(1, (String) t);
 		rs = ps.executeQuery();
 		if (rs.next()) {
 			cat = new EmpleadoTO();
 			cat.setIdEmpleado(Integer.parseInt(rs.getString(1)));
 			cat.setApellido(rs.getString(2));
 			cat.setNombre(rs.getString(3));

 			cat.setEmail(rs.getString(4));
 			cat.setDni(rs.getString(5));
 			cat.setCODEspecialidad(Integer.parseInt(rs.getString(6)));
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
public int delete(EmpleadoTO t) throws Exception {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public List<EmpleadoTO> readAll(Object t, int op) throws Exception {
	// TODO Auto-generated method stub
	return null;
}

@Override
public EmpleadoTO findA(Object t) throws Exception {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<EmpleadoTO> readAllBuscar() throws Exception {
	// TODO Auto-generated method stub
	return null;
}
  
	
}
