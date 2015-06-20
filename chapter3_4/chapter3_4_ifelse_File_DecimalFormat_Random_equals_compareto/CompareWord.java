package chapter3_4_ifelse_File_DecimalFormat_Random_equals_compareto;
import java.util.Scanner; 
/**
   This program demonstrates a case insensitive string comparison.
 */
public class CompareWord
{
	public static void main(String[] args)
	{
		String input;     // To hold the user's input

		// Prompt the user to enter the secret word.
		System.out.print("Enter the secret word: ");

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		input = keyboard.nextLine();

		// Determine whether the user entered the secret word.
		if (input.equalsIgnoreCase("Htan Khai"
				+ ""))
		{
			System.out.println("Congratulations! You know the " +
					"secret word!");
		}
		else
		{
			System.out.println("Sorry, that is NOT the " +
					"secret word!");
		}
	}
}
