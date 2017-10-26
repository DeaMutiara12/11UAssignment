/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author bakea2351
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new city
        City bali = new City();

        //create a robot name karel
        Robot karel = new Robot(bali, 1, 1, Direction.EAST);

        //create things for karel to pick up one at a time
        new Thing(bali, 1, 1, Direction.NORTH);
        new Thing(bali, 1, 1, Direction.NORTH);
        new Thing(bali, 1, 1, Direction.NORTH);
        new Thing(bali, 1, 1, Direction.NORTH);
        new Thing(bali, 1, 1, Direction.NORTH);
        new Thing(bali, 1, 1, Direction.NORTH);
        new Thing(bali, 1, 1, Direction.NORTH);
        new Thing(bali, 1, 1, Direction.NORTH);
        new Thing(bali, 1, 1, Direction.NORTH);
        new Thing(bali, 1, 1, Direction.NORTH);

        //loop things for karel to carry 
        bali.showThingCounts(true);

        for (int count = 0; count < 10; count = count + 1) {

            //make karel move to drop the things

            karel.pickThing();
            karel.move();
            karel.putThing();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();

        }
        //make karel move
        karel.move();
    }
}
