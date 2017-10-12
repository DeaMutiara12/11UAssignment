/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizes;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author bakea2351
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city called Bali
        City bali= new City ();
        
        //create the walls for the robot to go*
        new Wall (bali,1,1,Direction.WEST);
        new Wall (bali,1,3,Direction.NORTH);
        new Wall (bali,1,4,Direction.NORTH);
        new Wall (bali,1,5,Direction.NORTH);
        new Wall (bali,1,6,Direction.NORTH);
        new Wall (bali,1,7,Direction.NORTH);
        new Wall (bali,1,7,Direction.EAST);
        new Wall (bali,1,7,Direction.SOUTH);
        new Wall (bali,1,6,Direction.SOUTH);
        new Wall (bali,1,5,Direction.SOUTH);
        new Wall (bali,1,4,Direction.SOUTH);
        new Wall (bali,1,3,Direction.SOUTH);
        
        //create a robot name Karel to clear out the mine
        Robot karel=new Robot (bali,1,1,Direction.EAST);
        
        //create the mine so that karel can clear
        new Thing (bali,1,3);
        new Thing (bali,1,4);
        new Thing (bali,1,5);
        new Thing (bali,1,6);
        new Thing (bali,1,7);
        
         //create a loop and count Things
      for (int count=0; count<7; count=count+1){
            
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.putThing();
        
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.putThing();
        
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.putThing();
                
        
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.putThing();
        karel.turnLeft();
        karel.turnLeft();
        
        karel.move();
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.putThing();
        karel.turnLeft();
        karel.turnLeft();
        
        
        
        
        
      
        
        
       

        
        
        
        
        
          //if karel does not have five things on his backpack go back and pick it up
        while(karel.countThingsInBackpack()!=5){
            
            
            
            
            
             
     
            
            
        
        
        
    }
}    
}
}

