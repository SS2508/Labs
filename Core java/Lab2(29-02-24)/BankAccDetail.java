/*Implement a bank account class showing method overloading with methods for deposit, withdrawal 
and balance inquiry.Use method overloading to handle different types of withdrawals*/

class BankAccount 
{
	//instance variables
    int acc_no;
    double balance;
    BankAccount(int acc_noo, double balance) //parameterized constructor
	{
        this.acc_no = acc_noo;
        this.balance = balance;
    }
    void transaction(double amount)//Method overloading for deposit 
	{
        balance += amount; //if user will call transaction method with only amount
        System.out.println("Deposit Amount: " + amount);
        System.out.println("Total Balance: " + balance);
    }
    void transaction(double amount, String method) //Method overloading for withdrawal
	{
        if (method.equals("withdraw")) //checking for condition
		{
            if (amount > balance) 
			{
                System.out.println("Insufficient balance");
            } 
			else 
			{
                balance-=amount;
                System.out.println("Withdrawal Amount (withdraw): " + amount);
                System.out.println("Total Balance: " + balance);
            }
        } 
		else 
		{
            System.out.println("Invalid withdrawal method");
        }
    }
    void transaction() //Method overloading for balance inquiry
	{
        System.out.println("Total Balance: " + balance);
    }
}
class BankAccDetail //main class
{
    public static void main(String args[]) //main method
	{
        BankAccount acc = new BankAccount(123456, 5000); //creating object of class and initializing
        acc.transaction(1000); //calling transaction method for Deposit
        acc.transaction(500, "withdraw");//calling transaction method for withdrawal
        acc.transaction(); //calling transaction method for Balance inquiry
    }
}
