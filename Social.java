
/**
 * Write a description of class Social here.
 *
 * @Kristopher Ferrell 
 * @Mr. Beck
 * @Computer Science - Period 3 
 * @1/16/2020
 */
import static java.lang.System.out;

public class Social {
    private boolean isValid;
    private String number;

    public Social() {
        isValid = false;
        number = "";
    }

    public Social(String num) {
        isValid = false;
        this.number = num;
    }

    public String checkValid() {
        if (number.charAt(3) == '-' && number.charAt(6) == '-') {
            return number.substring(number.length() - 4);
        } else
            return "bad";
    }

    public void setNumber(String newNum){
        this.number = newNum;
    }

}
