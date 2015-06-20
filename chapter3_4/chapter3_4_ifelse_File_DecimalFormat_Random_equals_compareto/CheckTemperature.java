package chapter3_4_ifelse_File_DecimalFormat_Random_equals_compareto;
/**
   This program assists a technician in the process
   of checking a substance's temperature.
*/
import java.util.Scanner;
public class CheckTemperature
{
   public static void main(String[] args)
   {
      final double MAX_TEMP = 103.5;  //constant  Maximum temperature
      double temperature;             // To hold the temperature
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get the current temperature.
      System.out.print("Enter the substance's Celsius temperature: ");
      temperature = keyboard.nextDouble();
      
      // As long as necessary, instruct the technician to adjust the temperature.
      while (temperature > MAX_TEMP)
      {
         System.out.println("The temperature is too high. Turn the");
         System.out.println("thermostat down and wait 5 minutes.");
         System.out.println("Then, take the Celsius temperature again");
         System.out.print("and enter it here: ");
         temperature = keyboard.nextDouble();
      }
      
      // Remind the technician to check the temperature
      // again in 15 minutes.
      System.out.println("The temperature is acceptable.");
      System.out.println("Check it again in 15 minutes.");
      
      
   // Get the current temperature.
      System.out.print("Enter the substance's Celsius temperature: ");
      temperature = keyboard.nextDouble();
      
      // As long as necessary, instruct the technician to adjust the temperature.
      while (temperature > MAX_TEMP)
      {
         System.out.println("The temperature is too high. Turn the");
         System.out.println("thermostat down and wait 5 minutes.");
         System.out.println("Then, take the Celsius temperature again");
         System.out.print("and enter it here: ");
         temperature = keyboard.nextDouble();
      }
      
      // Remind the technician to check the temperature
      // again in 15 minutes.
      System.out.println("The temperature is acceptable.");
      System.out.println("Check it again in 15 minutes.");
   }
}
