package esi.alt.g39801.asciPaint;

/**
 *
 * @author kamal
 */
public class Rectangle extends ColoredShape {

    private final Point upperLeft;

    private final double width;
    private final double height;

    /**
     * Get the value of height
     *
     * @return the value of height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Get the value of width
     *
     * @return the value of width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Get the value of upperLeft
     *
     * @return the value of upperLeft
     */
    public Point getUpperLeft() {
        return upperLeft;
    }

    /**
     * Create a rectangle.
     *
     * @param upperLeft is the upper left of a rectangle.
     * @param width is the width of a rectangle.
     * @param height is the height of a rectangle.
     * @param color is the color of a rectangle.
     */
    public Rectangle(Point upperLeft, double width, double height, char color) {
        super(color);
        if (upperLeft == null || width <= 0 || height <= 0) {
            throw new IllegalArgumentException("the upperleft or width or height"
                    + " is not correctly"); // +valeurs
        }
        this.upperLeft = upperLeft;
        this.width = width;
        this.height = height;
    }

    /**
     * Move the center.
     *
     * @param dx is the point on the X-axis.
     * @param dy is the point on the coordinate axis.
     */
    @Override
    public void move(double dx, double dy) {
        this.upperLeft.move(dx, dy);
    }

    /**
     * Return if the point is in the rectangle or not.
     *
     * @param p is some point.
     * @return if the point is in the rectangle or not.
     */
    @Override
    public boolean isInside(Point p) { // teste unitaire
        return p.getX() >= this.upperLeft.getX()
                && p.getX() < this.upperLeft.getX() + width
                && p.getY() <= this.upperLeft.getY()
                && p.getY() > this.upperLeft.getY() - height;
    }

}
