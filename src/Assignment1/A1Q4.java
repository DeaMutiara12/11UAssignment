/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author Amadea
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new city called Bali
        City bali=new City();
        
        //create a robot
        Robot karel=new Robot (bali,0,0,Direction.EAST);
        //change karel's color
        karel.setColor(Color.BLACK);
        
        //create another robot
        Robot bob=new Robot (bali,0,1,Direction.WEST);
        //change bob's color
        bob.setColor(Color.BLACK);
        
        //create new walls
        new Wall (bali,0,1,Direction.WEST);
        new Wall (bali,1,1,Direction.WEST);
        new Wall (bali,1,1,Direction.SOUTH);
        
        //have karel and bob turn
        karel.turnLeft();
        bob.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        
       //have karel and bob move
       karel.move();
       bob.move();
       bob.turnLeft();
       bob.move();
       bob.turnLeft();
       bob.turnLeft();
       bob.turnLeft();
       bob.move();
       karel.move();
       karel.turnLeft();
       bob.turnLeft();
       bob.turnLeft();
       bob.turnLeft();
       karel.move();
       bob.move();
    
   
       
       
      
      
        
        
        
        
    }
}

