/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author Donald
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // import scanner for input
        Scanner input = new Scanner (System.in);
        
        //put the player on square number one
        int one = +1;
        
        //ask the player the sum of the dice
        System.out.println (" Enter the sum of dice ");
        
        //
        int roll = input.nextInt ();
        
        //you have to calculate the spot to go 
        one = one + roll; 
        
        //tell the player what spot they are currently on
        System.out.println ( " You are now in square one " + one);
        
        //create a while loop and ask the player to enter the number of the dice
        while (true){
            System.out.println ( " Enter the sum of dice: " );
            
            //if the player put the number 0 they ave quit the game
            if (roll == 0){
                System.out.println ( " You Quit! ");
                break;
                
                
            }else{
                //the player have to move if they rolls between 2-12
                if ( roll>= 2 && roll <= 12 );
                {
                    
                    //player have to move 
                    int square = input.nextInt();
                    one = one + roll;
                    square = square + one; 
                            
                    //if the player have landed on a snake and lands on 54 move the player to number 19
                    if (square == 54){
                        square= square - 35;
                        
                    }
                    // if the player landed on 90 then the player have to be move to 48
                    if (square == 90){
                        square= square - 42;
                        
                    }
                    //if the player lands on 99 move the player to 77
                    if (square == 99){
                        square= square - 22;
                        
                    }
                    //if the player lands on ladder and if the player lands on 9 move the player to 34
                    if (square == 9){
                        square= square + 25;
                    }
                    //if the player lands on 40 move to 64
                    if (square == 40){
                        square= square + 24;
                    }
                    //if the player lands on 67 move to 86
                    if (square == 67){
                        square= square + 19;
                    }
                }
            
            
          
        }
        
        
        
    }
    
}
}