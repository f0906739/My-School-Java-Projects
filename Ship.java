
/**
 * Write a description of class Ship here.
 *
 * @Kristopher Ferrell 
 * @Mr. Beck
 * @Computer Science - Period 3 
 * @11/06/19
 */
public class Ship {
    private int x;
    private int y;
    private int speed;

    public static void main(String[] args) {
        Ship first = new Ship(15, 60, 1);
        Ship second = new Ship(15, 60, 10);
        System.out.println(first.toString());
        first.increaseSpeed(5);
        System.out.println(first.sameLocation(first,second));
        System.out.println();
        System.out.println(first.toString());
    }

    // sets all values to 0.
    public Ship() {
        this.x = 0;
        this.y = 0;
        this.speed = 0;
    }

    // initializes x and y but the speed is still 0.
    public Ship(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // user can initialize x, y, AND speed.
    public Ship(int x, int y, int spd) {
        this.x = x;
        this.y = y;
        this.speed = spd;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSpeed() {
        return speed;
    }

    public void increaseSpeed(int addSpeed) {
        this.speed += addSpeed;
    }

    public boolean sameLocation(Ship ship1, Ship ship2) {
        if (ship1.getX() == ship2.getX() && ship1.getY() == ship2.getY())
            return true;
        else
            return false;
    }

    public String toString() {
        return "X-Coordinate: " + x + "\nY-Coordinate: " + y + "\nSpeed: " + speed;
    }
}
