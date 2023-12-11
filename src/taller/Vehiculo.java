/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

/**
 *
 * @author Javier Ignacio Parraguirre Lizarraga 20/10/23
 */
public class Vehiculo {
    private String patente;
    private int agno_fab;
    private String color;
    private String marca;
    private String modelo;
    private Cliente rut_cliente;
    private int kilometraje;
    private String vin;
    

    public Vehiculo() {
    }

    public Vehiculo(String patente, int agno_fab, String color, String marca, String modelo, Cliente rut_cliente, int kilometraje, String vin) {
        this.patente = patente;
        this.agno_fab = agno_fab;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.rut_cliente = rut_cliente;
        this.vin = vin;
        this.kilometraje = kilometraje;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getAgno_fab() {
        return agno_fab;
    }

    public void setAgno_fab(int agno_fab) {
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
    
    }
