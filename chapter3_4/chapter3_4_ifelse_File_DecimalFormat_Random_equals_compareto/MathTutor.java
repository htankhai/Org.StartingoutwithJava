package chapter3_4_ifelse_File_DecimalFormat_Random_equals_compareto;
import java.util.Scanner; 
import java.util.Random;  
/**
   This program demonstrates the Random class.
 */
public class MathTutor
{
	public static void main(String[] args)
	{
		int number1;      // A number
		int number2;      // Another number
		int number3;
		int number4;
		int sum;          // The sum of the numbers
		int userAnswer;   // The user's answer

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Create a Random class object.
		Random randomNumbers = new Random();

		// Get two random numbers.
		number1 = randomNumbers.nextInt(200);
		number2 = randomNumbers.nextInt(200);
		number3 = randomNumbers.nextInt(200);
		number4 = randomNumbers.nextInt(200);
		
		// Calculate the answer.
		sum = number1 + number2;

		// Display an addition problem.
		System.out.println("What is the answer to the " +
				"following problem?");
		System.out.print(number1 + " + " +
				number2 + " = ? \t");

		// Get the user's answer.
		userAnswer = keyboard.nextInt();

		// Display the user's results.
		if (userAnswer == sum)
			System.out.println("Correct!");
		else
		{
			System.out.println("Sorry, wrong answer. " +
					"The correct answer is " +
					sum);
		}
		
		// Calculate the answer.
				sum = number3 + number4;

				// Display an addition problem.
				System.out.println("What is the answer to the " +
						"following problem?");
				System.out.print(number3 + " + " +
						number4 + " = ? \t");

				// Get the user's answer.
				userAnswer = keyboard.nextInt();

				// Display the user's results.
				if (userAnswer == sum)
					System.out.println("Correct!");
				else
				{
					System.out.println("Sorry, wrong answer. " +
							"The correct answer is " +
							sum);
				}

	}
}
