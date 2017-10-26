/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author bakea2351
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner for input
        Scanner input = new Scanner(System.in);

        //Ask the student to enter their name 
        System.out.println(" Please enter your name: ");
        //use the scanner to input the name
        String firstName = input.nextLine();

        //Ask the student for their tests and the mark that they've achieved for test 1,2,3,4 and 5
        System.out.println("  What was the first test out of? ");
        double firstTest = input.nextInt();
        System.out.println(" What mark did you get?: ");
        double firstMark = input.nextInt();

        System.out.println(" What was the second test out of? ");
        double secondTest = input.nextInt();
        System.out.println(" What mark did you get? ");
        double secondMark = input.nextInt();

        System.out.println(" What was the third test out of? ");
        double thirdTest = input.nextInt();
        System.out.println(" What mark did you get? ");
        double thirdMark = input.nextInt();

        System.out.println(" What was the fourth test out of?: ");
        double fourthTest = input.nextInt();
        System.out.println(" What mark did you get?: ");
        double fourthMark = input.nextInt();

        System.out.println(" What was the fifth test out of? ");
        double fifthTest = input.nextInt();
        System.out.println(" What mark did you get?: ");
        double fifthMark = input.nextInt();

        //add space after getting the total marks
        System.out.println();
        
        //add the total mark of the first test in percentage
        double testOne = firstMark / firstTest;
        double firstFinal = testOne * 100;
        System.out.println(" Test 1 : " + firstFinal + " % ");

        //add space after getting the total marks
        System.out.println();
        //add the total mark of the second test in percentage
        double testTwo = secondMark / secondTest;
        double secondFinal = testTwo * 100;
        System.out.println(" Test 2: " + secondFinal + " % ");
        
        //add the total mark of the third test in percentage
        double testThree = thirdMark / thirdTest;
        double thirdFinal = testThree * 100; 
        System.out.println(" Test 3: " + thirdFinal + " % ");
        
        //add the total mark of the fourth test 
        double testFour = fourthMark / fourthTest;
        double fourthFinal = testFour * 100;
        System.out.println(" Test 4: " + fourthFinal + " % ");
        
        //add the total mark of the fifth test
        double testFive = fifthMark / fifthTest;
        double fifthFinal = testFive * 100;
        System.out.println(" Test 5: " + fifthFinal + " % ");
        
        //Add the 1st,2nd,3rd,4th,5th Final and devide it by 5 to get the total average
        double totalAdding= firstFinal + secondFinal + thirdFinal + fourthFinal + fifthFinal;
        double totalAverage= totalAdding / 5;
        System.out.println ( " The total Average is: " + totalAverage);
        















    }
}
