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
public class A7Q5 {
    public static void chaotic (int lineX){
        //make random number to create pattern
       for (int i= 0; i<lineX; i++){
        //random numbers from 1 to 5
           int randNum = (int)(Math.random ()* (5-1+1)) +1;
           
        
           
           //output asteriks on line
           if (randNum == 1){
               System.out.println("*");
           }
           if (randNum == 2){
               System.out.println("**");
           }
           if (randNum == 3){
               System.out.println("***");
           }
           if (randNum == 4){
               System.out.println("****");
           }
           if (randNum == 5){
               System.out.println("*****");
           }
       }
       
    }
       
       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create object to run the method
        A7Q5 test = new A7Q5();
        
        //create a scanner
        Scanner input = new Scanner (System.in);
        
        chaotic (5);
        
    }
    
}
