/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Casti
 */
public class Conexion {
    public static Connection conexion() {
        Connection con = null;
        String usuario = "root";
        String pass = "";
        String url = "jdbc:mysql://localhost:3306/claseprogra?useSSL=false";
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con=DriverManager.getConnection(url, usuario, pass);
        } catch (Exception ex) {
            System.out.println("Error en la conexion de la base de datos"+ex);
        }
        
        
        return con;
    }
}
