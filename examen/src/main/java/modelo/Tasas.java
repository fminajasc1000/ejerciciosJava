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
public class Tasas {
    private Integer plazo_min;
    private Integer plazo_max;
    private Float tasa_interes;

    public Tasas() {
    }

    public Tasas(Integer plazo_min, Integer plazo_max, Float tasa_interes) {
        this.plazo_min = plazo_min;
        this.plazo_max = plazo_max;
        this.tasa_interes = tasa_interes;
    }

    public Integer getPlazo_min() {
        return plazo_min;
    }

    public void setPlazo_min(Integer plazo_min) {
        this.plazo_min = plazo_min;
    }

    public Integer getPlazo_max() {
        return plazo_max;
    }

    public void setPlazo_max(Integer plazo_max) {
        this.plazo_max = plazo_max;
    }

    public Float getTasa_interes() {
        return tasa_interes;
    }

    public void setTasa_interes(Float tasa_interes) {
        this.tasa_interes = tasa_interes;
    }

    @Override
    public String toString() {
        return "Tasas{" + "plazo_min=" + plazo_min + ", plazo_max=" + plazo_max + ", tasa_interes=" + tasa_interes + '}';
    }

    
    
}
