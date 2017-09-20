/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;
import static java.awt.Color.BLACK;

/**
 *
 * @author Amadea
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new city called Bali
        City bali=new City ();
        
        //create a robot
        Robot karel=new Robot (bali,0,1,Direction.WEST);
        //change karel's color
        karel.setColor (Color.ORANGE);
        //create string or karel's label
        String a="k";
        //label robot karel
        karel.setLabel(a);
       
              
     
        //create new walls
        new Wall (bali,2,3,Direction.WEST);
        new Wall (bali,2,3,Direction.NORTH);
        new Wall (bali,2,3,Direction.EAST);
        new Wall (bali,3,3,Direction.EAST);
        new Wall (bali,3,3,Direction.SOUTH);
        
        //create another robot
        Robot bob=new Robot (bali,3,3,Direction.EAST);
        //change bob's color
        bob.setColor(Color.ORANGE);
        //create string or bob's label
        String b="m";
        //label robot bob
        bob.setLabel(b);
        
        //create a thing;
        new Thing (bali,0,0);
        new Thing (bali,1,0);
        new Thing (bali,1,1);
        new Thing (bali,1,2);
        new Thing (bali,2,2);
      
        //have bob and karel turn
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        karel.move();
        karel.turnLeft();
        bob.move();
        karel.move();
        karel.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.move();
        karel.move();
        
        
        
    }

    private static void setLabel(String b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
