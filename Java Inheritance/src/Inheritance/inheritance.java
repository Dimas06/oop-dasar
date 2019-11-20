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
public class inheritance{ 
    public static void main(String[] args) {
        int pil;
        lingkaran l = new lingkaran();
        segitiga s = new segitiga();
        persegi p = new persegi();
        persegipanjang pp = new persegipanjang();
        Scanner inp = new Scanner(System.in);
        System.out.println("MENU");      
        System.out.println("====");      
        System.out.println("1. lingkaran");
        System.out.println("2. segitiga");      
        System.out.println("3. persegi ");      
        System.out.println("4. persegi panjang");      
        System.out.println("5. Exit");      
        System.out.print("Pilihan : ");
        pil = inp.nextInt();
        switch(pil){
            case 1 : l.lingkaran();
            case 2 : s.segitiga();
            case 3 : p.persegi();
            case 4 : pp.persegipanjang();
            case 5 : System.exit(0);break;
        }
    }   
}




