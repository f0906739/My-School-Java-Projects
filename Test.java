import java.util.Collections;
import java.util.ArrayList;
import static java.lang.System.out;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        int [] nums = {1,2,3,4,5,6,7,8,9,0};
        ArrayList <Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i<nums.length; i++){
            if (nums[i] > 4)
                numbers.add(nums[i]);
        }

        out.println(numbers);

    }
}
