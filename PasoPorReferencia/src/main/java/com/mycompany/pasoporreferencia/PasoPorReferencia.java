/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pasoporreferencia;

/**
 *
 * @author franc
 */
public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona = new Persona();
        
        persona.cambiarNombre("Juan");
        System.out.println("Valor nombre: "+persona.obtenerNombre());
        
        modificarPersona(persona);
        System.out.println("Valor nombre Modif: "+persona.obtenerNombre());
    }

    private static void modificarPersona(Persona personaArg) {
        personaArg.cambiarNombre("Calos");
    }
}
