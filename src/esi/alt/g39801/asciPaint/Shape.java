
package esi.alt.g39801.asciPaint;

/**
 *
 * @author kamal
 */
public interface Shape {

    /**
     * Move the center.
     *
     * @param dx is the point on the X-axis.
     * @param dy is the point on the coordinate axis.
     */
    void move(double dx, double dy);

    /**
     * Return if the point is in the Circle or not.
     *
     * @param p is some point.
     * @return if the point is in the Circle or not.
     */
    boolean isInside(Point p);

    /**
     * Return the color of a shape.
     *
     * @return the color of a shape.
     */
    char getColor();
}
