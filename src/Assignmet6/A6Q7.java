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
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input
        Scanner input = new Scanner (System.in);
        
        //create a list of integers
        int [] numbs = new int [1000];
        //tell the user about the prime numbers
        System.out.println (" 2 ");
        System.out.println (" 3 ");
        System.out.println (" 5 ");
        System.out.println (" 7 ");
        //craete a for loop
        for (int i = 0; i<1000; i++){
            numbs [i]= i;
            
            //delete one
            if (numbs [i]==1){
        }else{
                //delete any multiple of two
                if (numbs [i]%2 == 0){
            }else{
                    //delete multiples of three
                    if (numbs [i]%3 == 0){
                }else{
                        //dlete any multiples of 5
                        if (numbs [i]%5== 0){
                            
                        }else{
                            if (numbs [i]%7 == 0){
                        }else{
                                //print out the prime numbers
                                System.out.println(" Here are the prime numbers "+ numbs[i]);
                            }
                    }
        
       
    }
    
}
            }
        }
    }
}
        
