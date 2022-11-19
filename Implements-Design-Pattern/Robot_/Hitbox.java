// Hitbox for a sprite, defining a rectangular area on the canvas. Essentially a rectangle.
public class Hitbox {

    // coordinates of top-left corner
    private float x, y;
    // hitbox dimensions
    private float width, height;

    public Hitbox(float x, float y, float width, float height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // shifts coordinates by dx on x-axis and dy on y-axis
    public void offset(float dx, float dy) {
        x += dx;
        y += dy;
    }

    // reset fields
    public void set(float x, float y, float width, float height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // returns whether bounds of this Hitbox intersects the bounds of the given Hitbox
    public boolean intersects(Hitbox h) {
        return x + width >= h.x && h.x + h.width >= x && y + height >= h.y && h.y + h.height >= y;
    }
}