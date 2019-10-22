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
public class MyClass {
    int x; // Create a class attribute
    
    //Create a class constructor for the MyClass class
    public MyClass() {
        x = 5; //Set the intial valuefor the class attribute x 
    }
     public static void main(String[] args) {
    MyClass myObj = new MyClass(); 
    System.out.println(myObj.x);
  }
}
