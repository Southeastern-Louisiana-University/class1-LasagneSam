package src1;

import java.util.Scanner;

public class reviewPart1
{

    public static void main(String[] args)
    {
        
        Scanner read = new Scanner(System.in);

        System.out.print("Enter a decimal grade value: ");
        
        double score = read.nextDouble();

        System.out.print("Your letter grade is ");
        
        if (score > 100)
        {
            System.out.print("S");
        }
        else if (score >= 90)
        {
            System.out.print("A");
        }
        else if (score >= 80)
        {
            System.out.print("B");
        }
        else if (score >= 70)
        {
            System.out.print("C");
        }
        else if (score >= 60)
        {
            System.out.print("D");
        }
        else if (score >= 0)
        {
            System.out.print("F");
        }
        else
        {
            System.out.print("X");
        }

    }

}
