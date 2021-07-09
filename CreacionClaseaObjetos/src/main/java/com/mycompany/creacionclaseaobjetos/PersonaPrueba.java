/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.creacionclaseaobjetos;

/**
 *
 * @author franc
 */
public class PersonaPrueba {
    public static void main(String args[]) {
        //creacion del objeto
        Persona p1 = new Persona();
        //modificar valores
        p1.desplegarNombres();
        System.out.println("");
        //modificamos los valores de los atributos del objeto persona
        p1.nombre = "Hello";
        p1.apellido = "Moto";
        p1.desplegarNombres();
        
        //creacion de un segundo objeto de tipo persona
        Persona persona2 = new Persona();
        persona2.nombre="Karla";
        persona2.apellido = "Domingez";
        System.out.println("");
        persona2.desplegarNombres();
    }
}
