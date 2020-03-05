
/**
 * Write a description of class MainFile here.
 *
 * @Kristopher Ferrell 
 * @Mr. Beck
 * @Computer Science - Period 3 
 * @12/04/19
 */
import static java.lang.System.out;
import java.util.Scanner;

public class MainFile {
    public static void main(String[] args) {
        DataSet data = new DataSet();
        MainFile main = new MainFile();
        Scanner keyboard = new Scanner(System.in);
        int selection, index, value;

        do {
            main.printMenu();
            selection = keyboard.nextInt();

            if (selection == 1) {
                data.gatherData();
            } else if (selection == 2) {
                out.print("Enter index you want to change: ");
                index = keyboard.nextInt();
                out.print("Enter the new value: ");
                value = keyboard.nextInt();
                data.replaceData(index, value);
            } else if (selection == 3) {
                data.print();
            } else if (selection == 4) {
                out.println("Total of all data: " + data.total());
            } else if (selection == 5) {
                out.println("Average of all data: " + data.average());
            } else if (selection == 6) {
                out.println("Maximum value of the data: " + data.max());
            } else if (selection == 7) {
                out.println("Minimum value of the data: " + data.min());
            } else if (selection == 8) {
                data.clear();
            } else if (selection == 9) {
                out.print("Goodbye!");
            }
        } while (selection != 9);

    }

    public void printMenu() {
        out.println(
                "\n1. Gather Data\n2. Replace Data\n3. Print Values\n4. Get Total\n5. Get Average\n6. Get Maximum Value\n7. Get Minimum Value\n8. Clear Data\n9. Exit\n");
    }
}
