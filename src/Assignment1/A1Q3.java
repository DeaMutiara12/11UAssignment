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
 * @author bakea2351
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new city called kitchener
        City kitchener= new City ();
        
        //create new walls
        new Wall (kitchener, 3,2,Direction.WEST);
        new Wall (kitchener, 3,2,Direction.NORTH);
        new Wall (kitchener,2,3,Direction.WEST);
        new Wall (kitchener,1,3,Direction.WEST);
        new Wall (kitchener,1,3,Direction.NORTH);
        new Wall (kitchener,1,3,Direction.EAST);
        new Wall (kitchener,2,4,Direction.NORTH);
        new Wall (kitchener,2,4,Direction.EAST);
        new Wall (kitchener,3,4,Direction.EAST);
        
        //create a thing
        new Thing (kitchener,3,1);
        //create a robot
        Robot karel=new Robot (kitchener,3,0,Direction.EAST);
      
        
        //move to the thing
        karel.move();
        
        //change karel's color
        karel.setColor(Color.BLACK);
        
        //have karel pick up the thing
        karel.pickThing();
        //have karel turn
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        
        
        
      
        //have karel drop the thing
        karel.putThing();
        
       //have karel move
       karel.move();
       karel.turnLeft();
       karel.turnLeft();
       karel.turnLeft();
       karel.move();
       karel.turnLeft();
       karel.move();
       karel.turnLeft();
       karel.turnLeft();
       karel.turnLeft();
       karel.move();
       karel.move();
       karel.move();
  
        
       
    }
}
