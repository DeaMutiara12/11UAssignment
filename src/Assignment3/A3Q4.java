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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new city called bali
        City bali = new City();

        //make new walls to create blocks (four blocks)
        new Wall(bali, 1, 1, Direction.NORTH);
        new Wall(bali, 1, 2, Direction.NORTH);
        new Wall(bali, 1, 1, Direction.WEST);
        new Wall(bali, 2, 1, Direction.WEST);
        new Wall(bali, 2, 1, Direction.SOUTH);
        new Wall(bali, 2, 2, Direction.SOUTH);
        new Wall(bali, 1, 2, Direction.EAST);
        new Wall(bali, 2, 2, Direction.EAST);

        new Wall(bali, 1, 4, Direction.NORTH);
        new Wall(bali, 1, 5, Direction.NORTH);
        new Wall(bali, 1, 4, Direction.WEST);
        new Wall(bali, 2, 4, Direction.WEST);
        new Wall(bali, 2, 4, Direction.SOUTH);
        new Wall(bali, 2, 5, Direction.SOUTH);
        new Wall(bali, 2, 5, Direction.EAST);
        new Wall(bali, 1, 5, Direction.EAST);

        new Wall(bali, 4, 1, Direction.NORTH);
        new Wall(bali, 4, 2, Direction.NORTH);
        new Wall(bali, 4, 1, Direction.WEST);
        new Wall(bali, 5, 1, Direction.WEST);
        new Wall(bali, 5, 1, Direction.SOUTH);
        new Wall(bali, 5, 2, Direction.SOUTH);
        new Wall(bali, 4, 2, Direction.EAST);
        new Wall(bali, 5, 2, Direction.EAST);

        new Wall(bali, 4, 4, Direction.NORTH);
        new Wall(bali, 4, 5, Direction.NORTH);
        new Wall(bali, 4, 4, Direction.WEST);
        new Wall(bali, 5, 4, Direction.WEST);
        new Wall(bali, 5, 4, Direction.SOUTH);
        new Wall(bali, 5, 5, Direction.SOUTH);
        new Wall(bali, 5, 5, Direction.EAST);
        new Wall(bali, 4, 5, Direction.EAST);

        //create a robot name karel to travel all four blocks
        Robot karel = new Robot(bali, 3, 3, Direction.SOUTH);

        //make a for loop so that karel can get around the walls
        for (int count = 0; count < 4; count = count + 1) {

            //make karel move and turnleft so that he can get around the walls or blocks 
            karel.move();
            karel.move();
            karel.move();
            karel.turnLeft();
            karel.move();
            karel.move();
            karel.move();
            karel.turnLeft();
            karel.move();
            karel.move();
            karel.move();
            karel.turnLeft();
            karel.move();
            karel.move();
            karel.move();








        }
    }
}