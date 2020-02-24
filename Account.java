/**
 * 
 * @Kristopher Ferrell 
 * @Mr. Beck
 * @Computer Science - Period 3 
 * @2/21/2020
 *
 */
public class Account {
    private String name;
    private String AccountID;
    private double balance;

    public Account() {
        name = "";
        AccountID = "";
        balance = 0.0;
    }
    public Account(String n, String id, double b) {
        name = n;
        AccountID = id;
        balance = b;
    }
    public String getName() {
        return name;
    }
    public String getAccountID() {
        return AccountID;
    }
    public double getBalance() {
        return balance;
    }

    public void setName(String n) {
        name = n;
    }
    public void setAccountID(String id) {
        AccountID = id;
    }
    public void setBalance(double b) {
        balance = b;
    }

    public void makeDeposit(double deposit) {
        balance += deposit;

    }
    public void withdraw(double withdraw) {
        balance -= withdraw;
        
    }
    public String toString() {
        return "\nName of Account: "+name+"\nID of Account: "+AccountID+"\nBalance of Account: "+balance+"\n";
    }
}
