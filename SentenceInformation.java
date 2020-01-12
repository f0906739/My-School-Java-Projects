
/**
 * Write a description of class SentenceInformation here.
 *
 * @Kristopher Ferrell 
 * @Mr. Beck
 * @Computer Science - Period 3 
 * @1/10/20
 */
import static java.lang.System.out;
import java.lang.Character;

public class SentenceInformation {
    public static void main(String[] args) {
        SentenceInformation test = new SentenceInformation();
        String sentence1 = "Hello everyone, today we'll play Dungeons and Dragons!";
        String sentence2 = "HHHHHHHHHHHH";

        out.println(test.isVowel('E'));
        out.println(test.isConsonant('H'));
        out.println(test.isPunctuation(','));
        out.println(test.consonantCount(sentence2));
        out.println(test.vowelCount("abcdEFg"));
        out.println(test.wordCount(sentence1));

    }

    public boolean isVowel(char letter) {
        String vowels = "aeiouy";
        String ourLetter = Character.toString(Character.toLowerCase(letter));
        return vowels.contains(ourLetter);
    }

    public boolean isConsonant(char letter) {
        String consonants = "bcdfghjklmnpqrstvwxz";
        String ourLetter = Character.toString(Character.toLowerCase(letter));
        return consonants.contains(ourLetter);
    }

    public boolean isPunctuation(char letter) {
        String punctuations = "!,.?;:";
        String ourLetter = Character.toString(Character.toLowerCase(letter));
        return punctuations.contains(ourLetter);
    }

    public int consonantCount(String sentence) {
        int total = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char currentLetter = sentence.charAt(i);
            if (isConsonant(currentLetter))
                total += 1;
        }
        return total;
    }

    public int vowelCount(String sentence) {
        int total = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char currentLetter = sentence.charAt(i);
            if (isVowel(currentLetter))
                total += 1;
        }
        return total;
    }

    public int punctuationCount(String sentence) {
        int total = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char currentLetter = sentence.charAt(i);
            if (isPunctuation(currentLetter))
                total += 1;
        }
        return total;
    }

    public int wordCount(String sentence) {
        int total = 1;
        for (int i = 0; i < sentence.length(); i++) {
            char currentLetter = sentence.charAt(i);
            if (currentLetter == ' ') {
                total += 1;
            }
        }
        return total;
    }
}
