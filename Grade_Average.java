
/**
 * Write a description of class Grade_Average here.
 *
 * @Kristopher Ferrell
 * @Mr. Beck
 * @Computer Science - Period 3
 * @10/3/19
 */
import java.util.Scanner;
import static java.lang.System.out;

public class Grade_Average {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        double grade1, grade2, grade3, grade4;

        out.print("Enter grade one: ");
        grade1 = op.nextDouble();

        out.print("Enter grade two: ");
        grade2 = op.nextDouble();

        out.print("Enter grade three: ");
        grade3 = op.nextDouble();

        out.print("Enter grade four: ");
        grade4 = op.nextDouble();

        out.printf("Your average is %.2f", average(grade1, grade2, grade3, grade4));
        out.println();
        out.printf("You have a(n) %c", gradeLetter(grade1, grade2, grade3, grade4));
    }

    public static char gradeLetter(double average){
    if ( average >= 90 ) 
        return 'A';
    else if (average >= 80)
        return 'B';
    else if (average >= 75)
        return 'C';
    else if (average >= 70)
        return 'D';
    else
        return 'F';
    }

    public static char gradeLetter(double grade1, double grade2, double grade3,
    double grade4){
    return gradeLetter(average(grade1, grade2, grade3, grade4));
    }

    public static double average(double grade1, double grade2, double grade3,
    double grade4){
    return (grade1+grade2+grade3+grade4)/4;
    }

}
