
/*
 * Write a description of class Student_ID here.
 *
 * @Kristopher Ferrell
 * @Mr. Beck - Period 3
 * @Computer Science
 * @9/17/19
 */

// https://stackoverflow.com/questions/15961823/utilizing-a-scanner-inside-a-method

import static java.lang.System.out;
import java.util.Scanner;

public class Student_ID {

    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        out.print("Enter your first name: ");
        String firstName = op.nextLine();
        out.print("Enter your Last name: ");
        String lastName = op.nextLine();
        out.print("Enter your grade level: ");
        int gradeLevel = op.nextInt();
        out.print("Enter your id: ");
        int id = op.nextInt();
        out.println(getIDText(firstName,lastName,gradeLevel,id));
    }
    
    public static String getIDText(String firstName, String lastName, int gradeLevel, int id) {
        return "The text for your ID is:\n" + "\tName: " + lastName + ", " + firstName + "\n\n\tGrade: " + gradeLevel
                + "\n\n\tID: " + id;
    }
}
