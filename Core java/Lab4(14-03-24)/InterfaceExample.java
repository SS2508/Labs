/*Define interfaces 'Flyable' and 'Swimmable' with methods 
fly() and swim() respectively. Implement these interfaces in a class 'Bird' 
to demonstrate multiple interface implementation.*/

interface Flyable //interface
{
	public void fly(); //abstract method
}
interface Swimmable //interface
{
	public void swim(); //abstract method
}
class Bird implements Flyable,Swimmable
{
	public void fly() //giving body to abstract method
	{
		System.out.println("Duck can fly");
	}
	public void swim() //giving body to abstract method
	{
		System.out.println("Duck can swim also");
	}	
}
class InterfaceExample //main class
{
	public static void main(String args[]) //main method
	{
		Bird bird=new Bird(); //creating object of class
		bird.fly(); //calling method by object
		bird.swim(); //calling method by object
	}
}