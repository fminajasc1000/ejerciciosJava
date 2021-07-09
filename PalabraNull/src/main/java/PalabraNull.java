/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.HOSPITAL GENERAL TOPILEJO, Tetenco, San Miguel Topilejo, Tlalpan, 14500 Ciudad de México, CDMX
 */

/**
 *
 * @author franc
 */
public class PalabraNull {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
        System.out.println("persona1 = " + persona1.obtenerNombre());
        
        Persona persona2 = persona1;
        System.out.println("persona2 = " + persona2.obtenerNombre());
        
        persona1=null;
        
        //System.out.println("persona1 = " + persona1.obtenerNombre());
        if(persona1!=null){
            System.out.println("persona1 = " + persona1);
        }else{
            System.out.println("La variable persona1 no apunta a ningun objeto = ");
        }
    }
}

class Persona{
    String nombre;
    
    Persona(String nombre){
        this.nombre = nombre;
    }
    
    public String obtenerNombre(){
        return this.nombre;
    }
}
