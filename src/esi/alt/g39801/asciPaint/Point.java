
package esi.alt.g39801.asciPaint;

/**
 * JAVADOC
 * @author kamal
 */
public class Point {

    private double x;
    private double y;

    /**
     * Get the value of x
     *
     * @return the value of x
     */
    public double getX() {
        return x;
    }

    /**
     * Get the value of y
     *
     * @return the value of y
     */
    public double getY() {
        return y;
    }

    /**
     * Initialize the attribut of a point
     *
     * @param x is the point on the X-axis.
     * @param y is the point on the coordinate axis.
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Initialize the point.
     *
     * @param p is the point of a shape.
     */
    public Point(Point p) {
        this.x = p.getX();
        this.y = p.getY();
    }

    /**
     * Move the point of a shape.
     *
     * @param dx the point on the X-axis.
     * @param dy the point on the coordinate axis.
     */
    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    /**
     * Return the distance between two points.
     *
     * @param other an other point on the dimension.
     * @return the distance between two points.
     */
    public double distanceTo(Point other) {
        double dx = Math.pow((this.x - other.getX()), 2);
        double dy = Math.pow((this.y - other.getY()), 2);
        return Math.sqrt(dx + dy);
    }
}
