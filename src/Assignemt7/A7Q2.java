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
public class A7Q2 {
    public static int examGrade (String grade){
        
        //tell the user
        System.out.println("You have a/an " + grade);
        //send back the answer
        return 0;
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create an object to run the methods
        A7Q2 test = new A7Q2 ();
        
        //create a scanner
        Scanner input = new Scanner (System.in);
        
        //ask the user to enter the marks
        System.out.println("Please enter the mark: ");
        int grade = input.nextInt();
        
        //if the grade is lower than 50
        if (grade <50){
            //output an F
            examGrade ("F");
        }else{
            if (grade >= 50 && grade <= 59){
                //output a D
                examGrade ("D");
            }else{
                if (grade >= 60 && grade  <= 69){
                    //output a C
                    examGrade ("C");
                }else{
                    if (grade >=70 && grade <=79){
                        //output a B
                        examGrade ("B");
                        
                    }else{
                        if (grade >=80){
                            //output an A
                            examGrade ("A");
                        }
                    }
                }
            }
        }
        
        
    }
    
}
