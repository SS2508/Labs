/*Write a program to demonstrate static block take two static 
variables name and id and  print them.*/

class Student 
{
	//static variables
	static String name="Shweta"; 
	static int id=10;
}
class StaticBlockExample //main class
{
	static //static block
	{
		System.out.println("This is the static block which executes before main method");
	}
	public static void main(String args[]) //main method
	{
		Student stud=new Student(); //creating object of class
		System.out.println("Student Name: "+stud.name+"   Student ID: "+stud.id);
	}
}