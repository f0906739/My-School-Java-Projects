public class CruiseShip extends Ship{
    private int maxPassengers;
    public CruiseShip() {
        super();
        maxPassengers = 0;
    }
    public CruiseShip(String n, String y, int max) {
        super(n, y);
        maxPassengers = max;
    }
    public int getMaxPassengers() {
        return maxPassengers;
    }
    public void setMaxPassengers(int max) {
        maxPassengers = max;
    }
    @Override
    public String toString() {
        return "CruiseShip [name: "+ name + ", year: "+ year + ", maxPassengers: " + maxPassengers + "]";
    }
}
