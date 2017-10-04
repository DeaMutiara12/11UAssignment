/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import static becker.robots.Direction.EAST;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author Donald
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a new city 
        City bali= new City ();
                
        //create a robot
        Robot king=new Robot (bali,1,2,Direction.EAST); 
        
        //create castle
        new Wall (bali,1,1,Direction.NORTH);
        new Wall (bali,1,1,Direction.SOUTH);
        new Wall (bali,1,1,Direction.EAST);
        new Wall (bali,1,1,Direction.WEST);
        new Wall (bali,1,4,Direction.WEST);
        new Wall (bali,1,4,Direction.EAST);
        new Wall (bali,1,4,Direction.SOUTH);
        new Wall (bali,1,4,Direction.NORTH);
        new Wall (bali,4,1,Direction.NORTH);
        new Wall (bali,4,1,Direction.SOUTH);
        new Wall (bali,4,1,Direction.EAST);
        new Wall (bali,4,1,Direction.WEST);
        new Wall (bali,4,4,Direction.NORTH);
        new Wall (bali,4,4,Direction.SOUTH);
        new Wall (bali,4,4,Direction.EAST);
        new Wall (bali,4,4,Direction.WEST);
        new Wall (bali,2,2,Direction.NORTH);
        new Wall (bali,2,3,Direction.NORTH);
        new Wall (bali,3,2,Direction.SOUTH);
        new Wall (bali,3,3,Direction.SOUTH);
        new Wall (bali,2,3,Direction.EAST);
        new Wall (bali,3,3,Direction.EAST);
        new Wall (bali,2,2,Direction.WEST);
        new Wall (bali,3,2,Direction.WEST);
        
        //make king move forward one space
        king.move();
        
        //loop
        while (true){
            
            //move around the wall
            king.turnLeft ();
            king.move();
            
            //move forward
            king.turnLeft();
            king.turnLeft();
            king.turnLeft();
            king.move();
            king.move();
            
            //move around the corners
            king.turnLeft();
            king.turnLeft();
            king.turnLeft();
            king.move();
            king.move();
            king.turnLeft();
            king.turnLeft();
            king.turnLeft();
            
            //move closer to the castle
            king.move();
            king.turnLeft();
            king.move();
        }
        
        
        
        
        
        
    }
    
}
