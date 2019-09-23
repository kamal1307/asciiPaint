package esi.alt.g39801.asciPaint;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kamal
 */
public class RectangleTest {

    /**
     * test construction of a rectangle.
     */
    @Test
    public void RectangleTest() {
        Rectangle r = new Rectangle(new Point(2, 3), 10, 2, 'r');
    }

    /**
     * test IllegalArgumentException if a point is null or width or height is
     * equal zero.
     */
    @Test(expected = IllegalArgumentException.class)
    public void RectangleTest1() {
        Rectangle r = new Rectangle(null, 10, 2, 'r');
    }

    /**
     * test IllegalArgumentException if a point is null or width or height is
     * equal zero.
     */
    @Test(expected = IllegalArgumentException.class)
    public void RectangleTest2() {
        Rectangle r = new Rectangle(new Point(2, 3), 0, 2, 'r');
    }

    /**
     * test IllegalArgumentException if a point is null or width or height is
     * equal zero.
     */
    @Test(expected = IllegalArgumentException.class)
    public void RectangleTest3() {
        Rectangle r = new Rectangle(new Point(2, 3), 10, 0, 'r');
    }

    /**
     * test IllegalArgumentException if a point is null or width and height is
     * equal zero.
     */
    @Test(expected = IllegalArgumentException.class)
    public void RectangleTest4() {
        Rectangle r = new Rectangle(new Point(2, 3), 0, 0, 'r');
    }

    /**
     * test IllegalArgumentException if a point is null and width and height is
     * equal zero.
     */
    @Test(expected = IllegalArgumentException.class)
    public void RectangleTest5() {
        Rectangle r = new Rectangle(null, 0, 0, 'r');
    }

    /**
     * test if the point isi in the rectangle or not.
     */
    @Test
    public void testIsInside() {
        Point a = new Point(5, 6);
        Point b = new Point(8, 5);
        Rectangle r = new Rectangle(a, 10, 5, 'r');
        assertTrue(r.isInside(b));
    }

    /**
     * test if the point isi in the rectangle or not.
     */
    @Test
    public void testIsInside1() {
        Point a = new Point(5, 6);
        Point b = new Point(8, 12);
        Rectangle r = new Rectangle(a, 25, 5, 'r');
        assertFalse(r.isInside(b));
    }

}
