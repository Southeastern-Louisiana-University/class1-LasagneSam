package src1;

public class Car
{

    private String make;           // private because this will not change
    private String model;          // private because this will not change
    private int year;              // private because this will not change
    double mileage;                // this will change all the time
    private int mileageDisplay;    // private because this will change with mileage BUT it is only for display
    // add three "appropriate" data fields

    public Car(String makeArg, String modelArg, int yearArg)
    {
        this.make = makeArg;
        this.model = modelArg;
        this.year = yearArg;
        this.mileage = 0;
        UpdateMileageDisplay(this.mileage);
    }

    public Car(String makeArg, String modelArg, int yearArg, int mileageArg)
    {
        this.make = makeArg;
        this.model = modelArg;
        this.year = yearArg;
        this.mileage = mileageArg;
        UpdateMileageDisplay(this.mileage);
    }

    public void Drive(double milesDriven)
    {
        this.mileage += milesDriven;
        UpdateMileageDisplay(this.mileage);
    }

    public void UpdateMileageDisplay(double newMileage)
    {
        this.mileageDisplay = (int) mileage;
    }

    // provide "appropriate" methods

}
