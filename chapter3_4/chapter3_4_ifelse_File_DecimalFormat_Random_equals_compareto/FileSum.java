package chapter3_4_ifelse_File_DecimalFormat_Random_equals_compareto;
import java.util.Scanner; 
import java.io.*;
//chapter 4
/**
   This program reads a series of numbers from a file and
   accumulates their sum.
*/
public class FileSum
{
   public static void main(String[] args) throws IOException
   {
      double sum = 0.0;  

      // Open the file for reading.//
      File file = new File("C:\\Users\\htan\\workspace1\\Org.Starting out with Java\\chapter3_4\\chapter3_4_ifelse\\Numbers.txt");
      Scanner inputFile = new Scanner(file);

      // Read all of the values from the file
      // and calculate their total.
      while (inputFile.hasNext())
      {
         // Read a value from the file.
         double number = inputFile.nextDouble();
         
         // Add the number to sum.
         sum = sum + number;
      }

      // Close the file.
      inputFile.close();

      // Display the sum of the numbers.
      System.out.println("The sum of the numbers in " +
                         "Numbers.txt is " + sum);
   }
}
