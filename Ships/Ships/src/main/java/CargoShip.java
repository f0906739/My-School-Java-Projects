public class CargoShip extends Ship{
    private int tonnage;

    public CargoShip() {
        super();
        tonnage = 0;
    }
    public CargoShip(String n, String y, int t) {
        super(n, y);
        tonnage = t;
    }
    public int getTonnage() {
        return tonnage;
    }
    public void setTonnage(int t) {
        tonnage = t;
    }
    @Override
    public String toString() {
        return "CargoShip [name: "+name+", tonnage: "+ tonnage+"]";
    }
}
