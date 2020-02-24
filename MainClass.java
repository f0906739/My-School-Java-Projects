class MainClass
{
    public static void main(String[] args)
    {
        Rectangles r1 = new Rectangles(2, 4);
        System.out.println(r1);

        Square s1 = new Square(5);
        System.out.println(s1);

        Square s2 = new Square(6);
        System.out.println(s2.perimeter());
        // System.out.println((Rectangles)(s2.saySomething()));

        System.out.println(s2);
    }
}
