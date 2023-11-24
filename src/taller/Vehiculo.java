/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Javier Ignacio Parraguirre Lizarraga 20/10/23
 */
public class Vehiculo {
    private String patente;
    private Date agno_fab;
    private String color;
    private String marca;
    private String modelo;
    private Cliente rut_cliente;

    public Vehiculo() {
    }

    public Vehiculo(String patente, Date agno_fab, String color, String marca, String modelo, Cliente rut_cliente) {
        this.patente = patente;
        this.agno_fab = agno_fab;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.rut_cliente = rut_cliente;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Date getAgno_fab() {
        return agno_fab;
    }

    public void setAgno_fab(Date agno_fab) {
        this.agno_fab = agno_fab;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Cliente getRut_cliente() {
        return rut_cliente;
    }

    public void setRut_cliente(Cliente rut_cliente) {
        this.rut_cliente = rut_cliente;
    }
    
<<<<<<< HEAD
=======
    public void ingresoVehiculo (Vehiculo vehiculo) throws ParseException{
        Scanner teclado=new Scanner(System.in);        
        System.out.print("Ingrese patente del vehiculo : ");
        String patente=teclado.nextLine();
        System.out.print("Ingrese fecha de fabricacion del vehiculo : ");
        //String agno_fab=teclado.nextLine();
        //System.out.print("Ingrese color del vehiculo : ");
        String color=teclado.nextLine();
        System.out.print("Ingrese marca del vehiculo : ");
        String marca=teclado.nextLine();
        System.out.print("Ingrese modelo del vehiculo : ");
        String modelo=teclado.nextLine();
        System.out.print("Ingrese RUT del dueño del vehiculo : ");
        
        this.setPatente(patente);
        //this.setAgno_fab(agno_fab);
        this.setColor(color); 
        this.setMarca(marca); 
        this.setModelo(modelo);
    }
>>>>>>> origin/master
}