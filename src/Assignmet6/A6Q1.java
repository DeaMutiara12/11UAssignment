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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input
        Scanner input= new Scanner (System.in);
        
        //Ask the user for how many students are there in the class
        System.out.println (" How many students are in the class? ");
        
        //
        int students = input.nextInt();
        
        //input the perccentage of the marks of the students
        double [] studentmark = new double [students];
        
        //tell the user to enter the marks
        System.out.println (" Enter the marks: ");
        //make a for loop
        for (int i = 0; i<studentmark.length;i++){
            studentmark [i]= input.nextDouble();
        }
        //get the total marks
        double total= 0;
        for (int i= 0; i<studentmark.length;i++){
            total= total + studentmark[i];
        }
        //find the class average
        double average = (total/students);
        
        //do the math
        average = Math.round (average*100)/100;
        
        //Output the average
        System.out.println (" The class average is " + average+ "%");
        
    }
    
}
