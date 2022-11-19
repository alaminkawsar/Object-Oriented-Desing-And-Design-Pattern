import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Random;

// A square with variable size and fill color that can be controlled by arrow keys via
// handleKeyPressed() and handleKeyReleased(). Cannot go past window bounds defined by
// screenW and screenH. Changes to random color when colliding with another sprite.
public class ControllableSquareSprite extends Sprite {

    // width of each side (px)
    private int width;
    // color to fill square
    private Color color;
    // width and height of the window the Square is on (pixels). Square cannot go outside this
    private int screenW, screenH;
    // pixels per frame the Square should move along the x-axis and y-axis, respectively
    private float speedX = 0, speedY = 0;
    // used to generate random numbers
    private Random random = new Random();

    public ControllableSquareSprite(float x, float y, int width, Color color, int screenW, int screenH) {
        super(x, y, new Hitbox(x, y, width, width));
        this.width = width;
        this.color = color;
        this.screenW = screenW;
        this.screenH = screenH;
        hitbox = new Hitbox(x, y, width, width);  // initialize Hitbox with same dimensions
    }

    // handles a KeyEvent for a key pressed. sets speedX and speedY accordingly
    public void handleKeyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {  // handle right arrow key
            speedX = 5.0f;  // move to the right
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {  // handle left arrow key
            speedX = -5.0f;  // move to the left
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {  // handle up arrow key
            speedY = -5.0f;  // move up (y decreases!)
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {  // handle down arrow key
            speedY = 5.0f;  // move down (y increases!)
        }
    }

    // handles a KeyEvent for a key released. sets speedX and speedY accordingly
    public void handleKeyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_LEFT) {
            speedX = 0;  // user stopped pressing left/right arrow key. stop horizontal movement
        } else if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_DOWN) {
            speedY = 0;  // user stopped pressing up/down arrow key. stop vertical movement
        }
    }

    @Override
    void update() {
        // increment x-coordinate and y-coordinate according to speed
        x += speedX;
        y += speedY;

        // bounds checking: check if we've gone off left or right screen edge. if so, move sprite back in bounds
        if (x + width > screenW) {  // right edge check
            x = screenW - width;
        } else if (x < 0) {  // left edge check
            x = 0;
        }
        // bounds checking: check if we've gone off top or bottom screen edge. if so, move sprite back in bounds.
        // do not combine this if/else with the one above, because the sprite could go off a vertical *and* horizontal
        // edge simultaneously, and that would not be caught.
        if (y + width > screenH) {  // bottom edge check
            y = screenH - width;
        } else if (y < 0) {  // top edge check
            y = 0;
        }

        // update hitbox coordinates to match sprite
        hitbox.set(x, y, width, width);
    }

    @Override
    void handleCollision(Sprite s) {
        // set a new color with random RGB
        color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }

    @Override
    void draw(Graphics2D g) {
        g.setColor(color);
        g.fillRect((int) x, (int) y, width, width);  // draw square with correct coordinate and width/height
    }
}