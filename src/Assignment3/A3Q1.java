/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author bakea2351
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city 
        City bali = new City();

        //create new Walls
        new Wall(bali, 1, 1, Direction.WEST);
        new Wall(bali, 2, 1, Direction.WEST);
        new Wall(bali, 2, 1, Direction.SOUTH);
        new Wall(bali, 2, 2, Direction.SOUTH);
        new Wall(bali, 1, 1, Direction.NORTH);
        new Wall(bali, 1, 2, Direction.NORTH);
        new Wall(bali, 1, 2, Direction.EAST);
        new Wall(bali, 2, 2, Direction.EAST);

        //create a new robot name karel
        Robot karel = new Robot(bali, 0, 2, Direction.WEST);

        //create a for loop to have karel navigate around the square
        for (int count = 0; count < 8; count = count + 1) {

            //make karel move to get around the square two times
            karel.move();
            karel.move();
            karel.turnLeft();
            karel.move();

        }
    }
}
