/*Write a Java program to check whether a HashMap contains 
key-value mappings (empty) or not.*/

//importing 
import java.util.HashMap;
import java.util.Map;

public class HashMapCheck 
{
    public static void main(String[] args) 
	{
        // Create an empty HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Check if the HashMap is empty
        if (hashMap.isEmpty()) 
		{
            System.out.println("HashMap is empty.");
        } 
		else 
		{
            System.out.println("HashMap is not empty.");
        }

        // Add some key-value mappings
        hashMap.put("A", 1);
        hashMap.put("B", 2);

        // Check again after adding mappings
        if (hashMap.isEmpty()) 
		{
            System.out.println("HashMap is empty.");
        } 
		else 
		{
            System.out.println("HashMap is not empty.");
        }
    }
}


