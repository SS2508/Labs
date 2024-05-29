/*Create two thread.one thread is finding the average of the first 10 numbers 
and another thread is printing the square of the number stored in array 
arr={1,20,50,15,30} and make sure both threads can execute simultaneously.*/

public class ThreadExample //main class
{
    public static void main(String[] args) //main method
	{
        int[] arr = {1, 20, 50, 15, 30}; //array intialization
        
        // Thread for finding the average
        Thread avgThread = new Thread(()
		{
            double sum = 0;
            for (int i = 1; i <= 10; i++) 
			{
                sum += i;
            }
            double avg = sum / 10;
            System.out.println("Average of first 10 numbers: " + avg);
        });
        
        // Thread for printing squares of numbers in the array
        Thread squareThread = new Thread(()
		{
            for (int num : arr) 
			{
                System.out.println("Square of " + num + ": " + (num * num));
            }
        });
        
        // Start both threads
        avgThread.start(); 
        squareThread.start();
    }
}
