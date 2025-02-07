package src1;
import java.util.Objects;
import java.util.Scanner;

public class Account
{

    private String customer;
    private double balance;

    public Account(){}

    public Account(String name, double balance)
    {

        this.customer = name;
        this.balance = balance;

    }

    public static void printAccount(int userNum, String type, String toPrint)
    {

        System.out.println("Account #" + userNum + " " + type + ": " + toPrint);

    }

    public static void main(String[] args)
    {

        Scanner userIn = new Scanner(System.in);
        int userCode = 0;
        boolean[] accountTrack = new boolean[100];
        Account[] accounts = new Account[100];

        while (userCode >= 0)
        {
            System.out.print("Enter an account number on the interval [0, 99] (negative number to exit): ");
            userCode = userIn.nextInt();

            if (userCode < 0)
            {
                char silly;
                for (int it = 0; it < 100; it++)
                {
                    silly = ((Math.random() < 0.95) ? (char) ((Math.random() * 95.0) + 32) : '\n');
                    System.out.print(silly);
                }
            }
            else if (userCode > 99)
            {
                System.out.println("Out of bounds! Try again!");
            }
            else
            {

                if (!accountTrack[userCode])
                {
                    accounts[userCode] = new Account("", 0);
                    accountTrack[userCode] = true;
                }
                System.out.println();
                printAccount(userCode, "name", ((Objects.equals(accounts[userCode].customer, "")) ? "[empty name]" : accounts[userCode].customer));
                printAccount(userCode, "balance", ((accounts[userCode].balance == 0) ? "[empty balance]" : String.valueOf(accounts[userCode].balance)));
                System.out.print("\nPlease press 1 if you would like to update the account name, 2 if you would like to update the balance, or any other number to exit: ");

                int userOption = userIn.nextInt();

                if (userOption == 1)
                {
                    System.out.print("Enter a new name: ");
                    userIn.nextLine();
                    accounts[userCode].customer = userIn.nextLine();
                }
                else if (userOption == 2)
                {
                    System.out.print("Enter a new decimal balance: ");
                    accounts[userCode].balance = userIn.nextDouble();
                }

            }
        }

        System.out.print("\nHave a great day! (Press enter to exit...)");
        userIn.nextLine();
        userIn.nextLine();

    }

}
