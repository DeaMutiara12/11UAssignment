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
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner for input
        Scanner input = new Scanner(System.in);

        //Ask the user for the speed limit
        System.out.println(" Enter the speed limit: ");
        int speedLimit = input.nextInt();
        System.out.println(" Enter the recorded speed of the car: ");
        int driverLimit = input.nextInt();



        //If the driver is within the speed limit
        if (driverLimit < speedLimit) {
            System.out.println(" Congratulations, you are within the speed limit! ");

            //If the speed limit is 20+ then the driver should be charged a $100
            int twentyOver = speedLimit + 20;
            if (twentyOver < speedLimit) {
                System.out.println(" You are speeding and your fine is $100 ");


                //If the speed limit is 30+ then the driver should get a fine of $270
                int thirtyOver = speedLimit + 30;
                if (thirtyOver < speedLimit) {
                    System.out.println(" You are speeding and your fine is $270 ");

                    //If the speed limit is over 31 and above
                    if (thirtyOver > speedLimit) {
                        System.out.println(" You are speeding and your fine is $500 ");

                    }


                }














            }
        }
    }
}