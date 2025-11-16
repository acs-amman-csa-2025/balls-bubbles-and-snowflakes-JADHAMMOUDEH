

class Snowflake {
    // ONLY THE DRAW METHOD IS INCLUDED. YOU MUST FINISH THE REST.
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
   
    public void draw() {
        s.line(x + radius, y, x - radius, y);
        s.line(x, y + radius, x, y - radius);
        s.line(x + radius * .707f, y + radius * .707f,
               x - radius * .707f, y - radius * .707f);
        s.line(x + radius * .707f, y - radius * .707f,
               x - radius * .707f, y + radius * .707f);
    }
// This constructor allows me to create instances of the snowflake class. 
    public Snowflake(Sketch sketch, float radius, float x, float y, float xspeed, float yspeed) {
        this.s = sketch;
        this.radius = radius;
        this.x = y;
        this.y = x;
        this.xSpeed = xspeed;
        this.ySpeed = yspeed;
    }
// This method moves the snowflake based on its speed. 
// It also makes the snowflake wrap around the screen when it goes off any edge, 
// so it keeps floating instead of disappearing.
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