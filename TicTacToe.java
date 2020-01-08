
/**
 * Write a description of class TicTacToe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import static java.lang.System.out;

public class TicTacToe {
    private String[] first;
    private String[] second;
    private String[] third;

    public static void main(String[] args) {
        TicTacToe game1 = new TicTacToe();
        TicTacToe game2 = new TicTacToe();
        // out.printf("%s.\n", game1.getFirst());
        // out.printf("%s.\n", game2.getFirst());
        out.println(game1 + "\n" + game2);
        out.println(game1.equals(game1));
    }

    public TicTacToe() {
        first = new String[] { "-", "-", "-" };
        second = new String[] { "-", "-", "-" };
        third = new String[] { "-", "-", "-" };
    }

    public String getFirst() {
        String f = "";
        for (String i : first) {
            f += (i + " ");
        }
        return f;
    }

    public String getSecond() {
        String s = "";
        for (String i : second) {
            s += (i + " ");
        }
        return s;

    }

    public String getThird() {
        String t = "";
        for (String i : third) {
            t += (i + " ");
        }
        return t;
    }

    public boolean equals(TicTacToe comparer) {
        if (comparer instanceof TicTacToe == false)
            return false;
        else
            return getFirst() == comparer.getFirst() && getSecond() == comparer.getSecond()
                    && getThird() == comparer.getThird();
    }

    public String toString() {
        return "\n" + getFirst() + "\n" + getSecond() + "\n" + getThird();
    }
}
