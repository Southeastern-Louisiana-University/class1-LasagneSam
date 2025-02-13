package src1;
import java.util.Scanner;

public class Car
{

    private final String make;           // private because this will not change
    private String model;          // private because this will not change
    private final int year;              // private because this will not change
    private final String vin;            // private because this will not change
    double mileage;                // this will change as the car is driven

    boolean isNew;                 // this will change as soon as the car is sold from a dealership for the first time
    String colour;                 // this may change if the owner gives the car a new paint job
    String ownerRegistered;        // this may change if the car is sold
    String stateRegistered;        // this may change if the car is sold or the owner moves to a different state
    double lastSalePrice;          // this may change if the car is sold

    public Car(String makeArg, String modelArg, int yearArg, String stateArg, String vinArg)     // these are the bare minimum fields for, say,
    {                                                                                            // a dealership to fill out about a brand-new car
        this.make = makeArg;
        this.model = modelArg;
        this.year = yearArg;
        this.mileage = 0;         // since this is incremented with a += operator it needs to be initialised
        this.isNew = true;        // default value
        this.stateRegistered = stateArg;
        this.vin = vinArg;
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

    public static void main(String args[])
    {

        Scanner userIn = new Scanner(System.in);
        // System.out.print("What would you like to do?");
        Car car1 = new Car("Toyota", "Toyota", 199, "Toyota", "Toyota");
        car1.colour = "Toyota";
        car1.model = "Ford";
        System.out.println("car1 colour: " + car1.colour);
        System.out.println("car1 model: " + car1.model);
        car1.Drive(15);
        System.out.println("car1 miles: " + car1.mileage);

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
