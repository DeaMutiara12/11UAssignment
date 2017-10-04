/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author bakea2351
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City bali = new City();

        //create a robot to plant a field
        Robot karel = new Robot(bali, 1, 1, Direction.EAST, 20);

        
        //create a loop and count Things
      for (int count=0; count<2; count=count+1){
          
       //make karel move and put things down to make his field
          karel.putThing();
          karel.move();
          karel.putThing();
          karel.move();
          karel.putThing();
          karel.move();
          karel.putThing();
          karel.move();
          karel.putThing();
          
          karel.turnLeft();
          karel.turnLeft();
          karel.turnLeft();
          karel.move();
          karel.turnLeft();
          karel.turnLeft();
          karel.turnLeft();
          
          karel.putThing();
          karel.move();
          karel.putThing();
          karel.move();
          karel.putThing();
          karel.move();
          karel.putThing();
          karel.move();
          karel.putThing();
          
          karel.turnLeft();
          karel.move();
          karel.turnLeft();
          
          
          
       
       


            
    }
}
}
