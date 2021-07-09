/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author franc
 */
public class Operaciones {
    //
    public static int sumar(int a, int b){
        System.out.println("Metodo sumar (int, int)");
        return a + b;
    }
    
    //sobrecarga del metodo sumar
    public static double sumar(double a, double b){
        System.out.println("Metodo sumar (double, double)");
        return a + b;
    }
    
    public static double sumar(int a, double b){
        System.out.println("Metodo sumar (int, double)");
        return a + b;
    }
    
    public static double sumar(double a, int b){
        System.out.println("Metodo sumar (double a, int b) ");
        return a + b;
    }
}
