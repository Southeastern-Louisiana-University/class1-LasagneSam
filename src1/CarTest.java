package src1;
import java.util.Scanner;

public class CarTest
{

    public static void main(String[] args)
    {

        Scanner userIn = new Scanner(System.in);
        // System.out.print("What would you like to do?");

        Car car1 = new Car("Toyota", "Toyota", 1946, "Toyota", "Toyota");

        //car1.colour = "Toyota";               // test changing public data field

        car1.SetModel("Ford");      // test using a method to change a private data field

        car1.Drive(15);            // test using a method to change a public data field

        System.out.print(Car.toString(car1));

    }

}
