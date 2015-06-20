package chapter3_4_ifelse_File_DecimalFormat_Random_equals_compareto;
import java.util.Scanner;    
/**
   This program demonstrates a user controlled for loop.
*/
public class UserSquares
{
   public static void main(String[] args)
   {
      int number;    // Loop control variable
      int maxValue;  // Maximum value to display
          
      System.out.println("I will display a table of " +
                         "numbers and their squares.");

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter starting number : \t");
      number = keyboard.nextInt();
      
      // Get the maximum value to display.
      System.out.print("How high should I go? \t");
      maxValue = keyboard.nextInt();

      // Display the table.
      System.out.println("-----------------------");
      System.out.println("Number\tNumber Squared");
      System.out.println("-----------------------");
      for (number = number; number <= maxValue; number++)
      {
         System.out.println(number + "\t\t" + 
                            number * number);
      }
      System.out.println("-----------------------");
   }
}
