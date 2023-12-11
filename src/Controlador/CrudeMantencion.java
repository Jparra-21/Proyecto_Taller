/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Util.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import taller.Mantencion;
import taller.Vehiculo;

/**
 *
 * @author Danielç
 */
public class CrudeMantencion {
    public boolean Agregar(Mantencion man, Vehiculo vic) throws ParseException{
        Conexion con= new Conexion();
        Connection conn=con.conectarBD("duocdb");
        PreparedStatement stmt;
        String query ="INSERT into mantencion (fec_ing,fec_sal,estado,patente_vic, descripcion) values(?,?,?,?,?)";
        try {
            stmt = conn.prepareStatement(query);
            stmt.setDate(1, java.sql.Date.valueOf(new SimpleDateFormat("yyyy-mm-dd").format(man.getFec_ing())));
            stmt.setDate(2, java.sql.Date.valueOf(new SimpleDateFormat("yyyy-mm-dd").format(man.getFec_sal())));
            stmt.setBoolean(3, man.isEstado());
            stmt.setString(4, vic.getPatente());
            stmt.setString(5, man.getDescripcion());
            stmt.executeLargeUpdate();
            JOptionPane.showMessageDialog(null, "Mantencion Ingresada Correctamente!");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        } 
        
    }
    
    public Mantencion Buscar(int mant) throws ParseException{
        PreparedStatement stmt;
        ResultSet rs;
        Mantencion man = new Mantencion();
        Conexion con= new Conexion();
        CrudeVehiculo crudVic=new CrudeVehiculo();
        SimpleDateFormat formato=new SimpleDateFormat("dd-MM-yyyy");
        Connection conn=con.conectarBD("duocdb");
        String query =("SELECT * from mantencion where id=?");    
        try {
                stmt = conn.prepareStatement(query);
                stmt.setInt(1,mant);
                rs = stmt.executeQuery();
                while (rs.next()) {
                 man.setId(rs.getInt("id"));
                 String fechaen = formato.format(rs.getDate("fec_ing"));
                 man.setFec_ing(formato.parse(fechaen));
                 String fechasal = formato.format(rs.getDate("fec_sal"));
                 man.setFec_sal(formato.parse(fechasal));
                 man.setEstado(rs.getBoolean("estado"));
                 man.setVehiculo(crudVic.Buscar(rs.getString("patente_vic")));
                 man.setDescripcion(rs.getString("descripcion"));
                 }
                rs.close();
                stmt.close();
                return man;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
    
    public boolean Modificar(Mantencion man){
        Conexion con= new Conexion();
        Connection conn=con.conectarBD("duocdb");
        PreparedStatement stmt;
        String query ="UPDATE Mantencion SET fec_ing = ?, fec_sal = ?, estado = ?, descripcion = ? WHERE id =?";
        try {
            stmt = conn.prepareStatement(query);
            stmt.setDate(1, java.sql.Date.valueOf(new SimpleDateFormat("yyyy-mm-dd").format(man.getFec_ing())));
            stmt.setDate(2, java.sql.Date.valueOf(new SimpleDateFormat("yyyy-mm-dd").format(man.getFec_sal())));
            stmt.setBoolean(3, man.isEstado());
            stmt.setString(4,man.getDescripcion());
            stmt.setInt(5, man.getId());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Mantención Modificada Correctamente!");
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
        String query = "Delete from mantencion where `id`=?";
            try {
                stmt = conn.prepareStatement(query);
                stmt.setString(1, args);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Mantención Eliminada Correctamente!");
                return true;                
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }
    }
    
    public DefaultTableModel listaMantencion(){
        Statement stmt;
        ResultSet rs;
        Conexion con= new Conexion();
        Connection conn=con.conectarBD("duocdb");
        
        try {
            stmt = conn.createStatement(); 
            rs = stmt.executeQuery("select * from mantencion");
            DefaultTableModel tabla=new DefaultTableModel();
            tabla.addColumn("Id Mantencion");
            tabla.addColumn("Fecha Ingreso");
            tabla.addColumn("Fecha Salida");
            tabla.addColumn("Estado");
            tabla.addColumn("Descripcion");
            tabla.addColumn("Patente");
            Object[] fila=new Object[6];
            while (rs.next()) { 
                fila[0]=rs.getString(1);
                String fecha=new SimpleDateFormat("dd-MM-yyyy").format(rs.getDate(2));
                fila[1]=fecha;
                fecha=new SimpleDateFormat("dd-MM-yyyy").format(rs.getDate(3));
                fila[2]=fecha;
                fila[3]=rs.getBoolean(4);
                fila[4]=rs.getString(6);
                fila[5]=rs.getString(5);
                tabla.addRow(fila);
            }
            rs.close();
            stmt.close();
            return tabla;
        }catch(SQLException ex){
        return null;}
    }
}
