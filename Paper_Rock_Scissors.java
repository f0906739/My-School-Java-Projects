
/**
 * Write a description of class Paper_Rock_Scissors here.
 *
 * @Kristopher Ferrell
 * @Mr. Beck
 * @Computer Science - Period 3
 * @10/4/19
 */
import java.util.Scanner;
import static java.lang.System.out;

public class Paper_Rock_Scissors {
    public static void main(String[] args) {
        int choice, computerChoice;
        out.println("---Menu---\n\n  1. Paper\n  2. Rock\n  3. Scissors\n");

        Scanner op = new Scanner(System.in);
        out.print("Enter selection: ");
        choice = op.nextInt();

        computerChoice = (int) (Math.random() * 3) + 1;

        out.printf("You picked %s.\nThe computer picked %s.", choiceText(choice), choiceText(computerChoice));
        out.println();
        out.printf("%s", gameResults(choice, computerChoice));
    }

    public static String choiceText(int choice) {
        if (choice == 1)
            return "paper";
        else if (choice == 2)
            return "rock";
        else if (choice == 3)
            return "scissors";
        else
            return "";
    }

    public static String gameResults(int playerChoice, int computerChoice) {
        if (playerChoice == computerChoice)
            return "Tie game.";
        else if (playerChoice == 3 && computerChoice == 2)
            return "Rock knocks out scissors you lose!";
        else if (playerChoice == 3 && computerChoice == 1)
            return "Scissors cuts paper you win!";
        else if (playerChoice == 2 && computerChoice == 3)
            return "Rock knocks out scissors you win!";
        else if (playerChoice == 2 && computerChoice == 1)
            return "Paper covers rock you lose!";
        else if (playerChoice == 1 && computerChoice == 3)
            return "Scissors cuts paper you lose!";
        else if (playerChoice == 1 && computerChoice == 2)
            return "Paper covers rock you win!";
        else
            return "Please re-enter your input.";
    }

}
