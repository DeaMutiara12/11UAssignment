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
        //create a scanner
        Scanner input = new Scanner (System.in);
        
        //ask the user how many students there are in the class
        System.out.println("How many students are there in the class? ");
        
        //input the number of students in the class
        int students = input.nextInt();
        
        //make a list of marks
        int [] marks = new int [students];
        
        //ask he user to input the list of marks
        System.out.println("Pease enter the students marks: ");
        for (int i= 0; i< marks.length; i++){
            marks [i] = input.nextInt ();
        }
        //find the lowest mark and find the gighest mark
        int low= marks [0];
        int high= marks [0];
        //scan each mark
        for (int i= 0; i< marks.length; i++){
            if (marks [i]> high){
                high = marks [i];
                
                
            }else{
                if (marks [i]< low){
                    low = marks [i];
                }
                //print out the highest mark
                System.out.println("The highest mark is: " + high +"%");
                
                //print out the lowest mark
                System.out.println("The lowest mark is: " + low +"%");
                
                //calculate the total of all the marks
                int total= 0;
                for (int j=0;i<marks.length; i++){
                total = total + marks[i];
                
                }
            //calculate the average value
            double average = total /marks.length;
                System.out.println("The average mark is: " + average+ "%");
            
        }
        
        
        
        
    }
    
}
}
    


