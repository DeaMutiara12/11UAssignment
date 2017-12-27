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
public class A7Q8 {
    public static void allDigitsOdd (int digNumber){
        for (int i = 0; i < digNumber/ 10; i++){
            
            //pull the number apart
            digNumber= digNumber/ 10;
            
            //see if the digiys are divisiable
            if (digNumber %2 == 0){
                //tell the user that there are even number
                System.out.println("True ");
            }else{
                //tell the user that there aren't any even number
                System.out.println("False");
            }
        }
        
    }
   
    //set a variable 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // craete an object to run the method
        A7Q8 test = new A7Q8();
        
        //create a scanner
        Scanner input = new Scanner (System.in);
        
        //ask the user to enter the number
        System.out.println("Please enter the number: ");
        
        //input the number
        int number = input.nextInt();
        //tell the user if it's an odd number or an even number
        allDigitsOdd (number);
    }
    
}
