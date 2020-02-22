package com.mgps.almacen.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConexionDB {
//	PROPIEDADES
	static String url;
	static String driver;
	static String user;
	static String clave;
	static Connection conn;
	
    // Metodo para leer el archivo de propiedades
    private static void leerPropiedades(String archivo){
//    	LEER ARCHIVO CONFIG
    	ResourceBundle config = ResourceBundle.getBundle(archivo);
//		Obtiene los datos del archivo    	
        url = config.getString("url");
        driver = config.getString("driver");
        user = config.getString("user");
        clave = config.getString("clave");
    }

    public static Connection getConnection() throws SQLException, ClassNotFoundException{
    	if (conn == null || conn.isClosed()) {
//		Leyendo archivo config
    		leerPropiedades("conn");
//		Registro del drivar (jar)
    		Class.forName(driver);
//		Realizando conexion
    		conn = DriverManager.getConnection(url, user, clave);
    	}
    	return conn;
    }
	
	private ConexionDB() throws SQLException, ClassNotFoundException{
		if (conn == null) {
			conn = getConnection();
		}
	}
}