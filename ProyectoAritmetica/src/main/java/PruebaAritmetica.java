/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author franc
 */
public class PruebaAritmetica {
    public static void main(String[] args) {
        //Creamos un objejo de tipo aritmetica
        Aritmetica aritmetica = new Aritmetica(1,2);
        
        System.out.println("aritmeticaSumar = " + aritmetica.sumar());
        System.out.println("aritmeticaRestar = " + aritmetica.restar());
        System.out.println("aritmeticaMultiplicar = " + aritmetica.multiplicar());
        System.out.println("aritmeticaDividir = " + aritmetica.dividir());
        
    }
}
