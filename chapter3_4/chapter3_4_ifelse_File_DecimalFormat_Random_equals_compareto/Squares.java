package chapter3_4_ifelse_File_DecimalFormat_Random_equals_compareto;
/**
   This program demonstrates the for loop.
*/
public class Squares
{
   public static void main(String [] args)
   {
      int number; // Loop control variable

      System.out.println("Number\t\tNumber Squared");
      System.out.println("------------------------------");
      
      for (number = 1; number <= 10; number++)
      {
         System.out.println(number + "\t\t" +
                            number * number);
      }
   }
}
