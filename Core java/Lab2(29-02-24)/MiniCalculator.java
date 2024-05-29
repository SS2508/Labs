/*Write a program for creating mini calculator you have to perform 
an operation on basis of user choice until the user press yes to continue
(add,mul,sub,div)*/

import java.util.Scanner;
public class MiniCalculator 
{
	public static void main(String args[]) 
	{
		float solution; //instance variable
		String choice;
		do
		{
			//taking inputs from user
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter 1st Number:");
			int no1=sc.nextInt();
			System.out.print("Enter 2nd Number:");
			int no2=sc.nextInt();
			//taking choice from user
			System.out.print("Choose any one arithmatic operation to do(+,-,*,/):");
			char ch=sc.next().charAt(0);   
			switch(ch)  
			{
				case '+':
					solution=no1+no2; //addition
					System.out.println("Addition of 2 number: "+solution);  
				break;  
				case '-':   
					solution=no1-no2; //subtraction
					System.out.println("Subtraction of 2 number: "+solution);  
				break;  
				case '*':   
					solution=no1*no2; //multiplication
					System.out.println("Multiplocation of 2 number: "+solution);  
				break;  
				case '/':   
					solution=no1/no2; //Division
					System.out.println("Division of 2 number: "+solution);  
				break;    
				default:   
					System.out.println("Enter correct choice!!");  
			}
			//asking u to continue or not
			System.out.print("Do you want to continue calculation(yes/no): ");
			choice=sc.next();
		}while(choice.equals("yes"));		
	}    
}