
/**
 * Write a description of class DataSet here.
 *
 * @Kristopher Ferrell 
 * @Mr. Beck
 * @Computer Science - Period 3 
 * @12/04/19
 */
import static java.lang.System.out;
import java.util.Scanner;

public class DataSet {
    int[] data;

    public static void main(String[] args) {
        DataSet junkie = new DataSet();
        junkie.gatherData();
        junkie.print();
        junkie.replaceData(5, 10);
        junkie.print();
    }

    public DataSet() {
        data = new int[10];
    }

    public void gatherData() {
        Scanner keyboard = new Scanner(System.in);
        int value;
        for (int index = 0; index < data.length; index += 1) {
            out.print("Enter data: ");
            value = keyboard.nextInt();
            data[index] = value;
        }
    }

    public void replaceData(int index, int value) {
        data[index] = value;
    }

    public void print() {
        out.println();
        for (int index = 0; index < data.length; index += 1) {
            out.print(data[index] + " ");
        }
    }

    public int total() {
        int sum = 0;
        for (int index = 0; index < data.length; index += 1) {
            sum += data[index];
        }
        return sum;
    }

    public int min() {
        int min = data[0];
        for (int index = 0; index < data.length; index += 1) {
            if (data[index] < min)
                min = data[index];
        }
        return min;
    }

    public int max() {
        int max = data[0];
        for (int index = 0; index < data.length; index += 1) {
            if (data[index] > max)
                max = data[index];
        }
        return max;
    }

    public int average() {
        return total() / data.length;
    }

    public void clear() {
        for (int index = 0; index < data.length; index += 1) {
            data[index] = 0;
        }
    }
}
