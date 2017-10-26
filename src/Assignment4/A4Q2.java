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
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create a scanner for input
        Scanner input= new Scanner (System.in);
        
        //ask the person to input a measurement in inches
        System.out.println( " Please enter the measurement you wish to convert: ");
        
        //create a "double" so that it can be times by 2.54 cm
        double inchNumber= input.nextDouble(); 
        double cmNumber= inchNumber * 2.54 ;
        
        System.out.println(inchNumber + " inches is equal to " + cmNumber);
        
        
        
    }
}
