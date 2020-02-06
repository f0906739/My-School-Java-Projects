
/**
 * Write a description of class Rectangle here.
 *
 * @Kristopher Ferrell
 * @Mr. Beck
 * @Period 3
 * @8/27/19
 */
import static java.lang.System.out;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        int length, width, perimeter, area;

        Scanner input = new Scanner(System.in);

        out.println("Enter the length for our scrumptious rectangle: ");
        length = input.nextInt();

        out.println("Enter the width for our scrumptious rectangle: ");
        width = input.nextInt();

        perimeter = length * 2 + width * 2;
        area = length * width;
        out.printf("Perimeter: %d", perimeter);
        out.printf("\nArea: %d", area);
    }
}