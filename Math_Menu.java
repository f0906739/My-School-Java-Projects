
/**
 * Write a description of class Math_Menu here.
 *
 * @Kristopher Ferrell
 * @Mr. Beck
 * @Computer Science - Period 3
 * @10/17/19
 */
import java.util.Scanner;
import static java.lang.System.out;

public class Math_Menu {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        int selection;
        double num,power;
        printMenu();
        selection = op.nextInt();

        while (selection != 4) {

            if (selection == 1) {
                out.print("\nEnter the number to be powered: ");
                num = op.nextDouble();
                out.print("\nEnter the value you want the power to be: ");
                power = op.nextDouble();
                out.printf("\n%.2f^%.2f = %.2f", num, power, Math.pow(num,power));
            } else if (selection == 2) {
                out.print("\nEnter the number to be squared: ");
                num = op.nextDouble();
                out.printf("\n%.2f^2 = %.2f", num, num * num);

            } else if (selection == 3) {
                out.print("\nEnter the number to be square rooted: ");
                num = op.nextDouble();
                out.printf("\n%.2f^0.5 = %.2f", num, Math.sqrt(num));
            }
            out.println();
            printMenu();
            selection = op.nextInt();
            
        }
        out.println("\n\n\nGood bye.");
    }

    public static void printMenu() {
        out.println("\n1. Power\n2. Square\n3. Square root\n4. exit\n");
        out.print("Enter selection: ");
    }
}
