/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;

/**
 *
 * @author Javier Ignacio Parraguirre Lizarraga 20/10/23
 */
    public class Cliente {
    private String rut;
    private String dv;
    private String Nombre;
    private String ape1;
    private String ape2;

    public Cliente() {
    }

    public Cliente(String rut, String dv, String Nombre, String ape1, String ape2) {
        this.rut = rut;
        this.dv = dv;
        this.Nombre = Nombre;
        this.ape1 = ape1;
        this.ape2 = ape2;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApe1() {
        return ape1;
    }

    public void setApe1(String ape1) {
        this.ape1 = ape1;
    }

    public String getApe2() {
        return ape2;
    }

    public void setApe2(String ape2) {
        this.ape2 = ape2;
    }
    
}
