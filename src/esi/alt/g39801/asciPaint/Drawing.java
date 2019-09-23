
package esi.alt.g39801.asciPaint;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kamal
 */
public class Drawing {

    private List<Shape> shapes;

    private int width;

    private int height;

    /**
     * Get the value of width
     *
     * @return the value of width
     */
    int getWidth() {
        return width;
    }

    /**
     * Get the value of height
     *
     * @return the value of height
     */
    int getHeight() {
        return height;
    }

    /**
     * Create a dimension 100x100.
     */
    public Drawing() {
        this(100, 100);
    }

    /**
     * Create a dimension for the shape.
     *
     * @param width is the width for the dimension.
     * @param height is the heught for the dimension.
     */
    public Drawing(int width, int height) {
        this.shapes = new ArrayList<>();
        this.width = width;
        this.height = height;
    }

    /**
     * Add a shape in the list.
     *
     * @param shape any shape.
     */
    void addShape(Shape shape) {
        this.shapes.add(shape);
    }

    /**
     * Return the shape at the point given.
     *
     * @param p is the point on the dimension.
     * @return the shape at the point given.
     */
    Shape getShapeAt(Point p) {
        Shape ret = null;
        for (Shape shape : shapes) {
            if (shape.isInside(p)) {
                ret = shape;
            }
        }
        return ret;
    }

}
