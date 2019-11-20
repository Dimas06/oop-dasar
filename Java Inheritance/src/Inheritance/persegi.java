/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;
import java.util.Scanner;

/**
 *
 * @author dimas_06
 */
public class persegi extends inheritance {
 
    public void persegi(){
        double sp,lp,kp;
        Scanner c = new Scanner(System.in);
        System.out.println("PERSEGI");
        System.out.println("=============");
        System.out.println("Masukkan sisi : ");
        sp = c.nextDouble();      
        lp = sp*sp;
        kp = 4*sp;
        System.out.println("Luas persegi adalah : "+lp);
        System.out.println("Keliling persegi adalah : "+kp);
    }   
}



    



