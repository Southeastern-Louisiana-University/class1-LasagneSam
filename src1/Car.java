package src1;

public class Car
{

    private String make;           // private because this will not change
    private String model;          // private because this will not change
    private int year;              // private because this will not change
    int mileage;                   // this will change all the time
    // add three "appropriate" data fields

    public Car(String makeArg, String modelArg, int yearArg)
    {
        this.make = makeArg;
        this.model = modelArg;
        this.year = yearArg;
        this.mileage = 0;
    }

    public Car(String makeArg, String modelArg, int yearArg, int mileageArg)
    {
        this.make = makeArg;
        this.model = modelArg;
        this.year = yearArg;
        this.mileage = mileageArg;
    }

    public void Drive(int milesDriven)
    {
        this.mileage += milesDriven;
    }

    // provide "appropriate" methods

}
