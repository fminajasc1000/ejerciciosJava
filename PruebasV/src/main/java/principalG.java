/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.*;
/**
 *
 * @author franc
 */
public class principalG {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int B=s.nextInt();
        int H=s.nextInt();
        if(B>0 && H>0){
            System.out.println(B*H);
        }else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
