package chapter3_4_ifelse_File_DecimalFormat_Random_equals_compareto;
import java.util.Scanner;   
import java.io.*;          
/**
   This program writes data to a file.
 */
public class FileWriteDemo
{
	public static void main(String[] args) throws IOException
	{
		String filename;      // File name
		String friendName;    // Friend's name
		int numFriends;       // Number of friends

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get the number of friends.
		System.out.print("How many friends do you have? ");
		numFriends = keyboard.nextInt();

		// Consume the remaining newline character.
		keyboard.nextLine();

		// Get the filename.
		System.out.print("Enter the filename: ");
		filename = keyboard.nextLine();

		// Open the file. if file already existed,overwrite the file.
		PrintWriter outputFile = new PrintWriter(filename);

		// Get data and write it to the file.
		for (int i = 1; i <= numFriends; i++)
		{
			// Get the name of a friend.
			System.out.print("Enter the name of friend " +
					"number " + i + ": ");
			friendName = keyboard.nextLine();

			System.out.println(friendName);

			// Write the name to the file.
			outputFile.println(friendName);
		}

		// Close the file.
		outputFile.close();
		System.out.println("Data written to the file.");
	}
}
