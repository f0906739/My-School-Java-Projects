public class Rectangles
{
    private double length;
    private double width;

    public Rectangles() {
        length = 0.0;
        width = 0.0;
    }

    public Rectangles(double len, double w) {
        this.length = len;
        this.width = w;
    }

    public void setLength(double len) {
        length = len;
    }

    public void setWidth(double w) {
        width = w;
    }

    public double getLength( ) {
        return length;
    }

    public double getWidth( ) {
        return this.width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return (length*2) + (width*2);
    }

    public String saySomething() {
        return "This is my say Something method in Rectangles.";
    }

    public String toString() {
        return "Length: "+this.length+"\nWidth: "+this.width;
    }
}
