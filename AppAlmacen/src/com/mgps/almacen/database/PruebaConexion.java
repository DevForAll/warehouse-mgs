package com.mgps.almacen.database;

import java.sql.Connection;



public class PruebaConexion {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// prueba de coexion a la base de datos
		 Connection cn;
	        try {
	            cn= ConexionDB.getConnection();
	            System.out.println("Conexion exitosa...");
	        } catch (Exception e) {
	            System.out.println("Error :" + e.getMessage());
	        }
	}
}
