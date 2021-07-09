/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author franc
 */
public class SobrecargaMetodos {
    public static void main(String[] args) {
        System.out.println("Resultadfo 1: "+Operaciones.sumar(3, 4));
        
        System.out.println("Resultadfo 2: "+Operaciones.sumar(3D, 4D));
        
        System.out.println("Resultadfo 2: "+Operaciones.sumar(3, 4D));
        
        System.out.println("Resultadfo 2: "+Operaciones.sumar(3D, 4));
    }
}
