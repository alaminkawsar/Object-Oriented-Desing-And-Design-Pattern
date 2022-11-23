import java.awt.*;
import java.util.Random;

public class ControllableRobot extends Robot {

    private int width;
    private Color color;
    private int screenW, screenH;
    private float speedX = 0, speedY = 0;

    private Random random = new Random();

    public ControllableRobot(float x, float y, int width, Color color, int screenW, int screenH) {
        super(x, y, new Hitbox(x, y, width, width));
        this.width = width;
        this.color = color;
        this.screenW = screenW;
        this.screenH = screenH;
        hitbox = new Hitbox(x, y, width, width); 
    }

    private String robotName = "Kawsar";
    private int posX = 0;
    private int posY = 0;

    public void walk_forward() {
        speedY=50.f;
        showPose();
    }
    public void turnLeft() {
        speedX=-50.f;
        showPose();
    }
    public void turnRight() {
        speedX=50.f;
        showPose();
    }
    public void go_backward() {
        speedY=-50.f;
        showPose();
    }
    public void stop(){
        speedX=0.f;
        speedY=0.f;
        System.out.println("Stop Robot");
    }
    public void showPose(){
        System.out.println("Robot position is: " + x + " " + x);
    }

    @Override
    void update() {
        // increment x-coordinate and y-coordinate according to speed
        x += speedX;
        y += speedY;

        // bounds checking: check if we've gone off left or right screen edge. if so, move robot back in bounds
        if (x + width > screenW) {  // right edge check
            x = screenW - width;
        } else if (x < 0) {  // left edge check
            x = 0;
        }
        // bounds checking
        if (y + width > screenH) {  // bottom edge check
            y = screenH - width;
        } else if (y < 0) {  // top edge check
            y = 0;
        }

        // update hitbox coordinates to match Robot
        hitbox.set(x, y, width, width);
    }

    @Override
    void handleCollision(Robot s) {
        // set a new color with random RGB
        color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }

    @Override
    void draw(Graphics2D g) {
        g.setColor(color);
        g.fillRect((int) x, (int) y, width, width);  // draw square with correct coordinate and width/height
    }
}