package chapter7_8;
/**
   This program uses an invalid subscript with an array.
*/

public class InvalidSubscript_array
{
   public static void main(String[] args)
   {
      int[] values = new int[3];

      System.out.println("I will attempt to store four " +
                         "numbers in a three-element array.");

      for (int index = 0; index < 4; index++)
      {
         System.out.println("Now processing element " + index);
         values[index] = 10;
      }
   }
}
