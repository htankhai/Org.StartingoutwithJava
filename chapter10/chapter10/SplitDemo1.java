package chapter10;
import java.util.StringTokenizer;
/**
	This program demonstrates the String class's split method.
 */
public class SplitDemo1{
	public static void main(String[] args)
	{
		// Create a string to tokenize.
		String str = "one two three four";

		// Get the tokens, using a space delimiter.
		String[] tokens = str.split(" ");

		// Display the tokens.
		for (String s : tokens)
			System.out.println(s);
		
		  // Create a string to tokenize.
	      String str2 = "one and two and three and four";
		
		// Get the tokens, using " and " as the delimiter.
	      String[] tokens2 = str2.split(" and ");
	      
	      // Display the tokens.
	      for (String s : tokens2)
	         System.out.println(s);
	      
	      // Create a string to tokenize.
	      String str3 = "joey@sillyyoubooks.com";
	      
	      // Get the tokens, using @ and . as delimiters.
	      String[] tokens3 = str3.split("[@.]");
	      
	      // Display the tokens.
	      for (String s : tokens3)
	         System.out.println(s);   
	      
	   // Create a string to tokenize.
	      String str4 = "Jill$Billy%Becky*Tara&Mary";
	      
	      // Get the tokens, using a space delimiter.
	      String[] tokens4 = str4.split("[$%*&]");
	      
	      // Display the tokens.
	      for (String s : tokens4)
	         System.out.println(s);
	 
	}
}