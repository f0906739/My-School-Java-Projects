
/**
 * Write a description of class Mixed_num here.
 *
 * @Kristopher Ferrell
 * @8/30/19
 * @Mr. Beck
 * @Period 3
 */
import static java.lang.System.out;

import java.util.Scanner;

public class Mixed_num {
    public static void main(String[] args) {
        int numerator, denominator, whole_num, remainder;
        Scanner util = new Scanner(System.in);

        out.print("Enter the numerator: ");
        numerator = util.nextInt();

        out.print("Enter the denominator: ");
        denominator = util.nextInt();

        whole_num = numerator / denominator;
        remainder = numerator - (whole_num * denominator);
        if (numerator > denominator){
            out.printf("%d %d/%d", whole_num, remainder, denominator);
        }else if (numerator == denominator) {
            out.print("1");
        }else {
            out.printf("%d/%d", numerator, denominator);
        }
    }
}
