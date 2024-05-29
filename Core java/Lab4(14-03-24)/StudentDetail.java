/*Create a class Student and implement array and display details of student.*/

class Student1
{
	//instance variables
	int sid; 
	String sname;
	Student1(int id,String name) //parameterized constructor
	{
		this.sid=id;
		this.sname=name;
	}
}
class StudentDetail //main class
{
	public static void main(String args[]) //main method
	{
		Student1 []arr=new Student1[5]; //declaring and initializing array of  objects
		//calling the parameterized constructor to assign values
		arr[0]=new Student1(1,"Shweta"); 
		arr[1]=new Student1(2,"Priya");
		arr[2]=new Student1(3,"Shivani");
		arr[3]=new Student1(4,"Priti");
		arr[4]=new Student1(5,"Piyu");
		//printing the array objects
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println("ID: "+arr[i].sid+"     Name: "+arr[i].sname);
		}
	}
}