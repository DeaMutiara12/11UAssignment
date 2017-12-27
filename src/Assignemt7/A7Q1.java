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
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static double circleArea (double radius){
        double sSquared = Math.pow (radius, 2);
        double area =Math.PI*sSquared;
        return area;
        
    }
    public static void main(String[] args) {
       // create object to run the method
        A7Q1 test = new A7Q1();
        // create a new scanner
        Scanner input = new Scanner (System.in);
        //ask the user to enter the radius
        System.out.println("Enter the radius of the circle in cm: ");
        
        //input the radius of the circle
        double radius = input.nextDouble ();
        //calculate the answer of the area
        double areaAnswer= circleArea (radius);
        
        //round the answer
        areaAnswer = Math.round (areaAnswer * 100.0)/100.0;
        //output the answer
        System.out.println("The area is " +areaAnswer + "cm squared");
        
        
        
    }
    
}
