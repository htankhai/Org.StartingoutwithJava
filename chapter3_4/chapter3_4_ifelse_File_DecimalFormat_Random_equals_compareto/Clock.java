package chapter3_4_ifelse_File_DecimalFormat_Random_equals_compareto;
import java.text.DecimalFormat;
/**
   This program uses nested loops to simulate a clock.
*/
public class Clock
{
   public static void main(String[] args)
   {
      // Create a DecimalFormat object to format output.
      DecimalFormat dfmt = new DecimalFormat("00");

      // Simulate the clock.
      for (int hours = 0; hours <= 23; hours++)
      {
          for (int minutes = 0; minutes <= 59; minutes++)
          {
             for (int seconds = 0; seconds <= 59; seconds++)
             {
                System.out.print(dfmt.format(hours) + ":"); 
                System.out.print(dfmt.format(minutes) + ":"); 
                System.out.println(dfmt.format(seconds));
              }
          }
       }
   }
}
