
/**
 * Write a description of class Sign_Counter here.
 *
 * @Kristopher Ferrell
 * @Mr. Beck
 * @Computer Science - Period 3
 * @10/22/19
 */
import java.util.Scanner;
import static java.lang.System.out;

public class Sign_Counter {
    public static void main(String[] args) {
        int selection, positives, negatives;
        Scanner op = new Scanner(System.in);
        positives = 0;
        negatives = 0;
        
        out.println("--Sign Counter--\n\n");
        out.print("Enter a whole number (0 to quit): ");
        selection = op.nextInt();

        while (selection != 0) {
            if (selection > 0)
                positives += 1;
            else
                negatives += 1;
            out.print("Enter a whole number (0 to quit): ");
            selection = op.nextInt();
        }
        out.printf("You entered %d positive numbers and %d negative numbers.", positives, negatives);
    }
}
