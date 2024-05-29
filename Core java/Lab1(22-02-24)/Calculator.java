/*WAP to create a simple calculator program that takes user input for two 
numbers and an operator (+, -, *, /) and performs the corresponding arithmetic
 operation using conditional statements.*/

import java.util.Scanner;

class Calculator//main class
{
	public static void main(String args[])//main method
	{
		int solution; //variable for storing the answer
		Scanner sc=new Scanner(System.in);//creating object of scanner class
		System.out.print("Enter First Number:");//taking 1st no from user
		int no1=sc.nextInt();
		System.out.print("Enter Second Number:");//taking 1st no from user
		int no2=sc.nextInt();
		System.out.print("Choose one arithmatic opertion to do(+,-,*,/):");//taking the choice from user
		char op=sc.next().charAt(0);
		if(op == '+')
		{
			solution=no1+no2;//addition
			System.out.println("Addition of 2 Numbers=" +solution);
		}
		else if(op == '-')
		{
			solution=no1-no2;//substraction
			System.out.println("Substraction of 2 Numbers=" +solution);
		}
		else if(op == '*')
		{
			solution=no1*no2;//multiplication
			System.out.println("Multiplication of 2 Numbers=" +solution);
		}
		else if(op == '/')
		{
			solution=no1/no2;//division
			System.out.println("Division of 2 Numbers=" +solution);
		}
		else
		{
			System.out.println("Enter valid input!!!");
		}
	}
}