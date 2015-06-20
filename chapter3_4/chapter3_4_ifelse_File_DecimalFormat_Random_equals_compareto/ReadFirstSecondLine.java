package chapter3_4_ifelse_File_DecimalFormat_Random_equals_compareto;
import java.util.Scanner;   
import java.io.*;           
/**
   This program reads the first and second line from a file.
 */
public class ReadFirstSecondLine
{
	public static void main(String[] args) throws IOException
	{
		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get the file name.
		System.out.print("Enter the name of a file: ");
		String filename = keyboard.nextLine();

		// Open the file.connect and read the file.
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);

		// Read the first line from the file.
		String line = inputFile.nextLine();

		// Display the line.
		System.out.println("The first line in the file is :");
		System.out.println(line);

		// Read the first line from the file.
		String line2 = inputFile.nextLine();

		// Display the line.
		System.out.println("The second line in the file is :");
		System.out.println(line2);

		// Close the file.
		inputFile.close();
	}
}
