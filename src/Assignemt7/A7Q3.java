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
public class A7Q3 {
    public static int factors (int number){
        
        //output the factors
        System.out.println(number);
        return 0;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //   //create an object to run the methods
        A7Q3 test = new A7Q3 ();
        
        //create a scanner
        Scanner input = new Scanner (System.in);
        
        //ask the user to enter the number
        System.out.println("Please enter the number you want to factored: ");
        int numberX= input.nextInt();
        
        //for loo[ tp collect the numbers
        for (int i = numberX; i >0; i--){
            
            //divide the numbers
            if (numberX % i== 0){
                //output he factors
                factors (numberX/ i);
                
            }
                
            }
        }
        
    }
    

