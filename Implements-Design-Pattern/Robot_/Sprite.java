import java.awt.*;

// Parent class for all Sprites. Each subclass will have Provides update(), draw(), and handleCollision() methods.
public abstract class Sprite {

    // x- and y-coordinates of upper-left corner of the sprite. Use float for sub-pixel precision.
    protected float x, y;
    // rectangular region on canvas specifying where the sprite can be hit
    protected Hitbox hitbox;

    // constructor requiring only the coordinates of the sprite
    public Sprite(float x, float y, Hitbox hitbox) {
        this.x = x;
        this.y = y;
        this.hitbox = hitbox;
    }

    // updates the state of the sprite (implemented in subclass)
    abstract void update();

    // draws the sprite to the screen/graphics object (implemented in subclass)
    abstract void draw(Graphics2D g);

    // executes logic when a collision is detected with given Sprite s
    abstract void handleCollision(Sprite s);

    // returns whether this Sprite collides with the given Sprite, i.e. whether their Hitboxes intersect.
    public boolean collides(Sprite s) {
        return hitbox.intersects(s.hitbox);
    }
}