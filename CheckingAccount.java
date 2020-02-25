/**
 * 
 * @Kristopher Ferrell @Mr. Beck
 * @Computer Science - Period 3 @2/21/2020
 *
 */

public class CheckingAccount extends Account {
    private double bonus;
    static final double FEE = 50.0;

    public static void main(String[] args) {
        CheckingAccount testCheckingAccount = new CheckingAccount("Bay", "59Z", 100.29, 50.5);
        System.out.println(testCheckingAccount.bonus);
    }

    public CheckingAccount() {
        super();
        bonus = 0.0;
    }

    public CheckingAccount(String n, String id, double bal, double bon) {
        super(n, id, bal);
        bonus = bon;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public void makeDeposit(double deposit) {
        double bal = getBalance();
        setBalance(bal + deposit + bonus);

    }

    @Override
    public void withdraw(double withdraw) {
        double bal = getBalance();
        if (withdraw > bal)
            System.out.println("Insufficient funds");
        else if (bal < 500)
            setBalance(bal - withdraw - FEE);
        else
            setBalance(bal - withdraw);
    }

    @Override
    public String toString() {
        String n = getName();
        String id = getAccountID();
        double bal = getBalance();
        return "\nName of Checking Account: " + n + "\nID of Checking Account: " + id
                + "\nBalance of Checking Account: " + bal + "\nBonus amount of Checking Checking Account: " + bonus;
    }
}
