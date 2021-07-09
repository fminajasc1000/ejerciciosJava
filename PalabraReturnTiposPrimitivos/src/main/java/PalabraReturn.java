/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author franc
 */
public class PalabraReturn {
    
    public static void main(String[] args) {
        sumarSinRetornarValor(3,6);
        System.out.println("valor = " + sumarRetornandoValor(0,0));
    }

    private static void sumarSinRetornarValor(int a, int b) {
        System.out.println("Sumar sin retornar valor; "+(a+b));
        return;//opcional
    }
    
    private static int sumarRetornandoValor(int a, int b){
        if(a == 0 && b == 0){
            System.out.println("Proporcione numeros distintos de cero");
            return 0;
        }
        return a+b;
    }
}
