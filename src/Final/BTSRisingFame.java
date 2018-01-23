/*

 * To change this license header, choose License Headers in Project Properties.

 * To change this template file, choose Tools | Templates

 * and open the template in the editor.

 */



import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;
import java.util.stream.IntStream;
import javax.imageio.ImageIO;



/**

 *

 * @author lamon

 */

public class BTSRisingFame extends JComponent {



    // Height and Width of our game

    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    
    //Title of the window
    String title = "BTS Rising Fame";

    // sets the framerate and delay for our game

    // you just need to select an approproate framerate

    long desiredFPS = 60;
    long desiredTime = (1000) / desiredFPS;

    // YOUR GAME VARIABLES WOULD GO HERE

    // make the player variables
    Rectangle player = new Rectangle(50, 400, 30, 30);
    //displacement in the x and y directions
    int btsDX = 0;
    int btsDY = 0;
    
    // gravity strength
    int gravity = 1;
    int speedGame =1;
    
   
    
    //random positon for the blocsk
    Random ranGen = new Random ();
    
    // blocks in the level
    Rectangle[] blocks = new Rectangle[21];
    
    // control varaibles
    boolean left = false;
    boolean right = false;
    boolean jump = false;
    boolean start= false;
    // should they be falling
    boolean onGround = true;
    
     //set up the score
   int score = 0;
   Font scoreFont = new Font ("Arial", Font.ITALIC, 30);
   
   //get jimin's face as the player
   BufferedImage jimin = loadImage("20180119_122915.png");
   //change the blocks into flowers
   BufferedImage cloud= loadImage ("blossom-1389625_640.png");
   //change the backgorund
   BufferedImage background= loadImage ("btss.jpg");
   


