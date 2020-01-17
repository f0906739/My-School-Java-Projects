
/**
 * Write a description of class Social here.
 *
 * @Kristopher Ferrell 
 * @Mr. Beck
 * @Computer Science - Period 3 
 * @1/16/2020
 */
import static java.lang.System.out;
import java.util.Scanner;

public class SocialRunner {
    public static void main(String[] args) {
        String num;
        Social social = new Social();
        Scanner op = new Scanner(System.in);
        do {
            out.print("Enter your SS#: ");
            num = op.nextLine();
            social.setNumber(num);
            out.println(social.checkValid());
        } while (social.checkValid() == "bad");
    }
}
