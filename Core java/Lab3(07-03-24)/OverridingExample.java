/*Create a program in java to implement multilevel inheritance and hierarchical inheritance.
Take classes like : Doctor , Surgeon and Nurse
Create methods and show method overriding.*/

class Doctor //super class
{
	void degree() //method 
	{
		System.out.println("Doctors complete MD degree");
	}
}
class Surgeon extends Doctor //inheriting class doctor
{
	void degree() //method overriding
	{
		System.out.println("Surgeon completes Post-Graduation degree");
	}
}
class Nurse extends Surgeon  //inheriting class surgeon
{
	void degree() //method overriding
	{
		System.out.println("Nurse completes BSN degree");
	}
}
class OverridingExample //main class
{
	public static void main(String args[]) //main method
	{
		Doctor d=new Doctor(); //cretaing object
		d.degree(); //calling method
		Surgeon s=new Surgeon(); //cretaing object
		s.degree(); //calling method
		Nurse n=new Nurse(); //cretaing object 
		n.degree(); //calling method
	}
}