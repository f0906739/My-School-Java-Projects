import static java.lang.System.out;

public class TestString {
    public static void main(String[] args) {

        String s = "Cold weather is really great!";
        String sp[] = s.split("[ea]");			
        for (int j = 0; j < sp.length; j++)
        out.println(sp[j]);			

    }
}