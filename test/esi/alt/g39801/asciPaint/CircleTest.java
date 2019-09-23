package esi.alt.g39801.asciPaint;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kamal
 */
public class CircleTest {

    /**
     * test construction of a circle.
     */
    @Test
    public void CircleTest1() {
        Point p = new Point(2, 5);
        Circle c = new Circle(p, 5, 'a');
    }

    /**
     * test IllegalArgumentException if a point is null or radius is equal zero.
     */
    @Test(expected = IllegalArgumentException.class)
    public void CircleTest2() {
        Point p = new Point(2, 5);
        Circle c = new Circle(p, 0, 'a');
    }

    /**
     * test IllegalArgumentException if a point is null or radius is equal zero.
     */
    @Test(expected = IllegalArgumentException.class)
    public void CircleTest3() {
        Circle c = new Circle(null, 2, 'a');
    }

    /**
     * test IllegalArgumentException if a point is null oand radius is equal
     * zero.
     */
    @Test(expected = IllegalArgumentException.class)
    public void CircleTest4() {
        Circle c = new Circle(null, 0, 'a');
    }

    /**
     * test if a point is in the circle or not.
     */
    @Test
    public void testIsInside() {
        Point a = new Point(4, 5);
        Point b = new Point(2, 3);
        Circle c = new Circle(a, 5, 'r');
        assertTrue(c.isInside(b));
    }

    /**
     * test if a point is in the circle or not.
     */
    @Test
    public void testIsInside1() {
        Point a = new Point(10, 10);
        Point b = new Point(2, 3);
        Circle c = new Circle(a, 5, 'r');
        assertFalse(c.isInside(b));
    }

}
