package chapter3_4_ifelse_File_DecimalFormat_Random_equals_compareto;
import java.text.DecimalFormat;
/**
   This program demonstrates the DecimalFormat class.
*/
public class Format1
{
   public static void main(String[] args)
   {
      double number1 = 0.166666666666667;
      double number2 = 1.666666666666667;
      double number3 = 16.666666666666667;
      double number4 = 466.666666666666667;
      double number5 = 2666.666666666666667;

      // Create a DecimalFormat object.
      DecimalFormat formatter = new DecimalFormat("#0.00");

      // Display the formatted variable contents.
      System.out.println(formatter.format(number1));
      System.out.println(formatter.format(number2));
      System.out.println(formatter.format(number3));
      System.out.println(formatter.format(number4));
      System.out.println(formatter.format(number5));
   }
}
