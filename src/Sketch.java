import processing.core.PApplet;


public class Sketch extends PApplet {

    // This section declares four instances each of Ball, Bubble, and Snowflake objects.
    // These will later be initialized and used to display the 4 balls bouncing around and 4 bubbles rising and the 4 snowflakes falling down.
    private Ball ball1;
    private Ball ball2;
    private Ball ball3;
    private Ball ball4;
    private Bubble bubble1;
    private Bubble bubble2;
    private Bubble bubble3;
    private Bubble bubble4;
    private Snowflake snowflake1;
    private Snowflake snowflake2;
    private Snowflake snowflake3;
    private Snowflake snowflake4;
    
    
    /**
     * This method can only be used to change the window size. It runs before the
     * window is created.
     */
    public void settings() {
        size(500, 500);
    }

    /**
     * Runs once at the beginning of the program, after the window is created. Use
     * this to initialize the sketch.
     */
    public void setup() {
        
// This creates the ball objects. Each one has its own size, position, and speed.
ball1 = new Ball(this, 35, 300, 300, 5, -2);
ball2 = new Ball(this, 50, 400, 100, 4, 3);
ball3 = new Ball(this, 45, 300, 100, 2, 5);
ball4 = new Ball(this, 20, 300, 367, 5, -4);

// This section sets the colors for each ball. The colors are randomly generated 
// using random numbers from 0–255 for red, green, and blue. 
// The second color (color(0)) is usually for the ball’s outline or border.
ball1.setColors(color(random(0, 255), random(0, 255), random(0, 255)), color(0));   
ball2.setColors(color(random(0, 255), random(0, 255), random(0, 255)), color(0));      
ball3.setColors(color(random(0, 255), random(0, 255), random(0, 255)), color(0));      
ball4.setColors(color(random(0, 255), random(0, 255), random(0, 255)), color(0));

// This part creates the bubble objects. Each bubble has a different size and speed.
// The bubbles move upward (negative ySpeed) to look like they’re floating.
bubble1 = new Bubble(this, 20, 300, 300, 0, -2);
bubble2 = new Bubble(this, 25, 400, 100, 0, -3);
bubble3 = new Bubble(this, 30, 300, 100, 0, -5);
bubble4 = new Bubble(this, 15, 300, 367, 0, -4);

// This part makes the snowflake objects. Each snowflake has a size, starting position,
// and a small speed to make it fall. 
snowflake1 = new Snowflake(this, 40, 300, 200, 0, -4);
snowflake2 = new Snowflake(this, 30, 100, 100, 1, 2);
snowflake3 = new Snowflake(this, 10, 400, 300, 0, 3);
snowflake4 = new Snowflake(this, 20, 200, 400, 1, 2);

        
    }

    /**
     * This method runs over and over and over, approximately 60 times per second!
     * By moving objects a tiny bit each frame, you can get the appearance of
     * movement.
     */
    public void draw() {
        background(180, 180, 255);
        ball1.draw();
        ball1.move();
        ball2.draw();
        ball2.move();
        ball3.move();
        ball3.draw();
        ball4.draw();
        ball4.move();
        bubble1.draw();
        bubble1.move();
        bubble2.draw();
        bubble2.move();
        bubble3.move();
        bubble3.draw();
        bubble4.draw();
        bubble4.move();
        snowflake1.draw();
        snowflake1.move();
        snowflake2.draw();
        snowflake2.move();
        snowflake3.move();
        snowflake3.draw();
        snowflake4.draw();
        snowflake4.move();
    }

    /** All processing sketches have to use this main method. Don't touch this! */
    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}
