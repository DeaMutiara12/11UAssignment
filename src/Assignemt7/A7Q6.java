/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignemt7;

import java.util.Scanner;

/**
 *
 * @author Donald
 */
public class A7Q6 {

    public static int lastDigit(int number) {
        //calculate the reminder 
        int lastDig = number % 10;

        //conditions when negative number becomes a positive
        if (lastDig < 0) {
            lastDig = lastDig * -1;
        }
        return lastDig;
    }
            /**
             * @param args the command line arguments
             */
    public static void main(String[] args) {
        // create an object to run the method
        A7Q6 test = new A7Q6 ();
        
        //create a scanner
        Scanner input = new Scanner (System.in);
        
        //ask the user for the number 
        System.out.println("Please enter the number: ");
        //input the variable
        int number = input.nextInt ();
        
        //
        int digitX = lastDigit (number);
        //tell the user about the last digit of the number
        System.out.println("The last digit for " + " " + number + " "+ "is " + " "+ digitX);

    }

}
