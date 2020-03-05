
/**
 * Write a description of class Circle here.
 *
 * @Kristopher Ferrell @8/28/19
 * @Period 3 
 * @Mr. Beck
 */
import static java.lang.System.out;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner util = new Scanner(System.in);

        out.print("Enter the radius for our SCRUMPTIOUS circle: ");
        int radius = util.nextInt();

        double circumference = 2 * 3.14 * radius;
        double area = 3.14 * (radius ^ 2);

        out.printf("Circumference: %f", circumference);
        out.printf("\nArea: %f", area);
    }
}
