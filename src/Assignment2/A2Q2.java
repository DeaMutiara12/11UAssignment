/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author Donald
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City bali=new City ();
        
        //put a robot in the city
        Robot karel= new Robot (bali,2,1,Direction.EAST);
        
        //create new walls
        new Wall (bali,2,2,Direction.WEST);
        new Wall (bali,2,3,Direction.WEST);
        new Wall (bali,2,5,Direction.WEST);
        new Wall (bali,2,8,Direction.WEST);
        new Wall (bali,2,2,Direction.SOUTH);
        new Wall (bali,2,3,Direction.SOUTH);
        new Wall (bali,2,4,Direction.SOUTH);
        new Wall (bali,2,5,Direction.SOUTH);
        new Wall (bali,2,6,Direction.SOUTH);
        new Wall (bali,2,7,Direction.SOUTH);
        new Wall (bali,2,8,Direction.SOUTH);
        new Wall (bali,2,8,Direction.SOUTH);
        new Wall (bali,2,9,Direction.SOUTH);
        
        //create a thing
        new Thing (bali,2,9,Direction.EAST);
        
        //create a while loop
        while (!(karel.frontIsClear())){
        
        //make karel turn
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            
            //make karel move if front is clear
            while (karel.frontIsClear() && !karel.canPickThing()){ 
            
            //make karel move
            karel.move();
        }
            
            
            
            
            
            
        }
    }
    
}
