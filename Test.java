import java.util.Collections;
import java.util.ArrayList;
import static java.lang.System.out;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        // String vowels = "aeiouy";

        // ArrayList<String> test = new ArrayList<String>();
        // test.add("h");
        // test.add("i");
        // test.set(1,"a");
        // test.add("y");
        // test.add("n");

        // for (int i = test.size()-1; i>=0; i--){
        //     if ( vowels.contains(test.get(i)) )
        //         test.remove(i);
        // }
        // out.println(test); //expect "i" and "y" to be removed.

        ArrayList<String> sam;
        sam = new ArrayList<String>();
        sam.add("chair");
        sam.add("five");
        sam.add("pig");
        for (int i = 0; i<4; i+=2){
            sam.add(i,"fun");
        }
        out.println(sam);
    }

}
