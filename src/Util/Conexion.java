/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Javier Ignacio Parraguirre Lizarraga 20/10/23
 */
public class Conexion {
    public Connection conectarBD(String miBD) {
        String url = "jdbc:mysql://localhost:3306/duocdb";
        String username = "root";
        String password = "";
    
    Connection conexion = null;
    try {
        conexion = DriverManager.getConnection(url, username, password);
        System.out.println("Conexion Exitosa");
    
    } catch (Exception ex) {
        System.out.println(ex.getMessage());
    }   
        return conexion;
   } 
}
