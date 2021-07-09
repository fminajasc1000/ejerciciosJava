/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author franc
 */
public class PagosPendientes {
    private Integer plazo;
    private Float interes;
    private Float iva;
    private Float pago;
    private Prestamos prestamo;
    private Tasas tasa;

    public PagosPendientes() {
    }

    public PagosPendientes(Integer plazo, Float interes, Float iva, Float pago, Prestamos prestamo, Tasas tasa) {
        this.plazo = plazo;
        this.interes = interes;
        this.iva = iva;
        this.pago = pago;
        this.prestamo = prestamo;
        this.tasa = tasa;
    }

    public Integer getPlazo() {
        return plazo;
    }

    public void setPlazo(Integer plazo) {
        this.plazo = plazo;
    }

    public Float getInteres() {
        return interes;
    }

    public void setInteres(Float interes) {
        this.interes = interes;
    }

    public Float getIva() {
        return iva;
    }

    public void setIva(Float iva) {
        this.iva = iva;
    }

    public Float getPago() {
        return pago;
    }

    public void setPago(Float pago) {
        this.pago = pago;
    }

    public Prestamos getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamos prestamo) {
        this.prestamo = prestamo;
    }

    public Tasas getTasa() {
        return tasa;
    }

    public void setTasa(Tasas tasa) {
        this.tasa = tasa;
    }

    @Override
    public String toString() {
        return "PagosPendientes{" + "plazo=" + plazo + ", interes=" + interes + ", iva=" + iva + ", pago=" + pago + ", prestamo=" + prestamo + ", tasa=" + tasa + '}';
    }
    
    
}
