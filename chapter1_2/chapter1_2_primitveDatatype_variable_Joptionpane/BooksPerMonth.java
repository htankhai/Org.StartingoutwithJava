package chapter1_2_primitveDatatype_variable_Joptionpane;
/**
   This program demonstrates how a cast operator
   can be used to prevent integer division.
 */
public class BooksPerMonth
{
	public static void main(String[] args)
	{
		int books = 15,        // Number of books to read
				months = 6;        // Number of months to read them
		double booksPerMonth;  // Average books per month

		// Display the number of books planned to read and the number months planned 
		//to read them.
		System.out.println("I plan to read " + books + " books in "+ months + " months.");

		// Calculate the average books per month.
		booksPerMonth = (double) books / months;

		// Display the average number of books per month.
		System.out.print("I will read an average of ");
		System.out.print(booksPerMonth);
		System.out.println(" books per month.");
	}
}
