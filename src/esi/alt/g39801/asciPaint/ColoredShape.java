package esi.alt.g39801.asciPaint;

/**
 *
 * @author kamal
 */
public abstract class ColoredShape implements Shape {

    private char color;

    /**
     * Get the value of color
     *
     * @return the value of color
     */
    @Override
    public char getColor() {
        return color;
    }

    /**
     * Set the value of color
     *
     * @param color new value of color
     */
    public void setColor(char color) {
        this.color = color;
    }

    /**
     * Initialize the color of a shape.
     *
     * @param color is the color of a shape
     */
    public ColoredShape(char color) {
        this.color = color;
    }
}
