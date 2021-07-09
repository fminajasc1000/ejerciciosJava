/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author franc
 */
public class Prestamos {
    private String cliente;
    private String id;
    private Date fecha;
    private Float monto;
    private String estado;

    public Prestamos(String cliente, String id, Date fecha, Float monto, String estado) {
        this.cliente = cliente;
        this.id = id;
        this.fecha = fecha;
        this.monto = monto;
        this.estado = estado;
    }

    public Prestamos() {
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Prestamos{" + "cliente=" + cliente + ", id=" + id + ", fecha=" + fecha + ", monto=" + monto + ", estado=" + estado + '}';
    }
    
}
