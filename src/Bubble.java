
class Bubble {

   // INSTANCE VARIABLES
     private Sketch s;
    /** the radius of the ball */
    private float radius;
    private float x;
    private float y;
    /** The number of pixels the ball moves right per frame */
    private float xSpeed;
    /** The number of pixels the ball moves down per frame */
    private float ySpeed;
    /** The color of the inside of the ball */
    private int fillColor;
    /** The color of the outside of the ball */
    private int borderColor;
    //MISSING CONSTRUCTORS
    public Bubble(Sketch sketch) {
        s = sketch;
        radius = 20;
        x = 100;
        y = 100;
        xSpeed = 2;
        ySpeed = -1;
        fillColor = s.color(255, 0, 0);
        borderColor = s.color(0, 0, 0);

    }

// This is the bubble constructor. This is what allows teh program to create objects.
    public Bubble(Sketch sketch, float radius, float x, float y, float xspeed, float yspeed) {
        this.s = sketch;
        this.radius = radius;
        this.x = y;
        this.y = x;
        this.xSpeed = xspeed;
        this.ySpeed = yspeed;
        borderColor = s.color(0,0,0);


    }

    // accessors for the radius, diameter, x, and y values 
    

    public float getRadius() {
        return radius;
    }

    public float getDiameter() {
        return radius * 2;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
    // This removes the color from the bubbles.
    public void draw() {
        s.stroke(borderColor);
        s.noFill();
        s.circle(x, y, radius*2);
    }

    public void move() {
        x = x + xSpeed;
        y = y + ySpeed;
        if (x > s.width - radius) {
            x = radius;
        } else if(x < radius) {
            x = s.width - radius;
        } else if (y > s.height - radius) {
            y = radius;
        } else if (y < radius) {
            y = s.height - radius;
        }
    }

}
 