
/**
 * Write a description of class CarClass here.
 *
 * @Kristopher Ferrell 
 * @Mr. Beck
 * @Computer Science - Period 3 
 * @11/07/19
 */
import java.util.Scanner;
import static java.lang.System.out;
import java.math.BigDecimal;

public class Car {
    public String make;
    public String model;
    public String year;
    public double distance;
    public double hours;
    public double mins;

    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);

        String make1, model1, year1;
        double distance1, hours1, mins1;
        String make2, model2, year2;
        double distance2, hours2, mins2;

        out.print("Enter the make of car 1: ");
        make1 = op.next();
        out.print("Enter the model of car 1: ");
        model1 = op.next();
        out.print("Enter the year of car 1: ");
        year1 = op.next();
        out.print("Enter the distance(in miles) traveled for the car 1: ");
        distance1 = op.nextDouble();
        out.print("Enter the hours traveled for the car 1: ");
        hours1 = op.nextDouble();
        out.print("Enter the minutes traveled for the car 1: ");
        mins1 = op.nextDouble();

        out.print("Enter the make of car 2: ");
        make2 = op.next();
        out.print("Enter the model of car 2: ");
        model2 = op.next();
        out.print("Enter the year of car 2: ");
        year2 = op.next();
        out.print("Enter the distance(in miles) traveled for the car 2: ");
        distance2 = op.nextDouble();
        out.print("Enter the hours traveled for the car 2: ");
        hours2 = op.nextDouble();
        out.print("Enter the minutes traveled for the car 2: ");
        mins2 = op.nextDouble();

        Car firstCar = new Car(make1, model1, year1, distance1, hours1, mins1);
        Car secondCar = new Car(make2, model2, year2, distance2, hours2, mins2);

        out.println(firstCar.toString());
        out.println(secondCar.toString());
    }

    public Car() {
        make = "";
        model = "";
        year = "";
        distance = 0.0;
        hours = 0.0;
        mins = 0.0;

    }

    public Car(String make, String model, String year, double distance, double hours, double mins) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.distance = distance;
        this.hours = hours;
        this.mins = mins;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public String getYear() {
        return this.year;
    }

    public double getDistance() {
        return this.distance;
    }

    public double getHours() {
        return this.hours;
    }

    public double getMins() {
        return this.mins;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public void setMins(double mins) {
        this.mins = mins;
    }

    public double milesPerHour(double distance, double hours, double min) {
        return distance / (hours + (min / 60));
    }

    public String toString() {
        return "The " + getYear() + " " + getMake() + " " + getModel() + " traveled " + Math.round(getDistance())
                + " miles in " + Math.round(getHours()) + " hours and " + Math.round(getMins())
                + " minutes for an average of " + Math.round(milesPerHour(distance, hours, mins)) + " MPH.";
    }
}