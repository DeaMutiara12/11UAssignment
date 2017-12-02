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
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  create a scanner
        Scanner input = new Scanner (System.in);
        //ask the user how many people there are
        System.out.println("How many people are there? ");
        //input the number of people
        int people = input.nextInt();
        //ask the user to enter thr height of each person
        System.out.println("Please enter the heights of each person that are in the group: ");
        
        //create a list of numbers of the people 
        double [] heights = new double [people];
        
        //input the heights of the people
        for (int i = 0; i < heights.length; i++){
            //input the heights
            heights [i]= input.nextDouble();
            
        }
        //get the total heights of the people
        double total= 0;
        
        //make a loop statement
        for (int i= 0; i< heights.length; i++){
            total =total + heights[i];
        }
        //find the average heights of the people
        double heightAverage= (total/ people);
        //round up the total
        heightAverage = Math.round (heightAverage * 100)/100;
        
        //output the average
        System.out.println("The average height is " + heightAverage);
        
                }
    }
    

