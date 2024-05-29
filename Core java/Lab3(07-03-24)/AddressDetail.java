/*Define a class Address represting an address with attributes such as 
street, city, state and zip code. Provide constructor to intialize
these attributes*/

class Address 
{
	//instance variables
	String street,city,state;
	int zip_code;
	//no-arg constructor
	Address() 
	{
		street="Hotagi Road";
		city="Solapur";
		state="Maharashtra";
		zip_code=410003;
		
	}
	//parameterized constructor
	Address(String street,String city,String state,int zip_code)
	{
		this.street=street;
		this.city=city;
		this.state=state;
		this.zip_code=zip_code;
		
	}
	//method for printing the data
	void printData()
	{
		System.out.println("Street: "+street+" City Name: "+city+
						   " State Name: "+state+" ZipCode: "+zip_code);
	}
}
class AddressDetail //main class
{
	public static void main(String args[]) //main method
	{
		Address address=new Address(); //creating object of no arg constructor
		address.printData(); //calling method
		//creating object of parametrized constructor
		Address address1=new Address("Hannur Road","Akkalkot","Maharashtra",413216);
		address1.printData(); //calling method
	}
}