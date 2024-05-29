/*Write a program to declare stack.Store 10 elements into it.Remove 
4 elements from stack and display it.*/

//importing
import java.util.Stack;

public class StackExample 
{
    public static void main(String[] args) 
	{
        // Create a stack
        Stack<Integer> stack = new Stack<>();

        // Store 10 elements into the stack
        for (int i = 1; i <= 10; i++) 
		{
            stack.push(i);
        }

        System.out.println("Original Stack: " + stack);

        // Remove 4 elements from the stack and display them
        System.out.println("Elements removed from the stack:");
        for (int i = 0; i < 4; i++) 
		{
            int removedElement = stack.pop();
            System.out.println(removedElement);
        }

        System.out.println("Stack after removal: " + stack);
    }
}
