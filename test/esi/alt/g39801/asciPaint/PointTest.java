package esi.alt.g39801.asciPaint;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kamal
 */
public class PointTest {

    /**
     * `
     * test construction of a Point.
     */
    @Test
    public void PointTest() {
        Point p = new Point(2, 5);
    }

    /**
     * test IllegalArgumentException if one of two attribute is null.
     */
    @Test(expected = IllegalArgumentException.class)
    public void PointTest0() {
        Point p = new Point(-1, 0);
    }

    /**
     * test IllegalArgumentException if one of two attribute is null.
     */
    @Test(expected = IllegalArgumentException.class)
    public void PointTest1() {
        Point p = new Point(2, -1);
    }

    /**
     * test IllegalArgumentException if two attribute is null.
     */
    @Test(expected = IllegalArgumentException.class)
    public void PointTest2() {
        Point p = new Point(-1, -4);
    }
}
