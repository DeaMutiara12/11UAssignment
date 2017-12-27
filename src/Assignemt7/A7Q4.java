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
public class A7Q4 {
    public static double compoundInterest (double principal, double interest, int years){
        
        double P = principal;
        double r= interest;
        int n= years;
        //calculate the powet for the numbers of years
        double power = Math.pow(1+ interest, years);
        //calculate the interest rate
        double balance = principal * power;
        balance = Math.round (balance);
        
        //output the calculations
        System.out.println("Your compound interest is " + balance);
        
        return balance;
        
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  // create object to run the method
        A7Q4 test = new A7Q4();
        
        //create a scanner
        Scanner input = new Scanner (System.in);
        
        //ask the user for the principal
        System.out.println("Please enter the initial principal: ");
        //input the new principle
        double initialP = input.nextDouble ();
        
        //ask the user for the interest rate
        System.out.println("Please enter the interest rate: ");
        //nput the intereset rate
        double intialr = input.nextDouble();
       
        //ask the user for the numbers of years
        System.out.println("Please enter the number of years: ");
        //input the years
        int numn = input.nextInt();
        
        //calculate rge compund inttrest
        double newBalance = compoundInterest (initialP, intialr, numn);
        
       
     
       
        
    }
    
}
