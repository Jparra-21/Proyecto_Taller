/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import taller.Cliente;
import taller.Vehiculo;

/**
 *
 * @author Javier Ignacio Parraguirre Lizarraga 20/10/23
 */
public class CrudeVehiculo {
    public boolean Agregar(Vehiculo vic, Cliente cli) throws ParseException{
        Conexion con= new Conexion();
        Connection conn=con.conectarBD("duocdb");
        PreparedStatement stmt;
        String query ="INSERT into vehiculo (patente,agno_fab,color,marca,modelo,rut_cliente) values(?,?,?,?,?,?)";
        try {
            stmt = conn.prepareStatement(query);
            stmt.setString(1,vic.getPatente());
            stmt.setDate(2, java.sql.Date.valueOf(new SimpleDateFormat("yyyy").format(vic.getAgno_fab())));
            stmt.setString(3,vic.getColor());
            stmt.setString(4, vic.getMarca());
            stmt.setString(5, vic.getModelo());
            stmt.setObject(6, vic.getRut_cliente());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "VehiculoIngresado Correctamente!!!");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        } 
        
    }
    
     
    public Vehiculo Buscar(String args){
        Statement stmt;
        ResultSet rs;
        Vehiculo vic = new Vehiculo();
        Conexion con= new Conexion();
        Connection conn=con.conectarBD("duocdb");
            try {
                stmt = conn.createStatement(); 
                rs = stmt.executeQuery("SELECT * from vehiculo where patente ="+args);
                 while (rs.next()) {
                 vic.setPatente(rs.getString("patente"));
                 vic.setAgno_fab(rs.getDate("agno_fab"));
                 vic.setColor(rs.getString("color"));
                 vic.setMarca(rs.getString("marca"));
                 vic.setModelo(rs.getString("modelo"));
                 vic.setRut_cliente((Cliente) rs.getObject("rut_cliente"));
                 }
                rs.close();
                stmt.close();
                return vic;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
    
    public boolean Modificar(Vehiculo vic){
        Conexion con= new Conexion();
        Connection conn=con.conectarBD("duocdb");
        PreparedStatement stmt;
        String query ="UPDATE vehiculo SET patente = ?, agno_fab = ?, color = ?, marca = ?, modelo = ?, rut_cliente = ? WHERE patente =?";
        try {
            stmt = conn.prepareStatement(query);
            stmt.setString(1,vic.getPatente());
            stmt.setDate(2, java.sql.Date.valueOf(new SimpleDateFormat("yyyy").format(vic.getAgno_fab())));
            stmt.setString(3,vic.getColor());
            stmt.setString(4, vic.getMarca());
            stmt.setString(5, vic.getModelo());
            stmt.setObject(6, vic.getRut_cliente());
            stmt.setString(7, vic.getPatente());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Vehiculo Modificado Correctamente!!!");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        } 
    }

    public boolean Eliminar(String args){
        Conexion con= new Conexion();
        Connection conn=con.conectarBD("duocdb");
        PreparedStatement stmt;
        String query = "Delete from vheiculo where `patente`=?";
            try {
                stmt = conn.prepareStatement(query);
                stmt.setString(1, args);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "vehiculo Eliminado Correctamente!!!");
                return true;                
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }
    }

    public DefaultTableModel listaVehiculo(){
        Statement stmt;
        ResultSet rs;
        Conexion con= new Conexion();
        Connection conn=con.conectarBD("duocdb");
        try {
            stmt = conn.createStatement(); 
            rs = stmt.executeQuery("select * from vehiculo");
            DefaultTableModel tabla=new DefaultTableModel();
            tabla.addColumn("Rut Dueño");
            tabla.addColumn("Patente");
            tabla.addColumn("Informacion");
            Object[] fila=new Object[3];
            while (rs.next()) { 
                fila[0]=rs.getString(6);
                fila[1]=rs.getString(1);
                fila[2]=rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5);
                tabla.addRow(fila);
            }
            rs.close();
            stmt.close();
            return tabla;
        }catch(SQLException ex){
        return null;}
    }
}