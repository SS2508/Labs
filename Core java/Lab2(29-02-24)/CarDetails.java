/*Create a class named Car with attributes make, model, year, and color. 
Include a method start() that prints "Car started" and a method stop() that prints "Car stopped".*/

class Car
{
	//Instance variables
	String make;
	String model;
	int year;
	String color;
	Car() //constructor
	{
		this.make="Tata";
		this.model="Nexon";
		this.year=2020;
		this.color="Black";
	}
	void putData()//to display data
	{
		//displaying the values
        System.out.println("Car Details=  Make: "+this.make+" Model: "+this.model+" Year: "+this.year+" Color: "+this.color);
    }
	void start() //method
	{
		System.out.println("Car started");
	}
	void stop() //method
	{
		System.out.println("Car stopped");
	}
}
class CarDetails //main class
{
	public static void main(String args[])  //main method
	{
		Car c=new Car(); //creating object
		//calling methods 
		c.putData();
		c.start();
		c.stop();
	}
}

