/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author franc
 */
public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan");
    }
}

class Persona{
    String nombre;
    
    Persona(String nombre){
        this.nombre = nombre;
        System.out.println("Impresion del operador this dentro de la clase persona: "+this);//this apunta aun objeto de tipo persona en este momento
        Imprimir imprimir = new Imprimir();
        imprimir.imprimir(this);//this contiene una referencia al objeto persona
    }
}

class Imprimir{
    public void imprimir(Persona p){
        System.out.println("Impresion argunmento persona: "+p);//valor del objeto persona
        System.out.println("Impresion objeto actual (this)"+this);//this apunta a un objeto de tipo persona
    }
}