/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author franc
 */
public class EjemploEstatico {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
        System.out.println("persona1 = " + persona1);
        
        Persona persona2 = new Persona("Dana");
        System.out.println("persona2 = " + persona2);
        
        Persona persona3 = new Persona("Dana2");
        System.out.println("persona3 = " + persona3);
        
        System.out.println("contador = " + persona1.getContadorPersonas());
    }
}
