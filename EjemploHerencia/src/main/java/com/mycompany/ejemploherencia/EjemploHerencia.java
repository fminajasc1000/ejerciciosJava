/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemploherencia;

import java.util.Date;

/**
 *
 * @author franc
 */
public class EjemploHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan",5000);
        empleado1.setEdad(28);
        empleado1.setGenero('H');
        empleado1.setDireccion("Juanito");
        System.out.println(empleado1);
        
        Cliente cliente1 = new Cliente(new Date(),true);
        cliente1.setNombre("Karla");
        System.out.println("cliente1 = " + cliente1);
    }
}
