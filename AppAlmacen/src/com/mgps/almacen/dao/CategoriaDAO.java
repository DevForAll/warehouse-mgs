package com.mgps.almacen.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import com.mgps.almacen.entity.CategoriaTO;
import com.mgps.almacen.service.ICrudDao;


import com.mgps.almacen.database.ConexionDB;



public class CategoriaDAO implements ICrudDao<CategoriaTO>  {
	
	  Connection cn = null;
	  Statement stm = null;
	  PreparedStatement ps = null;
	  CallableStatement cs = null;
	  ResultSet rs = null;
	  String sql = null;
	  int ok;
	  List<CategoriaTO> lista = null;
	  CategoriaTO cat = null;
	  final String SQL_ADICIONAR = "{call SP_CATEGORIA_INSERTAR(?,?,?)}";
	  final String SQL_ACTUALIZAR = "{call SP_CATEGORIA_ACTUALIZAR(?,?,?)}";
	  final String SQL_SELECT = "{CALL SP_CATEGORIA_LISTAR}";
	  
  private int generaCodigo() throws SQLException {
    sql = "SELECT MAX(CATE_IDCATEGORIA)+ 1 FROM TB_CATEGORIAS    LIMIT 1 ";
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
 public int create(CategoriaTO t) throws Exception {  
  	int ok;
    try {
     cn = ConexionDB.getConexion2020();
     cn.setAutoCommit(false);
     int cod = generaCodigo();
     t.setIdCategoria(cod);
      
     ps = cn.prepareCall(SQL_ADICIONAR);
     // preparar los valores que le pasamos al sp
     ps.setInt(1, t.getIdCategoria());
     ps.setString(2, t.getNombre());
     ps.setString(3, t.getDescripcion());
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
 public int update(CategoriaTO t) throws Exception {
	  	 int ok;
    try {
		cn = ConexionDB.getConexion2020();
		cn.setAutoCommit(false);
		cs = cn.prepareCall(SQL_ACTUALIZAR);
		cs.setInt(1, t.getIdCategoria());
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
 public List<CategoriaTO> readAll() throws Exception {
   lista = new ArrayList<>();
   try {
     cn = ConexionDB.getConexion2020();
     sql = "select * from TB_CATEGORIAS";
     stm = cn.createStatement();
     //ejecutar comando
     rs = stm.executeQuery(sql);
     while (rs.next()) {
       cat = new CategoriaTO();
       cat.setIdCategoria(rs.getInt(1));
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
 public int delete(CategoriaTO t) throws Exception {
	// TODO Auto-generated method stub
 	 return 0;
 }

 @Override
 public CategoriaTO find(Object t) throws Exception {
	 cat = null;
	 try {
		cn = ConexionDB.getConexion2020();
		ps = cn.prepareStatement("select * from TB_CATEGORIAS where CATE_IDCATEGORIA=?");
		ps.setString(1, (String) t);
		rs = ps.executeQuery();
		if (rs.next()) {
			cat = new CategoriaTO();
			cat.setIdCategoria(Integer.parseInt(rs.getString(1)));
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
 public List<CategoriaTO> readAll(Object t, int op) throws Exception {
	// TODO Auto-generated method stub
 	 return null;
 }	  
	  
}

