public class Ship {
    private String name;
    private String year;

    public Ship() {
        name = "";
        year = "";
    }
    public Ship(String n, String y) {
        name = n;
        year = y;
    }
    public String getName() {
        return name;
    }
    public String getYear() {
        return year;
    }
    public void setName(String n) {
        name = n;
    }
    public void setYear(String y) {
        year = y;
    }

    public String toString() {
        return "Ship [name: " + name + ", year: " + year +"];
    }
}
