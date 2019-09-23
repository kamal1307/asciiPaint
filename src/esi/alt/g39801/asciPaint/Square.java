
package esi.alt.g39801.asciPaint;

/**
 *
 * @author kamal
 */
public class Square extends Rectangle {

    /**
     * Create a square.
     *
     * @param upperLeft is the upper left of a square.
     * @param side is the side of a square.
     * @param color is the color of a square.
     */
    public Square(Point upperLeft, double side, char color) {
        super(upperLeft, side, side, color);
    }
}
