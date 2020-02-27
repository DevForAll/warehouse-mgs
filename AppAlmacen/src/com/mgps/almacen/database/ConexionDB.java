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
	static Connection cone;
	

		
   // private ConexionDB() throws SQLException, ClassNotFoundException{
   // 	if (conn == null) {
    //		conn = getConnection();
    ///	}
   // }
	
    public static Connection getConnection()  throws SQLException, ClassNotFoundException{
        if (cone == null || cone.isClosed()){
            // Leyendo del archivo .properties
            leerPropiedades("conn");
            // Registro del Driver
            Class.forName(driver);
            // Realizo la conexiÃ³n
            
            cone = DriverManager.getConnection(url, user, clave);
            
                       
                        
        }
        return cone;
    }
    
    // Metodo para leer el archivo de propiedades
    private static void leerPropiedades(String archivo){
        ResourceBundle recurso =   ResourceBundle.getBundle(archivo);
        url = recurso.getString("url");
        driver = recurso.getString("driver");
        user = recurso.getString("user");
        clave = recurso.getString("clave");
    }
    
    
    public static Connection getConexion2020() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://db4free.net:3306/bdmgsalmacen?useSSL=false";
			String usr = "usermgsolutions";
			String psw = "Rampwd@123";
			
			con = DriverManager.getConnection(url, usr, psw);
			
		} catch (ClassNotFoundException e) {
			System.out.println("Error >> Driver no Instalado!!");
		} catch (SQLException e) {
			System.out.println("Error >> de conexión con la BD");
		}
		return con;
	}
}