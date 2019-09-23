package esi.alt.g39801.asciPaint;

import java.util.Scanner;

/**
 * //javadoc
 * @author g39801
 */
public class Application { // autres package : view

    private AsciiPaint paint;

    public static void main(String[] args) {
        start();

    }

    public static void start() {
        AsciiPaint paint = new AsciiPaint(80, 80);
        Scanner clavier = new Scanner(System.in);
        String resultOfDisplay;
        System.out.println("Choose the form to draw :");
        resultOfDisplay = clavier.nextLine();
        displayOfShape(resultOfDisplay, paint, clavier);
        System.out.println(paint.asAscii());
    }

    private static void displayOfShape(String resultOfDisplay, AsciiPaint paint,
            Scanner clavier) {
        String[] tab;
        while (!"show".equals(resultOfDisplay)) {
            tab = resultOfDisplay.split("\\s+");
            switch (tab[0]) {
                case "add":
                    if ("square".equals(tab[1])) { // attention si commande incomplète: add -> tab.length == x
                        creatSquare(paint, tab);
                    } else if ("rectangle".equals(tab[1])) {
                        creatRectangle(paint, tab);
                    } else if ("circle".equals(tab[1])) {
                        creatCircle(paint, tab);
                    }
                    break;
                case "help":
                    System.out.println("three command are accept:\n "
                            + "add rectangle with argument\n "
                            + "add circle with argument\n "
                            + "add square with argument\n");
            }
            resultOfDisplay = clavier.nextLine();
        }
    }

    private static void creatSquare(AsciiPaint paint, String[] tab) {
        try {
            paint.newSquare(Integer.parseInt(tab[2]), Integer.parseInt(tab[3]),
                    Double.parseDouble(tab[4]), tab[5].charAt(0));
        } catch (NumberFormatException nbs) {
            System.err.println("requiert an integer");
        }
    }

    private static void creatRectangle(AsciiPaint paint, String[] tab) {
        try {
            paint.newRectangle(Integer.parseInt(tab[2]), Integer.parseInt(tab[3]),
                    Double.parseDouble(tab[4]),
                    Double.parseDouble(tab[5]), tab[6].charAt(0));
        } catch (NumberFormatException nbs) {
            System.out.println("requiert an integer");
        }
    }

    private static void creatCircle(AsciiPaint paint, String[] tab) {
        try {
            paint.newCircle(Integer.parseInt(tab[2]), Integer.parseInt(tab[3]),
                    Integer.parseInt(tab[4]), tab[5].charAt(0));
        } catch (NumberFormatException nbs) {
            System.out.println("requiert an integer");
        }
    }

}
