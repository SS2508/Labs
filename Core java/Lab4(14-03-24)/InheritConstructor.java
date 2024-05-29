/*Create a base class with constructor and inherit it in the derived class and 
call the base class constructor in derived class.*/

class Super //parent class
{
	Super()
	{
		System.out.println("This is super class Constructor");
	}
}
class SubClass extends Super //inheriting parent class
{
	SubClass()
	{
		super(); //calling Super class constructor by using super keyword
		System.out.println("This is SubClass constructor and deriving the Super class constructor");
	}
}
class InheritConstructor //main class
{
	public static void main(String args[]) //main method
	{
		SubClass subclass=new SubClass(); //creating object
	}
}