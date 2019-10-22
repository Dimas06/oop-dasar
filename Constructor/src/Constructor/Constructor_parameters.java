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
public class Constructor_parameters {
    int x;

  public Constructor_parameters(int y) {
    x = y;
  }

  public static void main(String[] args) {
   Constructor_parameters myObj = new Constructor_parameters(5);
    System.out.println(myObj.x);
  }
}

