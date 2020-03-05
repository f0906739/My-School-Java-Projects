
/**
 * Write a description of class Book here.
 *
 * @Kristopher Ferrell 
 * @Mr. Beck
 * @Computer Science - Period 3 
 * @11/11/19
 */

public class Book {
    public String author;
    public String name;
    public double price;

    public Book() {
        author = "";
        name = "";
        price = 0.0;
    }

    public Book(String auth, String title, double cost) {
        this.author = auth;
        this.name = title;
        this.price = cost;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setAuthor(String new_author) {
        this.author = new_author;
    }

    public void setName(String new_name) {
        this.name = new_name;
    }

    public void setPrice(double new_price) {
        this.price = new_price;
    }

    public String toString() {
        //if zero pennies, add 0 at the end of price in the string
        if (price%(int)(price) == 0)
        return "Author: " + author + "\nTitle: " + name + "\nPrice: $" + price+"0";
        else
        return "Author: " + author + "\nTitle: " + name + "\nPrice: $" + price;
    }
}
