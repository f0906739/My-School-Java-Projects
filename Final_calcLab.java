
/**
 * Write a description of class Final_calcLab here.
 *
 * @Kristopher Ferrell
 * @9/6/19
 * @Mr. Beck
 * @Comp. Sci. - Period 3
 */
import static java.lang.System.out;
import java.util.Scanner;

public class Final_calcLab {
    public static void main(String[] args) {
        double firstSem, secondSem, thirdSem, averageWant, averageReal, finalGrade, semesterGrade;

        Scanner op = new Scanner(System.in);

        out.print("Enter the grade you got for the first six weeks: ");
        firstSem = op.nextDouble();
        out.print("Enter the grade you got for the second six weeks: ");
        secondSem = op.nextDouble();
        out.print("Enter the grade you got for the third six weeks: ");
        thirdSem = op.nextDouble();

        averageReal = (firstSem + secondSem + thirdSem) / 3;

        out.print("Enter the average you want for the semester: ");
        averageWant = op.nextDouble();

        finalGrade = (averageWant - (averageReal * .85)) / .15;

        out.printf("You would need to get a %.2f on your finalGrade to have a %.2f for the semester.", finalGrade,
                averageWant);
    }
}
