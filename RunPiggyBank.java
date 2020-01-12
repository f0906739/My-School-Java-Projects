
/**
 * Write a description of class RunPiggyBank here.
 *
 * @Kristopher Ferrell 
 * @Mr. Beck
 * @Computer Science - Period 3 
 * @11/13/19
 */
import java.util.Scanner;
import static java.lang.System.out;

public class RunPiggyBank {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        PiggyBank bank = new PiggyBank();
        int selection, pens, nics, dims, quarts;
        do {
            out.println("\n1 to add money to your Piggy Bank\n2 to calculate total\n3 to quit");
            selection = op.nextInt();
            if (selection == 1) {
                out.print("Enter the number of pennies...");
                pens = op.nextInt();
                out.print("Enter the number of nickels...");
                nics = op.nextInt();
                out.print("Enter the number of dimes...");
                dims = op.nextInt();
                out.print("Enter the number of quarters...");
                quarts = op.nextInt();

                bank.addCoins(pens, nics, dims, quarts);
            } else if (selection == 2) {
                if (bank.total() == 0.0)
                    out.println(
                            "Hey! To calculate a total you first have to put money in you piggy bank! Right?\nTry again.");
                else
                    out.printf("Your total is $%.2f", bank.total());
            } else {
                out.println("\n\nHappy Savings! Goodbye!");
            }
        } while (selection != 3);
    }

}
