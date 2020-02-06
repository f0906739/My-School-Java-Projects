
/**
 * Write a description of class Mixed_num_V2 here.
 *
 * @Kristopher Ferrell
 * @Mr. Beck
 * @Computer Science - Period 3
 * @9/30/19
 */
import java.util.Scanner;
import static java.lang.System.out;

public class Mixed_num_V2 {
    public static void main(String[] args) {
        int numerator, denominator;
        Scanner op = new Scanner(System.in);

        out.print("Enter the numerator of your fraction (Whole Number): ");
        numerator = op.nextInt();
        out.print("Enter the denominator of your fraction (Whole Number): ");
        denominator = op.nextInt();

        out.printf("%s", Result(numerator, denominator));
    }

    public static int wholeNumber(int numerator, int denominator) {
        return numerator / denominator;
    }

    public static int remainder(int numerator, int denominator) {
        return wholeNumber(numerator, denominator) * numerator - denominator;
    }

    public static String Result(int numerator, int denominator) {
        if (numerator > denominator){
            return "The mixed number derived from the fraction " + numerator + "/" + denominator + " is "
                    + wholeNumber(numerator, denominator) + " " + remainder(numerator, denominator) + "/" + denominator;
        }else{
            return "The mixed number derived from the fraction " + numerator + "/" + denominator + " is "+ numerator + "/" + denominator;
        }
    }
}
