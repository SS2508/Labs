/*Create a class named Employee with attributes name,employeeId,designation and salary.
Include method calculateBonus() that returns 5% of salary as bonus.*/

import java.util.Scanner;

class Employee//creating employee class
{
	//instance variables
	String ename;
	int eid;
	String edesignation;
	float esalary;
	void getData()//to get data from user
	{
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter employee name:");//taking name from user
        ename=sc.next();
        System.out.print("Enter employee ID:");//taking ID
        eid=sc.nextInt();
        System.out.print("Enter employee designation:");//taking designation
        edesignation=sc.next();
		System.out.print("Enter employee salary:");//taking salary
        esalary=sc.nextFloat();
    }
	void calculateBonus()//method for calculation of bonus
	{
		double bonus=esalary*0.05;//calculating bonus
		System.out.println("5% of salary as bonus is "+bonus);
	}
}
class EmployeeDetail//main class
{
	public static void main(String args[])//main method
	{
		Employee emp=new Employee();//creating object of class
		emp.getData();//calling the get method
		emp.calculateBonus();//calling the bonus method
	}
}
