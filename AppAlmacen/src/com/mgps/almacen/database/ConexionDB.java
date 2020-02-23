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
	

    private ConexionDB() throws SQLException, ClassNotFoundException{
    	if (conn == null) {
    		conn = getConnection();
    	}
    }
	
    public static Connection getConnection() 
            throws SQLException, ClassNotFoundException{
        if (conn == null || conn.isClosed()){
            // Leyendo del archivo .properties
            leerPropiedades("conn");
            // Registro del Driver
            Class.forName(driver);
            // Realizo la conexión
            conn = DriverManager.
                    getConnection(url, user, clave);
        }
        return conn;
    }
    
    // Metodo para leer el archivo de propiedades
    private static void leerPropiedades(String archivo){
        ResourceBundle recurso = 
                ResourceBundle.getBundle(archivo);
        url = recurso.getString("url");
        driver = recurso.getString("driver");
        user = recurso.getString("user");
        clave = recurso.getString("clave");
    }
}