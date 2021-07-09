/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author franc
 */
public class PalabraReturnClases {
    public static void main(String[] args) {
        Suma s = creaObjetoSuma();
        System.out.println("Resultado suma: "+s.sumar());
    }
    
    private static Suma creaObjetoSuma(){
        return new Suma(4,6);
    }
}

class Suma{
    int a;
    int b;
    
    public Suma(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    public int sumar(){
        return this.a + this.b;
    }
}