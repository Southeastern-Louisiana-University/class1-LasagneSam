package src1;

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

    public void printAccount()
    {

        System.out.println("Account info");

    }

    public static void main(String[] args)
    {

        Account account = new Account();
        Account account1 = new Account("Bob", 2330.89);
        account.printAccount();
        account1.printAccount();
    }

}
