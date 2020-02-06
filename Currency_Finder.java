
/**
 * Write a description of class Currency_Finder here.
 *
 * @Kristopher Ferrell
 * @Mr. Beck
 * @Computer Science - Period 3
 * @9/19/19
 */
import java.util.Scanner;
import static java.lang.System.out;

public class Currency_Finder {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        int twenties, tens, fives, ones, quarters, dimes, nickels, pennies;
        out.print("Enter a monetary value: ");
        double money = op.nextDouble();
        double calculatemoney = money;
        calculatemoney += 0.001;
        twenties = (int) calculatemoney / 20;
        calculatemoney -= 20 * twenties;
        tens = (int) calculatemoney / 10;
        calculatemoney -= 10 * tens;
        fives = (int) (calculatemoney - tens) / 5;
        calculatemoney -= 5 * fives;
        ones = (int) (calculatemoney);
        calculatemoney -= ones;
        quarters = (int) (calculatemoney / 0.25);
        calculatemoney -= quarters * 0.25;
        dimes = (int) (calculatemoney / 0.1);
        calculatemoney -= dimes * 0.1;
        nickels = (int) (calculatemoney / 0.05);
        calculatemoney -= nickels * 0.05;
        pennies = (int) (calculatemoney / 0.01);
        calculatemoney -= pennies * 0.01;
        out.println(currencyValues(money, twenties, tens, fives, ones, quarters, dimes, nickels, pennies));
    }

    public static String currencyValues(double money, int twenties, int tens, int fives, int ones, int quarters,
            int dimes, int nickels, int pennies) {
        return "The currency tokens required to make $" + money + " are:\n\n\t" + "Twenties: " + twenties
                + "\n\n\tTens: " + tens + "\n\n\tFives: " + fives + "\n\n\tOnes: " + ones + "\n\n\tQuarters: "
                + quarters + "\n\n\tDimes: " + dimes + "\n\n\tNickels: " + nickels + "\n\n\tPennies: " + pennies;
    }
}
