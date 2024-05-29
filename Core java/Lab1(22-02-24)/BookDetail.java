/*Create a class name book with attribute title,author,ISBN and price.
Include methods to get and set the attribute*/
import java.util.Scanner;

class Book//creating book class
{
	//instance variables
	String title,author;
	long isbn;
	float price;
	void getData()//to get data from user
	{
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Title of book:");//taking title from user
        title=sc.next();
        System.out.print("Enter Author of book:");//taking author name
        author=sc.next();
        System.out.print("Enter ISBN of book:");//taking isbn number
        isbn=sc.nextLong();
		System.out.print("Enter Price of book:");//taking price
        price=sc.nextFloat();
    }
	void putData()//to display data given by user
	{
        System.out.println("The Title of book: "+this.title+" Author of book: "+this.author+" ISBN of book: "+this.isbn+
							" Price of book: "+this.price);
    }
}
class BookDetail//main class
{
	public static void main(String args[])//main method
	{
		Book b1=new Book();//creating object for class
		b1.getData();//calling the method
		b1.putData();
	}
}