
/**
 * Write a description of class Run_Book here.
 *
 * @Kristopher Ferrell 
 * @Mr. Beck
 * @Computer Science - Period 3 
 * @11/11/19
 */
import static java.lang.System.out;

public class Run_Book {
    public static void main(String[] args) {
        Book book1 = new Book("Tui T.", "Wings of Fire", 11.00);

        Book book2 = new Book("Rick Riordan", "Percy Jackson: The Lightning Thief", 12.90);

        Book book3 = new Book("Patrick Matthews", "Dragon Run", 3.99);

        Book book4 = new Book("Rick Riordan", "Magnus Chase 1", 12.45);

        Book book5 = new Book("Paul Horowitz", "The Art of Electronics", 41.04);

        out.println(book1.toString());
        out.println();
        out.println(book2.toString());
        out.println();
        out.println(book3.toString());
        out.println();
        out.println(book4.toString());
        out.println();
        out.println(book5.toString());

        out.printf("\nMost Expensive Book: %s", mostExpensive(book1, book2, book3, book4, book5));
    }

    public static String mostExpensive(Book first, Book second, Book third, Book fourth, Book fifth) {
        double result = Math.max(first.getPrice(),
                Math.max(second.getPrice(), Math.max(third.getPrice(), Math.max(fourth.getPrice(), fifth.getPrice()))));

        if (first.getPrice() == result)
            return first.getName();
        else if (second.getPrice() == result)
            return second.getName();
        else if (third.getPrice() == result)
            return third.getName();
        else if (fourth.getPrice() == result)
            return fourth.getName();
        else if (fifth.getPrice() == result)
            return fifth.getName();
        else
            return "error.";
    }
}
