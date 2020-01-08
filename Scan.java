
/**
 * Write a description of class Scan here.
 *
 * @kris
 * @9/3/19
 */

import java.util.Scanner;

import static java.lang.System.out;

public class Scan
{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        double payCheck,price;
        int numFriends,remainder;
            
        out.println("You’ve just received your first paycheck, and");
        out.println("you want to use it to take friends to a movie!");
        out.print("Enter the amount of your paycheck: ");
        payCheck = keyboard.nextDouble();
        out.print("\nEnter the price of a movie: ");
        price = keyboard.nextDouble();
        numFriends = (int) (payCheck/price);
        out.print("\nYou can take " + numFriends);
        out.println(" friends to the movies!");
    }
}
