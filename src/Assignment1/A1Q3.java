/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Wall;

/**
 *
 * @author bakea2351
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kitchener= new City ();
        
        //create new walls
        new Wall (kitchener,3,1,Direction.WEST);
        new Wall (kitchener,3,1,Direction.NORTH);
        new Wall (kitchener,2,2,Direction.WEST);
        new Wall (kitchener,1,2,Direction.WEST);
        new Wall (kitchener,1,2,Direction.NORTH);
        new Wall (kitchener,1,2,Direction.EAST);
        new Wall (kitchener,2,3,Direction.NORTH);
        
        
    }
}
