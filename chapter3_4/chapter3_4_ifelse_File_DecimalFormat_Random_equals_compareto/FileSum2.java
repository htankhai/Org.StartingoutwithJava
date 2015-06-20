package chapter3_4_ifelse_File_DecimalFormat_Random_equals_compareto;
//chapter4-17
import java.util.Scanner; 
import java.io.*;
/**
   The program confirms that the Numbers.txt file exists before opening it.
*/
public class FileSum2
{
   public static void main(String[] args) throws IOException
   {
      double sum = 0.0;   // Accumulator, initialized to 0

      // Make sure the file exists.
      File file = new File("C:/Users/htan/EclipseWorkspace/Starting out with Java/sourceCodeChapter3_4/sourceCodeChapter3_4/Numbers.txt");
     
      if (!file.exists())
      {
         System.out.println("The file " + file+" is not found.");
         System.exit(0);
      }
      
      // Open the file for reading.
      Scanner inputFile = new Scanner(file);

      // Read all of the values from the file and calculate their total.
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
