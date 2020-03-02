class MainClass
{
    public static void main(String[] args)
    {
        SuperClass testing = new SubClassOne();
        ((SuperClass)testing).print();

    }
}
