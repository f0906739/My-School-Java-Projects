
/**
 * Write a description of class PiggyBank here.
 *
 * @Kristopher Ferrell @Mr. Beck
 * @Computer Science - Period 3 @11/13/19
 */

public class PiggyBank {
    public int pennies;
    public int nickels;
    public int dimes;
    public int quarters;

    public PiggyBank() {
        pennies = 0;
        nickels = 0;
        dimes = 0;
        quarters = 0;
    }

    public PiggyBank(int pens, int nics, int dims, int quarts) {
        this.pennies = pens;
        this.nickels = nics;
        this.dimes = dims;
        this.quarters = quarts;
    }

    public int getPennies() {
        return pennies;
    }

    public int getNickels() {
        return nickels;
    }

    public int getDimes() {
        return dimes;
    }

    public int getQuarters() {
        return quarters;
    }

    public void addCoins(int pens, int nics, int dims, int quarts) {
        this.pennies += pens;
        this.nickels += nics;
        this.dimes += dims;
        this.quarters += quarts;
    }

    public double total() {
        return (this.pennies * 0.01) + (this.nickels * 0.05) + (this.dimes * 0.1) + (this.quarters * 0.25);
    }
}
