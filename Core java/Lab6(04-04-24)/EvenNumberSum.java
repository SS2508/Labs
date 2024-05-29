/*Write a Java program that calculates the sum of all even numbers present in an
ArrayList of integers.
Sample Input:2,5,8,10,15
Expected Output :sum of even number is 20*/

//importing
import java.util.ArrayList;

public class EvenNumberSum 
{   
    public static int calculateEvenSum(ArrayList<Integer> numbers) 
	{
        int sum = 0;
        for (int num : numbers) 
		{
            if (num % 2 == 0) 
			{
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) 
	{
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(8);
        numbers.add(10);
        numbers.add(15);

        int evenSum = calculateEvenSum(numbers);
        System.out.println("Sum of even numbers is: " + evenSum);
    }
}

