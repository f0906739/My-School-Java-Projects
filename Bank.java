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
        Bank bank = new Bank();
        Bank[] accounts = {bank.mike, bank.john, bank.cecilia};

        bank.mike.deposit(300);
        bank.john.withdraw(400);
        bank.cecilia.withdraw(500);
        bank.cecilia.deposit(bonus);
        System.out.printf("Cecilia's bonus amount is $%d",bank.cecilia.getBonus());

        for (Bank bank : accounts) {
            System.out.printf("%s's balance is $%d",bank.getName(), bank.getBalance());
        }

        // System.out.printf("Mike's balance is $%d",bank.mike.getBalance());
        // System.out.printf("John's balance is $%d",bank.john.getBalance());
        // System.out.printf("Cecilia's balance is $%d",bank.cecilia.getBalance());
        for (Bank bank : accounts) {
            System.out.println(bank.toString());

        }


        // System.out.println(bank.mike);
        // System.out.println(bank.john);
        // System.out.println(bank.cecilia);
    }
    // public Bank maxBalance() {

    // }
}
