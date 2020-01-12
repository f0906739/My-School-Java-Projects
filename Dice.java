import java.util.Random;

public class Dice {
    private static Random rg;
    private int faceValue;
    private int numSides;

    // defaults to a 6-sided die
    public Dice() {
        this.rg = null;
        this.numSides = 6;
        this.faceValue = 0;
    }

    public Dice(int sides) {
        this.rg = null;
        this.numSides = sides;
        this.faceValue = 0;

    }

    // accessors
    // returns the current face value of this Dice object
    public int getFaceValue() {
        return faceValue;

    }

    // returns the number of sides for this Dice object
    public int getSides() {
        return faceValue;

    }

    // rolls this Dice object. The face value is updated and returned.
    public int roll() {
        this.faceValue = rg.nextInt((6)+1);
        return faceValue;

    }
}
