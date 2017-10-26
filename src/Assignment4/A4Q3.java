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
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input
        Scanner input= new Scanner (System.in);
        
        //ask the user for the four numbers 
        System.out. println (" Please enter in 4 numbers on separate lines: ");
        
        //get the four numbers and add them to get the total numbers
        String firstNumber= input.nextLine();
        String secondNumber= input.nextLine();
        String thirdNumber= input.nextLine();
        String fourthNumber= input.nextLine();
        
        //Tell the user the four numbers that they used
        System.out.println (" Your numbers were, " + firstNumber + " , " + secondNumber + " , "  +thirdNumber+ " , " + fourthNumber);
        
      
        
    }
}
