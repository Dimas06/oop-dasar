/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

/**
 *
 * @author dimas_06
 */
public class MyProfile2 {
     long Nim;
    String Name;
    
    public MyProfile2() {
        Nim= 201869040005L;
        Name = "zaenal dimas fadhilah";
}
     public static void main (String[] args) {
         MyProfile2 myProfile = new MyProfile2(); 
           System.out.println(myProfile.Nim + " " + myProfile.Name);
}
}
