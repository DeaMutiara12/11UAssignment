/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignmet6;

import java.util.Scanner;

/**
 *
 * @author Donald
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner input= new Scanner (System.in);
        //create two list of numbers that the user can type
        int [] integers = new int [2];
        
        //ask the user to put 2 numbers
        System.out.println("Please enter 2 numbers: ");
        
        //input into variable 
        for (int i= 0; i<integers.length; i++){
            integers [i]= input.nextInt ();
        }
        //make conditions to be able to make the nmbers into the correct position
        if (integers [0] > integers [1]){
            
            
            //make a temporary variable
            int temp= integers [0];
            integers [0]= integers [1];
            integers [1]= temp;
        }
        //tell the user what the numbers are in ascending order
        System.out.println("Here are the numbers in ascending order: ");
        for (int i= 0; i<integers.length; i++){
            System.out.println(integers[i]);
        }
    }
    
}
