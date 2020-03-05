
/**
 * Write a description of class Distance_btwn_points here.
 *
 * @Kristopher Ferrell @9/4/19 @Mr. Beck
 * @Comp Sci - period 3
 */

import static java.lang.System.out;
import java.util.Scanner;

public class Distance_btwn_points {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double firstx, firsty, secondx, secondy, xpow, ypow, result;

        out.print("Enter the x of the first point: ");
        firstx = keyboard.nextDouble();
        out.print("Enter the y of the first point: ");
        firsty = keyboard.nextDouble();

        out.print("Enter the x of the second point: ");
        secondx = keyboard.nextDouble();
        out.print("Enter the y of the second point: ");
        secondy = keyboard.nextDouble();

        xpow = Math.pow(secondx - firstx, 2);
        ypow = Math.pow(secondy - firsty, 2);

        result = Math.sqrt(xpow + ypow);

        out.printf("The distance between (%.2f, %.2f) and (%.2f, %.2f) is %.2f units", firstx, firsty, secondx, secondy,
                result);
    }
}
