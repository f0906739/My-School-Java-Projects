
/**
 * Write a description of class Multiples_Lab here.
 *
 * @Kristopher Ferrell
 * @Mr. Beck
 * @Computer Science - Period 3
 * @10/15/19
 */
import java.util.Scanner;
import static java.lang.System.out;

public class Multiples_Lab {
    public static void main(String[] args) {
        int x, num_of_multiples;
        Scanner op = new Scanner(System.in);

        out.print("Enter a number: ");
        x = op.nextInt();
        out.printf("Enter the number of multiples you would like to see of the number %d: ", x);
        num_of_multiples = op.nextInt();

        out.printf("The first %d multiples of %d are: ", num_of_multiples, x);
        for (int i = 1; i <= num_of_multiples; i++)
            out.printf("%d ",i*x);
    }
}
