/*Create a program with a logic that throws the ArrayIndexOutOfBoundsException 
while accessing elements in an array.
[Hint: Use array and loop and try to access the element beyond the last index]*/

public class ArrayOutOfBoundsExample //main class
{
    public static void main(String[] args) //main method
	{
        int[] arr = {1, 2, 3, 4, 5}; //array initialization

        // Accessing elements beyond the last index of the array
        for (int i = 0; i <= arr.length; i++) 
		{
            try //try block for exception handling 
			{
                System.out.println("Element at index " + i + ": " + arr[i]);
            } 
			catch (ArrayIndexOutOfBoundsException e) //catch block for try block
			{
                System.out.println("Exception caught: " + e.getMessage());
            }
        }
    }
}
