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
public class Persona {
    //Atributos
    String nombre;
    String apellido;
    
    //metodo de la clases
    //lo usaran los objetos de la clase
    public void desplegarNombres(){
        //cuerpo del metodo
        System.out.println("Nombre: "+nombre);
        System.out.println("apellido = " + apellido);
    }
}
