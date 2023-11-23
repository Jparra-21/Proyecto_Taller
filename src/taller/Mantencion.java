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

    public Mantencion() {
    }

    public Mantencion(int id, Date fec_ing, Date fec_sal, boolean estado, Vehiculo vehiculo) {
        this.id = id;
        this.fec_ing = fec_ing;
        this.fec_sal = fec_sal;
        this.estado = estado;
        this.vehiculo = vehiculo;
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
    
    
}
