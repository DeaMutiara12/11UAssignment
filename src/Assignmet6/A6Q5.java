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
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // insert a scanner
        Scanner input = new Scanner (System.in);
        //ask the user how many students are in the class
        System.out.println("How many students are in the class?");
        
        //input the number of students
        int students = input.nextInt ();
        //ask the user to enter the marks
        System.out.println("Enter the mark of each students: ");
        
        //input the marks of the students
        double [] studentMarks = new double [students];
        //loop until the marks are typed
        for (int i= 0; i <studentMarks.length; i++){
            //insert the marks
            studentMarks [i]= input.nextDouble ();
        }
        //loop the numbers
        for (int i=0; i<studentMarks.length; i++){
            for (int j=0; j<(studentMarks.length-1);j++){
        
    }
            //if the median is an even number
            if (students %2==0){
     
             double median = studentMarks [students/2];
             //tell the user their median
                System.out.println("The median is " + median + "%");
               
            }
    
}
    
}
}
