
/**
 * Write a description of class Even_or_odd here.
 *
 * @Kristopher Ferrell
 * @Mr. Beck
 * @Computer Science - Period 3
 * @9/30/19
 */
import java.util.Scanner;
import static java.lang.System.out;

public class Even_or_odd {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        out.print("Enter int: ");
        int num = op.nextInt();
        if (num % 2 == 0) {
            out.printf("%d is even.", num);
        } else {
            out.printf("%d is odd.", num);
        }
    }
}
