package src;

public class ArrayReview
{

    public static void main(String[] args)
    {

        // elementType arrayRefVar[];
        double[] gehahahaArray;
        gehahahaArray = new double[10];
        double unhelpfulNumber = 0;

        System.out.println("Before");
        printArray(gehahahaArray);
        System.out.println("The sum of the numbers in gehahahaArray is: " + sumArray(gehahahaArray));

        for (int it = 0; it < gehahahaArray.length; it++)
        {

            if (it == 0)
            {
                unhelpfulNumber = 1;
            }
            else if (it % 2 != 0)
            {
                unhelpfulNumber = unhelpfulNumber / 2 * 17;
            }
            else
            {
                unhelpfulNumber += 17;
            }

            gehahahaArray[it] = unhelpfulNumber;

        }

        System.out.println("After");
        printArray(gehahahaArray);
        System.out.println("The sum of the numbers in gehahahaArray is: " + sumArray(gehahahaArray));

    }

    public static void printArray(double[] doubleArray)
    {

        for (int it = 0; it < doubleArray.length; it++)
        {

            System.out.println("The value of the given doubleArray[" + it + "] is: " + doubleArray[it]);

        }

    }

    public static double sumArray(double[] doubleArray)
    {

        double sum = 0;

        for (int it = 0; it < doubleArray.length; it++)
        {

            sum += doubleArray[it];

        }

        return sum;

    }

}
