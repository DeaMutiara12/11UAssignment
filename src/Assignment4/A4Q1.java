/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author bakea2351
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //create a scanner for input
        Scanner input= new Scanner (System.in);
        
        //get the name from the person/user
        System.out.println (" Please enter your name: ");
        
        //use the scanner to input the name
        String firstName = input.nextLine();
        
        
       //output the vaeiable to the screen
        System.out.println(" Hello. How are you today? " + firstName);
        
        
       
    }
}
