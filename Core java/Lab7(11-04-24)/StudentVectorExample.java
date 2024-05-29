/*1.Write a program using Vector to store the list of students details and print the details.*/

import java.util.Vector;

class Student 
{
    private String name;
    private int age;
    private String department;

    public Student(String name, int age, String department) 
	{
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getName() 
	{
        return name;
    }

    public int getAge() 
	{
        return age;
    }

    public String getDepartment() 
	{
        return department;
    }

    @Override
    public String toString() 
	{
        return "Name: " + name + ", Age: " + age + ", Department: " + department;
    }
}

public class StudentVectorExample 
{
    public static void main(String[] args) 
	{
        // Create a Vector to store student details
        Vector<Student> students = new Vector<>();

        // Add student details to the Vector
        students.add(new Student("Alice", 20, "Computer Science"));
        students.add(new Student("Bob", 21, "Electrical Engineering"));
        students.add(new Student("Charlie", 19, "Mechanical Engineering"));

        // Print student details
        System.out.println("Student details:");
        for (Student student : students) 
		{
            System.out.println(student);
        }
    }
}
