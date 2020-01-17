
/**
 * Write a description of class StringBomb here.
 *
 * @Kristopher Ferrell 
 * @Mr. Beck
 * @Computer Science - Period 3 
 * @1/17/2020
 */
import static java.lang.System.out;
import java.lang.Character;

public class StringBomb {
    public static void main(String[] args) {
        StringBomb test = new StringBomb();
        String sentence = "Hello";
        out.println("hello");
        out.println(test.convertSentence(sentence));
    }

    public String convertSentence(String sentence) {
        if (sentence.length() % 2 == 0)
            return convertEvenWord(sentence);
        else
            return convertOddWord(sentence);
    }

    public String convertEvenWord(String word) {
        if (word.length() == 2) {
            return word.toUpperCase();
        } else if (word.length() == 4) {
            return "****";
        } else if (word.length() == 6) {
            char zeroth = word.charAt(0);
            char first = word.charAt(1);
            char second = word.charAt(2);
            char third = word.charAt(3);
            char fourth = word.charAt(4);
            char fifth = word.charAt(5);
            return "" + fifth + first + third + second + fourth + zeroth;
        } else if (word.length() == 8) {
            return word.substring(0, 4) + word.substring(4);
        } else {
            throw new IndexOutOfBoundsException("Sentence is too long");
        }
    }

    public String convertOddWord(String word) {
        if (word.length() == 1) {
            return "%";
        } else if (word.length() == 3) {
            return "<" + word.charAt(1) + ">";
        } else if (word.length() == 5) {
            for (int i = 0; i < 5; i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    word = word.substring(0, i) + Character.toLowerCase(word.charAt(i)) + word.substring(i);
                } else
                    word = word.substring(0, i) + Character.toUpperCase(word.charAt(i)) + word.substring(i);
            }
            return word;
        } else if (word.length() == 7) {
            for (int i = 0; i < 7; i++) {
                if (i % 2 == 1) {
                    word = word.substring(0, i) + word.substring(i + 1);
                }
            }
            return word;
        } else {
            throw new IndexOutOfBoundsException("Sentence is too long");
        }
    }
}
