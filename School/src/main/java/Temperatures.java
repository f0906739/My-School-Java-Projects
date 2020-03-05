
/**
 * Write a description of class Temperatures here.
 *
 * @Kristopher Ferrell 
 * @Mr. Beck
 * @Computer Science - Period 3 
 * @11/22/19
 */
import static java.lang.System.out;
import java.util.Scanner;
import java.util.Arrays;

public class Temperatures {
    private Scanner op = new Scanner(System.in);
    private int days = 7;
    private int[] temps = new int[days];

    public static void main(String[] args) {
        out.println();
        out.println("------------------------------------------------------");

        // each Temperatures member represents 1 week.
        Temperatures week1 = new Temperatures();
        week1.Run();
    }

    public void setData() {
        for (int day = 1; day <= days; day += 1) {
            out.print("Enter the highest temperature for day " + day + ": ");
            temps[day-1] = op.nextInt();
        }
    }

    public int total() {
        int sum = 0;
        for (int day = 1; day <= days; day += 1) {
            sum += temps[day-1];
        }
        return sum;
    }

    public int average() {
        return total() / days;
    }

    public int highest() {
        Arrays.sort(temps);
        return temps[days - 1];
    }

    // prints all temperatures
    public void printTemps() {
        for (int temp : temps) {
            out.print(temp + " ");
        }
    }

    public void Run() {
        setData();
        out.println("\n\n--- Data on your week: ---\n");
        out.println("SUM of all temperatures (total): " + total());
        out.println("AVERAGE temperature: " + average());
        out.println("HIGHEST temperature: " + highest());
        out.println("------------------------------------------------------");
        out.println();
    }
}
