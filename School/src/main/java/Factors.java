
/**
 * Write a description of class Factors here.
 *
 * @Kristopher Ferrell
 * @Mr. Beck
 * @Computer Science - Period 3
 * @10/15/19
 */
import java.util.Scanner;
import static java.lang.System.out;

public class Factors {
    public static void main(String[] args) {
        int number, count;
        Scanner op = new Scanner(System.in);

        out.print("What number do you want to see the factors of (Positive Number)?: ");
        number = op.nextInt();

        out.printf("The factors of %d are: ", number);

        count = 1;
        while (count <= number){
            if (count == number)
            out.printf("%d.",count);
            else if (isFactor(number, count) == true)
            out.printf("%d, ",count);
            count++;
        }
    }

    public static boolean isFactor(int number, int possibleFactor) {
        if (number % possibleFactor == 0)
        return true;
        else
        return false;
    }
}
