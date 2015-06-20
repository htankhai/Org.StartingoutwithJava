package chapter3_4_ifelse_File_DecimalFormat_Random_equals_compareto;
import java.util.Scanner;   
/**
   This program calculates the total number of points a soccer team has earned over 
   a series of games. The user enters a series of point values, then -1 when finished.
 */
public class SoccerPoints
{
	public static void main(String[] args)
	{
		int points;          // Game points
		int totalPoints = 0; // Accumulator initialized to 0

		// Display general instructions.
		System.out.println("Enter the number of points your team");
		System.out.println("has earned for each game in this season." 
		+ "\nEnter 0 when finished.");
		System.out.println();

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter game points or 0 to end: \t");
	
		// Get the first number of points.
		points = keyboard.nextInt();     

		// Accumulate the points until -1 is entered.
		while (points != 0)
		{
			// Add points to totalPoints.
			totalPoints += points;

			// Get the next number of points.
			System.out.print("Enter game points or 0 to end in a series of game : \t");
			points = keyboard.nextInt();     
		}

		// Display the total number of points.
		System.out.println("The total points are " + totalPoints);
	}
}
