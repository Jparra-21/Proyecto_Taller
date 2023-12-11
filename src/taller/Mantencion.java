/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller;
import java.util.Date;
/**
 *
 * @author Javier Ignacio Parraguirre Lizarraga 20/10/23
 */
public class Mantencion {
    private int id;
    private Date fec_ing;
    private Date fec_sal;
    private boolean estado;
    private Vehiculo vehiculo;
    private String descripcion;
    private int kilometraje_man;

    public Mantencion() {
    }

    public Mantencion(int id, Date fec_ing, Date fec_sal, boolean estado, Vehiculo vehiculo, String descripcion, int kilometraje_man) {
        this.id = id;
        this.fec_ing = fec_ing;
        this.fec_sal = fec_sal;
        this.estado = estado;
        this.vehiculo = vehiculo;
        this.descripcion = descripcion;
        this.kilometraje_man = kilometraje_man;
    }

    public int getKilometraje_man() {
        return kilometraje_man;
    }

    public void setKilometraje_man(int kilometraje_man) {
        this.kilometraje_man = kilometraje_man;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFec_ing() {
        return fec_ing;
    }

    public void setFec_ing(Date fec_ing) {
        this.fec_ing = fec_ing;
    }

    public Date getFec_sal() {
        return fec_sal;
    }

    public void setFec_sal(Date fec_sal) {
        this.fec_sal = fec_sal;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    public boolean verificaEstado(int estado) {
        if (estado == 1){
            return true;
        }else {
            return false;
        }
    }
}