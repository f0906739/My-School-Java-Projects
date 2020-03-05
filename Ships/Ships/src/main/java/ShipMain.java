class ShipMain
{
    public static void main(String[] args)
    {
        // Ship[] ships = {Ship("MyName", 2020)};
        Ship[] ships = new Ship[10];
        ships[0] = new Ship("First", "2020");
        ships[1] = new CruiseShip("Second", "1223153", 50);
        ships[2] = new CargoShip("Third", "2019", 30);
        ships[3] = new Ship("Fourth", "1908");
        ships[4] = new Ship("Fifth", "1901");
        ships[5] = new Ship("Sixth", "1902");
        ships[6] = new Ship("Seventh", "1201");
        ships[7] = new Ship("Eigth", "1903");
        ships[8] = new Ship("Ninth", "1904");
        ships[9] = new Ship("Tenth", "1905");

        for (Ship ship : ships) {
            System.out.println(ship);

        }

    }
}
