/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author Donald
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City bali=new City ();
        
        //create a new robot
        Robot karel=new Robot (bali,3,3,Direction.EAST);
        
               
        //make karel move to 0,0 if avenue is less than 0
        while(karel.getDirection()!= Direction.NORTH)
        
        //make karel turn
        karel.turnLeft();
        
        while (karel.getStreet ()!=0)
            
            //make karel move
            karel.move();
        while (karel.getDirection ()!=Direction.WEST)
        karel.turnLeft();
       
           while (karel.getAvenue()!=0)
               //make karel move
               karel.move();
           
                    
                    
                    
            
        }
       
        }
        
    
    


