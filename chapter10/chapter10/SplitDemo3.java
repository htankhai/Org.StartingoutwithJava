package chapter10;
/**
	This program demonstrates the String class's
	split method. Several different delimiters are used.
*/

public class SplitDemo3{
   public static void main(String[] args)
   {
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