    // GAME VARIABLES END HERE   


    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)

    public BTSRisingFame(){

        // creates a windows to show my game
        JFrame frame = new JFrame(title);
        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));

        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically

        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        // shows the window to the user

        frame.setVisible(true);
        
        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();
        
        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);

    }
      public BufferedImage loadImage(String name) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(name));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return img;
    }


    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)

    @Override

    public void paintComponent(Graphics g) {

        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);
        // GAME DRAWING GOES HERE
         //fill the bacground with color
       g.setColor (new Color (58, 23, 56));
       g.drawImage (background,0,0,WIDTH, HEIGHT,null);

        // draw the blocks
        g.setColor(Color.BLACK);
        for(int i = 0; i < blocks.length; i++){
            g.drawImage(cloud, blocks[i].x, blocks[i].y, blocks[i].width, blocks[i].height, null);
            
            for (Rectangle block : blocks) {
            }
        // draw the player
        g.setColor(Color.RED);
         g.drawImage(jimin,player.x, player.y, player.width, player.height,null);
        
         //draw the score
       g.setColor (Color.WHITE);
       g.setFont (scoreFont);
       g.drawString ("" + score, WIDTH/2, 50);
       
            
        }

        

        // GAME DRAWING ENDS HERE
    }


    // This method is used to do any pre-setup you might need to do

    // This is run before the game loop begins!

    public void  preSetup(){

       // Any of your pre setup before the loop starts should go here

       //Rectangle(X, Y, W, H);
       blocks[0] = new Rectangle(0, 450, 100, 70);
       blocks[1] = new Rectangle(100, 450, 110, 70);
       blocks[2] = new Rectangle(200, 450, 110, 70);
       blocks[3] = new Rectangle(400, 450, 110, 89);
       blocks[4] = new Rectangle(300, -300, 80, 70);             
       blocks[5] = new Rectangle(550, -90, 80, 75);
       blocks [6]= new Rectangle (400, -300, 80, 70);
       blocks [7] = new Rectangle (300, 200, 100, 70);
       blocks [8] = new Rectangle (50, -200, 80, 70);
       blocks [9] = new Rectangle (340, -100, 90, 70);
       blocks [10]= new Rectangle (100, 200, 90, 70);
       blocks [11] = new Rectangle (150, 330, 50, 70);//the small cube
       blocks [12] = new Rectangle (250, 400, 90, 70);
       blocks [13] = new Rectangle (90, 200, 90, 70);
       blocks [14]= new Rectangle (400, -200, 90, 70);
       blocks [15]= new Rectangle (260, 230, 100,75);
       blocks [16]= new Rectangle (190, 330, 90, 70);//beside the small cube
       blocks [17]= new Rectangle (300, 100, 90, 70);
       blocks [18]= new Rectangle (346, 50, 50,70);
       blocks [19]= new Rectangle (250, -10, 50, 77);
       blocks [20]= new Rectangle (500, 200, 100, 90);
               
   
    }
    // The main game loop
    // In here is where all the logic for my game will go

    public void run() {

        // Used to keep track of time used to draw and update the game

        // This is used to limit the framerate later on
        long startTime;
        long deltaTime;
        preSetup();

        // the main game loop section
        // game will end if you set done = false;

        boolean done = false;
        while (!done) {
            // determines when we started so we can keep a framerate

            startTime = System.currentTimeMillis();

            // all your game rules and move is done in here

            // GAME LOGIC STARTS HERE 
                    
            // left and right movement
            if(right){
                btsDX = 3;
            }else if(left){
                btsDX = -3;
            }else{
                btsDX = 0;
            }    
           
            if(onGround && jump){

                // do something about jumping
                // big negative to start moving up
                btsDY = -16;
                // not on ground anymore
                onGround = false;
            }
            
            // apply gravity
            btsDY = btsDY + gravity;
            // update the player
            player.x = player.x + btsDX;
            player.y = player.y + btsDY;
           
            // assuming not standing on anything
            onGround = false;

            // check for collisions
            // go through every block and check with player
                // did the player hit a block?
                  for (int i=0; i<blocks.length; i++){
                      //if player intersects with the block then score increases
                      if (player.intersects(blocks[i])){
                          score++;
                          //make the blocks move faster when time passes by
                      }if(score==100){
                          int speed = 2;
                          speedGame = speed;
                      }
                      //make the blocks to move from off the screen
             blocks[i].y = blocks[i].y + speedGame;
                        blocks[i].y = blocks[i].y + speedGame;  
                if(player.intersects(blocks[i])){
                    int cHeight = Math.min(blocks[i].y + blocks[i].height, player.y + player.height) - Math.max(blocks[i].y, player.y);
                    int cWidth = Math.min(blocks[i].x + blocks[i].width, player.x + player.width) - Math.max(blocks[i].x, player.x);
                    

                    // determine the smaller one to fix
                    if(cWidth < cHeight){
                        // player on left side
                        if(player.x < blocks[i].x){
                            player.x = player.x - cWidth;
                        }else{
                            player.x = player.x + cWidth;
                        }
                        // stop the player moving sideways
                        btsDX = 0;
                    }else{
                        // above the block
                        if(player.y < blocks[i].y){
                           player.y = player.y - cHeight;

                            // moving down?
                            if(btsDY >= 0){
                                // stop the down motion
                                btsDY = 0;
                                // standing on flower
                                onGround = true;
                            }                           
                        }else{
                            player.y = player.y + cHeight;
                        }
                    }
                }
            }  //make a for loop make the blocks go back to the end of the screen
                   for (int i=0; i<blocks.length; i++){
                         if (blocks[i].y>HEIGHT){
                    blocks [i].y=0;
                   }

            // GAME LOGIC ENDS HERE 
            // update the drawing (calls paintComponent)
            repaint();
            // SLOWS DOWN THE GAME BASED ON THE FRAMERATE ABOVE

            // USING SOME SIMPLE MATH
            deltaTime = System.currentTimeMillis() - startTime;
            try {
                if (deltaTime > desiredTime) {
                    //took too much time, don't wait
                    Thread.sleep(1);
                } else {
                    // sleep to make up the extra time
                    Thread.sleep(desiredTime - deltaTime);
                }
            } catch (Exception e) {
            };
        }
    }
    }
    // Used to implement any of the Mouse Actions

    private class Mouse extends MouseAdapter {

        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e){
            
        }
        // if a mouse button has been released

        @Override

        public void mouseReleased(MouseEvent e){
            
        }

        

        // if the scroll wheel has been moved

        @Override
        public void mouseWheelMoved(MouseWheelEvent e){
          
        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e){
         

        }
    }
    

    // Used to implements any of the Keyboard Actions

    private class Keyboard extends KeyAdapter{
        // if a key has been pressed down
        @Override

        public void keyPressed(KeyEvent e){

            // determine the key
            int key = e.getKeyCode();

            // figure out which key
            //if the right key is pressed
            if(key == KeyEvent.VK_RIGHT){
                right = true;
            }else if(key == KeyEvent.VK_LEFT){//if the left key is pressed
                left = true;
            }else if(key == KeyEvent.VK_SPACE){//if the space key is presed
                jump = true;
            }

        }
       
        // if a key has been released

        @Override
        public void keyReleased(KeyEvent e){

            // determine the key
            int key = e.getKeyCode();

            // figure out which key
            if(key == KeyEvent.VK_RIGHT){
                right = false;

            }else if(key == KeyEvent.VK_LEFT){

                left = false;

            }else if(key == KeyEvent.VK_SPACE){

                jump = false;

            }

        }

    }

    

    

    /**

     * @param args the command line arguments

     */

    public static void main(String[] args) {

        // creates an instance of my game
        BTSRisingFame game = new BTSRisingFame();
        
        // starts the game loop

        game.run();

    }

}



