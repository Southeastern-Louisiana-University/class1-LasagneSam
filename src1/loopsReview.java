package src1;
import java.util.Scanner;

public class loopsReview
{

    public static void main(String[] args)
    {

        Scanner scammer = new Scanner(System.in);
        double grade = 0;
        double totalGrade = 0;
        int gradeCount = 0;
        double gradeAverage;
        while (grade >= 0)
        {

            System.out.print("Please type a decimal grade on the domain [0, 110] (-1 to terminate): ");
            grade = scammer.nextDouble();
            if (grade > 110)
            {

                System.out.println("you slimy little devil I told you the upper end of the domain was 110. the grade has been rejected");

            }
            else
            {

                totalGrade += grade;
                gradeCount++;
                gradeAverage = totalGrade / gradeCount;
                System.out.print("for " + gradeCount + " grades, grade average is now " + gradeAverage + ", which comes to a letter grade of ");
                if (gradeAverage > 110)
                {
                    System.out.print("S");
                }
                else if (gradeAverage >= 90)
                {
                    System.out.print("A");
                }
                else if (gradeAverage >= 80)
                {
                    System.out.print("B");
                }
                else if (gradeAverage >= 70)
                {
                    System.out.print("C");
                }
                else if (gradeAverage >= 60)
                {
                    System.out.print("D");
                }
                else if (gradeAverage >= 0)
                {
                    System.out.print("F");
                }
                else
                {
                    System.out.print("X");
                }
                System.out.println();

            }

        }

    }

}
