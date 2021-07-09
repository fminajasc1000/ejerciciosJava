/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author franc
 */
public class Aritmetica {
    //atributos de la clase
    int a;
    int b;
    
    public Aritmetica(){
        System.out.println("Ejecutando constructor vacio");
    }
    
    public Aritmetica(int arg1, int arg2){
        a = arg1;
        b = arg2;
    }
    
    public int sumar(){
        return a + b;//se utilizan los atributos de la clase
    }
    
     public int restar(){
        return a - b;//se utilizan los atributos de la clase
    }
     
      public int multiplicar(){
        return a * b;//se utilizan los atributos de la clase
    }
      
    public int dividir(){
        return a / b;//se utilizan los atributos de la clase
    }
}
