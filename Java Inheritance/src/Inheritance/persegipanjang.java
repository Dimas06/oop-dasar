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
public class persegipanjang {
    public void persegipanjang(){
        double pp,lep,lp,kp;
        Scanner d = new Scanner(System.in);
        System.out.println("PERSEGI PANJANG");
        System.out.println("===============");
        System.out.println("Masukkan Panjang : ");
        pp = d.nextDouble();      
        System.out.println("Masukkan Lebar : ");
        lep = d.nextDouble();      
        lp = pp*lep;
        kp = (2*pp)+(2*lep);
        System.out.println("Luas persegi Panjang adalah : "+lp);
        System.out.println("Keliling persegi Panjang adalah : "+kp);
    }
}
