package esi.alt.g39801.asciPaint;

/**
 *
 * @author g39801
 */
public class AsciiPaint {

    private Drawing drawing;

    /**
     * Creat a dimension 0x0.
     */
    public AsciiPaint() {
        this(0, 0);
    }

    /**
     * Create a dimension for the shape.
     *
     * @param width is the width for the dimension.
     * @param height is the heught for the dimension.
     */
    public AsciiPaint(int width, int height) {
        drawing = new Drawing(width, height);
    }

    /**
     * Add a new circle in the shape list.
     *
     * @param x is the point on the X-axis.
     * @param y is the point on the coordinate axis.
     * @param radius is the radius of a circle
     * @param color the color of a circle.
     */
    public void newCircle(int x, int y, double radius, char color) {
        this.drawing.addShape(new Circle(new Point(radius, radius), radius,
                color));
    }

    /**
     * Add a new rectangle in the shape list.
     *
     * @param x is the point on the X-axis.
     * @param y is the point on the coordinate axis.
     * @param width is the width of a rectangle.
     * @param height is the height of a rectangle.
     * @param color is the color of a rectangle.
     */
    public void newRectangle(int x, int y, double width, double height,
            char color) {
        this.drawing.addShape(new Rectangle(new Point(width, width), width,
                height, color));
    }

    /**
     * Add a new Square in the shape list.
     *
     * @param x is the point on the X-axis.
     * @param y is the point on the coordinate axis.
     * @param side is the side of a square.
     * @param color is the color of a square.
     */
    public void newSquare(int x, int y, double side, char color) {
        this.drawing.addShape(new Square(new Point(side, side), side, color));
    }

    /**
     * Return the string who represent every shape.
     *
     * @return the string who represent every shape.
     */
    public String asAscii() {
        String string = "";
        for (int i = 0; i < this.drawing.getHeight(); i++) {
            for (int j = 0; j < this.drawing.getWidth(); j++) {
                if (this.drawing.getShapeAt(new Point(i, j)) != null) {
                    string += this.drawing.getShapeAt(new Point(i, j)).getColor();
                } else {
                    string += " ";
                }
            }
            string += "\n";
        }
        return string;
    }
}
