
/**
 * Write a description of class Investment_Calculator here.
 *
 * @Kristopher Ferrell
 * @Computer Science
 * @Mr. Beck - Period 3
 * @9/23/19
 */
import java.util.Scanner;
import static java.lang.System.out;

public class Investment_Calculator
{
    public static void main(String[] args){
        Scanner op = new Scanner(System.in);
        out.print("Enter investment amount: ");
        double investmentAmount = op.nextDouble();
        out.print("Enter annual interest rate percentage: ");
        double annualInterestRate = op.nextDouble();
        out.print("Enter the number of years on investment: ");
        int yearsOnInvest = op.nextInt();

        out.printf("Investing %.2f over %d years at an interest rate of %.2f would earn $%.2f giving you a total of $%.2f", investmentAmount, yearsOnInvest, annualInterestRate*0.01, totallnAccount(investmentAmount, annualInterestRate, yearsOnInvest)-investmentAmount, totallnAccount(investmentAmount, annualInterestRate, yearsOnInvest));
    }
    public static double totallnAccount(double investmentAmount, double annualInterestRate, int yearsOnInvest){
        return (investmentAmount*(Math.pow(1+(annualInterestRate/1200), yearsOnInvest*12)));
    }
}
