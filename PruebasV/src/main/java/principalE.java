/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.io.*;
/**
 *
 * @author franc
 */
public class principalE {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int s0 = a;
            for(int j=0;j<n;j++){
                 s0 = s0 + ((int)Math.pow(2, j)*b);
                 System.out.print(" "+s0+" ");
            }
            System.out.println("");
        }
        in.close();
    }
}
