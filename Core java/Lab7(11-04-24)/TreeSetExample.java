/*3.Write a program using TreeSet insert Integer values and print them.*/

import java.util.TreeSet;

public class TreeSetExample 
{
    public static void main(String[] args) 
	{
        // Create a TreeSet to store Integer values
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Insert Integer values into the TreeSet
        treeSet.add(5);
        treeSet.add(10);
        treeSet.add(3);
        treeSet.add(8);
        treeSet.add(15);

        // Print the TreeSet
        System.out.println("Integer values in the TreeSet:");
        for (Integer value : treeSet) 
		{
            System.out.println(value);
        }
    }
}
