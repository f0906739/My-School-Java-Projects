
/**
 * Write a description of class SentenceInformation here.
 *
 * @Kristopher Ferrell 
 * @Mr. Beck
 * @Computer Science - Period 3 
 * @11/11/19
 */
import static java.lang.System.out;

public class SentenceInformation {
    public static void main(String[] args) {
        SentenceInformation test = new SentenceInformation();
        // String sentence = "Hello everyone, today we'll play Dungeons and Dragons!";
        String sentence = "HHHHHHHHHHHH";
        out.println(test.consonantCount(sentence));

    }

    public boolean isVowel(char letter) {
        char[] arrayVowels = { 'a', 'e', 'i', 'o', 'u', 'y' };
        boolean isVowel = false;

        for (int i = 0; i < arrayVowels.length; i++) {
            if (letter == (char) arrayVowels[i])
                isVowel = true;
        }
        return isVowel;
    }

    public boolean isConsonant(char letter) {
        char[] arrayConsonants = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','z'};
        if (letter ==)
            return true;
        return false;
    }

    public boolean isPunctuation(char letter) {
        char[] punctuations = { '!', ',', '.', '?', ';', ':' };
        boolean isPunc = false;
        for (int i = 0; i < punctuations.length; i++) {
            if (letter == punctuations[i])
                isPunc = true;
        }
        return isPunc;
    }

    public int consonantCount(String sentence) {
        int total = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char currentLetter = sentence.charAt(i);
            if (isConsonant(currentLetter) == true)
                total += 1;
        }
        return total;
    }
}
