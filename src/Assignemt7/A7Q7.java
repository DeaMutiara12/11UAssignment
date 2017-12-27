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
public class A7Q7 {
    public static int firstDigit (int number){
        //set a starting divisor
        int divisorX = 1;
        
        //divide the number by 10
        while (number / divisorX >= 10){
            divisorX =10;
        }
        //make a condition if the number is a negavtive
        if (number < 0){
            number = number *-1;
        }
        return number /divisorX;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create an object to run the method
        A7Q7 test = new A7Q7();
        
        //create a scanner
        Scanner input = new Scanner (System.in);
        
        //ask the user to put a number in
        System.out.println("Please enter the number: ");
        int integerX= input.nextInt ();
        
        //create a methd
        int firstDig= firstDigit (integerX);
        //tell the user about the first digit number
        System.out.println("The first digit for " + integerX+ " " + "is" + " " + firstDig);
    }
    
}
