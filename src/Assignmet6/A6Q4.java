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
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // insert new scanner
        Scanner input = new Scanner (System.in);
        
      //
      int [] marks = new int [10];
        
        //ask the user how many people are in the class
        System.out.println (" Enter the 10 marks: ");
        
        //make a for loop so that all the marks can be inserted
        for (int i= 0; i< marks.length; i++){
            //insert the marks 
            marks [i]= input.nextInt();
        }
        //make a for loop to loop it ten times
        for (int i= 0;i <10; i++){
            //loop
            for (int j =0; j<9; j++){
                //
                if  (marks[j]< marks [j+1]){
                    
                    //make a temporary integer
                    int temp = marks [j+1];
                    //swap the numbers
                    marks[j + 1]= marks [j];
                    marks [j]= temp;
              
                }
                System.out.println("Here are the numbers in the ascending order: ");
                System.out.println( marks [0]); 
                System.out.println( marks [1]);
                System.out.println(marks [2]);
                System.out.println( marks [3]);
                System.out.println( marks [4]);
                System.out.println( marks [5]);
                System.out.println( marks [6]);
                System.out.println( marks [7]);
                System.out.println( marks [8]);
                System.out.println( marks [9]);






    }
    
}
}
}

