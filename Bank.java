/**
 * 
 * @Kristopher Ferrell @Mr. Beck
 * @Computer Science - Period 3 @2/21/2020
 *
 */
public class Bank {

    public static void main(String[] args) {
        Account mike = new Account("Mike", "T12564", 1250);
        CheckingAccount john = new CheckingAccount("John", "T52643", 256, 20);
        Account cecilia = new CheckingAccount("Cecilia", "T24964", 5200, 50);

        mike.makeDeposit(300);
        john.withdraw(400);
        cecilia.withdraw(500);

        System.out.println("Cecilia has no bonus.");

        System.out.printf("Mike's balance is $%f", mike.getBalance());
        System.out.printf("John's balance is $%f",john.getBalance());
        System.out.printf("Cecilia's balance is $%f",cecilia.getBalance());

        System.out.println(mike);
        System.out.println(john);
        System.out.println(cecilia);

        Account[] accounts = { mike, john, cecilia };
    }

    public Account maxBalance(Account[] accs) {
        Account max = accs[0];

        for (int i = 1; i < accs.length; i++) {
            if (max.getBalance() < accs[i].getBalance()) {
                max = accs[i];
            }
        }
        return max;
    }
}
