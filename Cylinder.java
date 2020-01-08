
/**
 * Write a description of class Cylinder here.
 *
 * @Kristopher Ferrell
 * @Comuter Science
 * @Mr. Beck - Period 3
 * @9/18/19
 */
import static java.lang.System.out;

import java.util.Scanner;

public class Cylinder {

    public static void main(String[] args) {

        double radius, height;

        Scanner op = new Scanner(System.in);

        out.print("Enter the cylinder radius: ");
        radius = op.nextDouble();
        out.print("Enter the cylinder height: ");
        height = op.nextDouble();
        out.printf("Surface Area: %.3f", surfaceArea(radius, height));
        out.println();
        out.printf("Volume: %.3f", volume(radius, height));
    }

    public static double surfaceArea(double radius, double height) {
        return (2 * radius * radius * Math.PI) + 2 * Math.PI * radius * height;
    }

    public static double volume(double radius, double height) {
        return radius * radius * Math.PI * height;
    }
}
