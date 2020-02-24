package com.mgps.almacen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import com.mgps.almacen.entity.UsuarioTO;
import com.mgps.almacen.database.ConexionDB;


public class UsuarioDAO {

	
	

public UsuarioTO obtenerUsuario(UsuarioTO usu){
	
	UsuarioTO usuario = null;
	
	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	

		
		try {
		
			con = ConexionDB.getConexion2020();
		
			String sql = "select*from TB_USUARIO_2 where usuario = ? and clave =  ? ";
			
			pst = con.prepareStatement(sql);
			
			pst.setString(1, usu.getUsuario());
			pst.setString(2, usu.getClave());
			
			rs = pst.executeQuery();
			
			while (rs.next()) {
				usuario = new UsuarioTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				
			}
			
			
			
		} catch (Exception e) {
		System.out.println("Error en obtener usuario");
		}
		
		
		return usuario;
		
	}
		
	

}
