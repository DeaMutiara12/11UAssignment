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

/**
 *
 * @author Donald
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City bali=new City ();
        
        //create a new robot
        Robot karel=new Robot(bali,1,1,Direction.EAST);
        
        //create new thing
        new Thing (bali, 1,2,Direction.EAST);
        new Thing (bali,1,3,Direction.EAST);
        new Thing (bali,1,4,Direction.EAST);
        new Thing (bali, 1,5,Direction.EAST);
        new Thing (bali,1,6,Direction.EAST);
        new Thing (bali,1,7,Direction.EAST);
        new Thing (bali,1,8,Direction.EAST);
        new Thing (bali,1,9,Direction.EAST);
        new Thing (bali,1,10,Direction.EAST);
        new Thing (bali,1,11,Direction.EAST);
        
        //if karel does not have seven things on his backpack go back and pick it up
        while(karel.countThingsInBackpack()!=7){
            
            //
            karel.move();
            karel.pickThing();
   
        }
        {
            if (karel.countThingsInBackpack()==7)
                karel.move();
            
            while (karel.canPickThing()){
                karel.move();
                
            }
       }
           
        
      
               
        
    }
    
}
