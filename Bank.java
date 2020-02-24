/**
 * 
 * @Kristopher Ferrell 
 * @Mr. Beck
 * @Computer Science - Period 3 
 * @2/21/2020
 *
 */
public class Bank {
    Account  mike = new Account("Mike", "T12564", 1250);
    CheckingAccount  john = new CheckingAccount("John","T52643", 256, 20);
    Account  cecilia = new CheckingAccount("Cecilia", "T24964", 5200, 50);

    public static void main(String[] args) {
        mike.deposit(300);
    }
}
