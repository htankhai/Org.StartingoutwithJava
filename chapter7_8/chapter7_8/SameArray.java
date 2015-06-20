package chapter7_8;
/**
   This program demonstrates that two variables can reference the same array.
*/

public class SameArray{
   public static void main(String[] args)
   {
      int[] array1 = { 2, 4, 6, 7, 8, 9, 10, 11 };
      int[] array2 = array1;

      // Change one of the elements using array1.
      array1[1] = 200;

      // Change one of the elements using array2.
      array2[4] = 1000;
      
      // Change one of the elements using array1.
      array1[2] = 300;

      // Display all the elements using array1
      System.out.println("The contents of array1:");
      for (int value : array1)
         System.out.print(value + " ");
      System.out.println();

      // Display all the elements using array2
      System.out.println("The contents of array2:");
      for (int value : array2)
         System.out.print(value + " ");
      System.out.println();
   }
}