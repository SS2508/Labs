/*write a program in Java to create a Map Interface where we can 
store the cricketer name in it along with his scores and search 
for the batsman name and display his score.*/

//importing
import java.util.HashMap;
import java.util.Map;

public class CricketerScores 
{
    public static void main(String[] args) 
	{
        // Create a Map to store cricketer names and scores
        Map<String, Integer> cricketerScores = new HashMap<>();

        // Store cricketer names and their scores
        cricketerScores.put("Virat Kohli", 100);
        cricketerScores.put("Rohit Sharma", 75);
        cricketerScores.put("Steve Smith", 90);
        cricketerScores.put("Kane Williamson", 85);

        // Search for a batsman and display his score
        String batsmanName = "Virat Kohli";
        if (cricketerScores.containsKey(batsmanName)) 
		{
            int score = cricketerScores.get(batsmanName);
            System.out.println("Score of " + batsmanName + " is: " + score);
        } 
		else 
		{
            System.out.println("Batsman not found in the records.");
        }
    }
}
