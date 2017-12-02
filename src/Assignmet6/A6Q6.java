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
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner (System.in);
        
        //ask the user how many students there are in the class
        System.out.println("How many students are there in the class? ");
        
        //input the number of students in the class
        int students = input.nextInt();
        
        //ask the user to enter the percentage of each students' marks
        System.out.println("Please enter the marks, in percentage, of each students: ");
        
        //input the marks
        double [] numbs = new double [students];
        //loop until the marks are typed
        for (int i=0; i<numbs.length; i++){
            //insert the marks of the students
            numbs [i]= input.nextDouble ();
        }
        //loop it 10 times
        for (int i= 0; i<numbs.length; i++){
            //
            for (int j= 0; j<(numbs.length - 1); j++){
                //put th numbers in order if array is bigger than one
                if (numbs [j+1]> numbs[j]){
                    //make a temporary variable 
                    double temp= numbs [j+1];
                    numbs [j]= temp;
                }
            }
        }
        //order the numbers into ascending order
        for (int i = (numbs.length - 1); i> -1; i--){
            //tell the user about the percentage
            System.out.println("The highset mark is " + numbs [0] + "%.");
            
        }
    }
    
}
