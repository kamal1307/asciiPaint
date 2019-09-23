package esi.alt.g39801.asciPaint;

/**
 *
 * @author kamal
 */
public class Circle extends ColoredShape {

    private final Point center;
    private final double radius;

    /**
     * Get the value of radius
     *
     * @return the value of radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Get the value of center
     *
     * @return the value of center
     */
    public Point getCenter() {
        return center;
    }

    /**
     * Create a circle.
     *
     * @param center the center of a circle.
     * @param radius the radius of a circle.
     * @param color the color of a circle.
     */
    public Circle(Point center, double radius, char color) { //teste unitaire
        super(color);
        if (radius <= 0 || center == null) {
            throw new IllegalArgumentException("the radius or point is null");
        }
        this.center = center;
        this.radius = radius;
    }

    /**
     * Move the center.
     *
     * @param dx is the point on the X-axis.
     * @param dy is the point on the coordinate axis.
     */
    @Override
    public void move(double dx, double dy) {
        this.center.move(dx, dy);
    }

    /**
     * Return if the point is in the Circle or not.
     *
     * @param p is some point.
     * @return if the point is inside the Circle or not.
     */
    @Override
    public boolean isInside(Point p) { // teste unitaire
        return this.center.distanceTo(p) <= this.radius;
    }

}
