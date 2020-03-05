class Square extends Rectangles
{
    private double side;

    public Square() {
        super();
        side = 0.0;
    }

    public Square(double s) {
        super(s,s);
        side = s;
    }

    public void setSide(double s) {
        side = s;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double area() {
        return side * side;
    }

    // @Override
    // public double perimeter() {
    //     return 4 * side;
    // }

    @Override
    public String saySomething() {
        return "This is my say Something method in Square.";

    }

    public String toString() {
        return "\n The Side of the Square is: " + side + "\nThe Area of the Square is: " + area() + "\nThe Perimeter of the Square is: " + perimeter();
    }
}
