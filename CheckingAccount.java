/**
 * 
 * @Kristopher Ferrell 
 * @Mr. Beck
 * @Computer Science - Period 3 
 * @2/21/2020
 *
 */

public class CheckingAccount extends Account{
    private double bonus;
    static final double FEE=50.0;

    public CheckingAccount() {
        super();
        bonus = 0.0;
    }

    public CheckingAccount(String n, String id, double bal, double bon) {
        super(n,id,bal);
        bonus = bon;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public void makeDeposit(double deposit) {
        double bal = getBalance();
        setBalance(bal-deposit+bonus);

    }

    @Override
    public void withdraw(double withdraw) {
        double bal = getBalance();
        if (bal < 500)
            bal -= withdraw - FEE;
        else
            bal -= withdraw;
    }

    public String toString() {
        String n = getName();
        String id = getAccountID();
        double bal = getBalance();
        return "\nName of Account: "+n+"\nID of Account: "+id+"\nBalance of Account: "+bal+"\nBonus amount of Checking Account: "+bonus;
    }
}

