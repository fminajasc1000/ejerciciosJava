/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author franc
 */
public class SobrecargaConstructores {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan",12);
        System.out.println("persona1 = " + persona1); 
        
        Empleado empleado1 = new Empleado("Karla",30,1000);
        System.out.println("empleado1 = " + empleado1);
    }
    
}
