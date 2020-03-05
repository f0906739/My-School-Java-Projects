
/**
 * Write a description of class Number_Lines here.
 *
 * @Kristopher Ferrell
 * @Mr. Beck
 * @Computer Science - Period 3
 * @10/23/19
 */
import java.util.Scanner;
import static java.lang.System.out;

public class Number_Lines {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        int line;
        out.print("--Number Lines--\n\n\n");
        do {
            out.print("How many numbers lines do you want to see (1 or greater)? ");
            line = op.nextInt();
        } while (line <= 0);

        printNumberRange(line);
    }

    public static void printNumberRange(int end) {
        for (int line = 1; line <= end; line++) {
            out.println();
            for (int number = 1; number <= line; number++) {
                out.print(number + " ");
            }
        }
    }
}
