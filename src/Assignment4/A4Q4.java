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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner for input
        Scanner input= new Scanner (System.in);
        
        //ask the user for how much the food, the DJ, renting the hall, decorations, staff, and the miscellaneous costs
        System.out. println (" How much does the food for prom cost? ");
        int firstCost= input.nextInt();
        
        System.out.println ( " How much the DJ cost? ");
        int secondCost= input.nextInt();
        
        
        System.out.println( " How much does it cost to rent the hall? ");
        int thirdCost= input.nextInt();
        
        
        System.out.println( " How much does decorations cost? ");
        int fourthCost= input.nextInt();
        
        
        System.out.println( " How much does it cost for staff?  ");
        int fifthCost= input.nextInt();
        
        
        System.out.println( " How much for miscellaneous costs? ");
        int sixthCost= input.nextInt();
        
        //add the totals for the expenses 
        int totalNumber = firstCost + secondCost + thirdCost +fourthCost+ fifthCost + sixthCost ;
        
        int ticketNumber= totalNumber /35;
        System.out.println (" The total cost is " + totalNumber + " You will need to sell " + ticketNumber+ " tickets "); 
}
}