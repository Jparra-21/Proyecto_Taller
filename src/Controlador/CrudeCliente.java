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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import taller.Cliente;

/**
 *
 * @author Javier Ignacio Parraguirre Lizarraga 20/10/23
 */
public class CrudeCliente {
   
    public boolean Agregar(Cliente cli){
        cli.setRut(cli.VerificarRut(cli.getRut()));
        Conexion con= new Conexion();
        Connection conn=con.conectarBD("duocdb");
        PreparedStatement stmt;
        String query ="INSERT into cliente (rut,dv,nombre,ape1,ape2) values(?,?,?,?,?)";
        try {
            stmt = conn.prepareStatement(query);
            stmt.setString(1,cli.getRut());
            stmt.setString(2,cli.getDv());
            stmt.setString(3,cli.getNombre());
            stmt.setString(4, cli.getApe1());
            stmt.setString(5, cli.getApe2());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente Ingresado Correctamente!!!");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        } 
    }
     
    public Cliente Buscar(String args){
        Cliente cli = new Cliente();
        args = cli.VerificarRut(args);
        PreparedStatement stmt;
        ResultSet rs;
        Conexion con= new Conexion();
        Connection conn=con.conectarBD("duocdb");
        String query =("SELECT * from cliente where rut=?");
            try {
                stmt = conn.prepareStatement(query);
                stmt.setString(1,args);
                rs = stmt.executeQuery();
                 while (rs.next()) {
                 cli.setRut(rs.getString("rut"));
                 cli.setDv(rs.getString("dv"));
                 cli.setNombre(rs.getString("nombre"));
                 cli.setApe1(rs.getString("ape1"));
                 cli.setApe2(rs.getString("ape2"));
                 }
                rs.close();
                stmt.close();
                return cli;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
    
    public boolean Modificar(Cliente cli){
        Conexion con= new Conexion();
        Connection conn=con.conectarBD("duocdb");
        PreparedStatement stmt;
        String query ="UPDATE cliente SET rut = ?, dv = ?, nombre = ?, ape1 = ?, ape2 = ? WHERE rut =?";
        try {
            stmt = conn.prepareStatement(query);
            stmt.setString(1,cli.getRut());
            stmt.setString(2,cli.getDv());
            stmt.setString(3,cli.getNombre());
            stmt.setString(4, cli.getApe1());
            stmt.setString(5, cli.getApe2());
            stmt.setString(6, cli.getRut());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente Modificado Correctamente!!!");
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
        Cliente cli=new Cliente();
        args = args.substring(0, args.length()-1);
        args =cli.VerificarRut(args);
        String query = "Delete from cliente where `rut`=?";
            try {
                stmt = conn.prepareStatement(query);
                stmt.setString(1, args);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Cliente Eliminado Correctamente!!!");
                return true;                
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }
    }

    public DefaultTableModel listaClientes(){
        Statement stmt;
        ResultSet rs;
        Conexion con= new Conexion();
        Connection conn=con.conectarBD("duocdb");
        try {
            stmt = conn.createStatement(); 
            rs = stmt.executeQuery("select * from cliente");
            DefaultTableModel tabla=new DefaultTableModel();
            tabla.addColumn("Rut");
            tabla.addColumn("Nombre");
            tabla.addColumn("Apellidos");
            Object[] fila=new Object[3];
            while (rs.next()) { 
                fila[0]=rs.getString(1)+"-"+rs.getString(2);
                fila[1]=rs.getString(3);
                fila[2]=rs.getString(4)+" "+rs.getString(5);
                tabla.addRow(fila);
            }
            rs.close();
            stmt.close();
            return tabla;
        }catch(SQLException ex){
        return null;}
    }     
}
