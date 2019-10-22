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
public class MyProfile {
    long modelNim;
    String modelName;
    
    public MyProfile(long year, String Name) {
        modelNim= year;
        modelName = Name;
    }       
     public static void main (String[] args) {
         MyProfile myProfile = new MyProfile(201869040005L,"zaenal dimas fadhilah"); 
           System.out.println(myProfile.modelNim + " " + myProfile.modelName);
        }
    }

