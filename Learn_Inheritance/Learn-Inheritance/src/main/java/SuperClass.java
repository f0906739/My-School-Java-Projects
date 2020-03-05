class SuperClass
{
    private int myBalance;
    private double someNumber;
    private String word;

    public void doSomething() {
        System.out.println("hi");

    }
    // public SuperClass() {
    //     print();
    //     System.out.println("And HELLO WORLD!" + myBalance + word + someNumber);
    //     myBalance = 3;

    // }
    public void print() {
        System.out.println("Printed from SuperClass");
    }

    public void addBalance(int num) {
        myBalance += num;
    }

    public int getMyBalance() {
        return myBalance;
    }

}
