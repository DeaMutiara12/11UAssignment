
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bakea2351
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kitchener = new City();
        
        
        //create new walls
       new Wall (kitchener,2,1,Direction.SOUTH);
       new Wall (kitchener, 2,1, Direction. WEST);
       new Wall (kitchener,2,1,Direction. WEST);
       new Wall (kitchener, 1,1,Direction.WEST);
       new Wall (kitchener, 1,1,Direction.NORTH);
       new Wall (kitchener,1,2,Direction.NORTH);
       new Wall (kitchener,1,2,Direction.EAST);
       new Wall (kitchener,1,2,Direction.SOUTH);
       
       //create a robot 
       Robot karel=new Robot (kitchener,1,2,Direction.SOUTH);
       //create a Thing
       new Thing (kitchener,2,2);
       
       //have karel move 
       karel.turnLeft();
       karel.turnLeft();
       karel.turnLeft();
       karel.move();
       karel.turnLeft();
       karel.move();
       karel.turnLeft();
       karel.move();
       
      //have karel pickup the Thing
       karel.pickThing();
       
       //have karel move
       karel.turnLeft();
       karel.turnLeft();
       karel.move();
       karel.turnLeft();
       karel.turnLeft();
       karel.turnLeft();
       karel.move();
       karel.turnLeft();
       
       
    
       
       
      
       
     
       
     
        
        
    }
}
