/*Write a class with the name Perimeter using function overload that computes 
the perimeter of a square, a rectangle and a circle.
Formula:
Perimeter of a square = 4 * s
Perimeter of a rectangle = 2 * (l + b)
Perimeter of a circle = 2 * (22/7) * r*/

import java.util.Scanner; //importing scanner class

class Perimeter
{
	//method for calculating perimeter of square
	void calculatePerimeter(int s)
	{
		int square_perimeter=4*s; //calculating square perimeter
		System.out.print("Perimeter of square is "+square_perimeter);
	}
	
	//method for calculating perimeter of rectangle
	void calculatePerimeter(int l,int b) //method overloading
	{
		int rectangle_perimeter=2*(l*b); //calculating square perimeter
		System.out.print("Perimeter of rectangle is "+rectangle_perimeter);
	}
	
	//method for calculating perimeter of circle
	void calculatePerimeter(float r) //method overloading
	{
		double circle_perimeter=2*(22/7)*r; //calculating square perimeter
		System.out.print("Perimeter of circle is "+circle_perimeter);
	}
}
class PerimeterCalculation
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in); //object of scanner class
		System.out.println("1.Perimeter of Square");
		System.out.println("2.Perimeter of Rectangle");
		System.out.println("3.Perimeter of Circle");
		System.out.print("Enter your choice for calculation: ");
		int choice=sc.nextInt(); //taking choice from user
		Perimeter p=new Perimeter(); //creating object of class
		
		switch(choice)
		{
			case 1:
			//taking input from user
			System.out.print("Enter side of Square: ");
			int s=sc.nextInt();
			//calling method for calculation
			p.calculatePerimeter(s);
			break;
			case 2:
			//taking input from user
			System.out.print("Enter length of Rectangle: ");
			int l=sc.nextInt();
			System.out.print("Enter breadth of Rectangle: ");
			int b=sc.nextInt();
			//calling method for calculation
			p.calculatePerimeter(l,b);
			break;
			case 3:
			//taking input from user
			System.out.print("Enter radius of Circle: "); 
			float r=sc.nextFloat();
			//calling method for calculation
			p.calculatePerimeter(r);
			break;
			default:
			System.out.println("Invalid choice....");
		}
	}
}