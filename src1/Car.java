package src1;
import java.util.Scanner;

public class Car
{

    private final String make;     // private and final because this will not change
    private final String vin;      // private and final because this will not change
    private final int year;        // private and final because this will not change
    private String model;          // private because this will not change, but not final because it is easy to screw up
    String colour;                 // this may change if the owner gives the car a new paint job
    String ownerRegistered;        // this may change if the car is sold
    String stateRegistered;        // this may change if the car is sold or the owner moves to a different state
    double mileage;                // this will change as the car is driven
    double lastSalePrice;          // this may change if the car is sold
    boolean isNew;                 // this will change as soon as the car is sold from a dealership for the first time

    public Car(String makeArg, String modelArg, int yearArg, String stateArg, String vinArg)     // these are the bare minimum fields for, say,
    {                                                                                            // a dealership to fill out about a brand-new car
        this.make = makeArg;
        this.model = modelArg;
        this.year = yearArg;
        this.mileage = 0;         // since this is incremented with a += operator it needs to be initialised
        this.isNew = true;        // default value
        this.stateRegistered = stateArg;
        this.vin = vinArg;
        this.ownerRegistered = "???";
        this.colour = "???";
    }

    public Car(String makeArg, String modelArg, int yearArg, int mileageArg, boolean isNewArg,    // for a user entering a car they
               String colourArg, String ownerArg, String stateArg, double priceArg,               // currently own
               String vinArg)
    {
        this.make = makeArg;
        this.model = modelArg;
        this.year = yearArg;
        this.mileage = mileageArg;
        this.isNew = isNewArg;
        this.colour = colourArg;
        this.ownerRegistered = ownerArg;
        this.stateRegistered = stateArg;
        this.lastSalePrice = priceArg;
        this.vin = vinArg;
    }

    public static void main(String[] args)
    {

        Scanner userIn = new Scanner(System.in);

        Car carSamuel = new Car("Jeep","Liberty",2012,230000,
                               false, "maroon","Samuel Josiah Dedon","Louisiana",
                                1000,"jgfdbsgbfhgfmndgsdfh");

        System.out.print(toString(carSamuel));

    }

    public static String toString(Car userCar)
    {
        return "Make: " + userCar.make + "\nModel: " + userCar.model + "\nYear: " + userCar.year + "\nMileage: " + userCar.mileage +
                "\nIs it new? " + userCar.isNew + "\nColour: " + userCar.colour + "\nRegistered to: " + userCar.ownerRegistered
                + "\nRegistered in: " + userCar.stateRegistered + "\nLast sale price: " + userCar.lastSalePrice + "\nVIN: " + userCar.vin;
    }

    public void Drive(double milesDriven)
    {
        this.mileage += milesDriven;
        this.isNew = false;
    }

    public void Sell(double price, String newOwner, String newState)
    {
        this.lastSalePrice = price;
        this.ownerRegistered = newOwner;
        this.stateRegistered = newState;
    }

    public void Sell(double price, String newOwner)      // if the user does not give a new state of registration, it retains the previous one
    {
        this.lastSalePrice = price;
        this.ownerRegistered = newOwner;
    }

    public void Paint(String newColour)
    {
        this.colour = newColour;
    }

    public void SetModel(String newModel)
    {
        this.model = newModel;
    }

    public static String getMake(Car userCar)
    {
        return userCar.make;
    }

    public static String getModel(Car userCar)
    {
        return userCar.model;
    }

    public static int getYear(Car userCar)
    {
        return userCar.year;
    }

    public static String getVIN(Car userCar)
    {
        return userCar.vin;
    }

}
