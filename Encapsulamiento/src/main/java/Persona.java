/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author franc
 */
public class Persona {
    private String name;
    private double sueldo;
    private boolean eliminado;
    
    public Persona(String nombre, double sueldo, boolean eliminado){
        this.name = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }
    
    public String getNombre(){
        return this.name;
    }
    
    public void setNombre(String nombre){
        this.name = nombre;
    }
    
    public double getSueldo(){
        return this.sueldo;
    }
    
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    
    public boolean getEliminado(){
        return this.eliminado;
    }
    
    public void setEliminado(boolean eliminado){
        this.eliminado = eliminado;
    }
    
//    public String toString(){
//        return "nombre: "+name+", sueldo: "+sueldo+", eliminado: "+eliminado;
//    }

    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", sueldo=" + sueldo + ", eliminado=" + eliminado + '}';
    }
    
    
}
