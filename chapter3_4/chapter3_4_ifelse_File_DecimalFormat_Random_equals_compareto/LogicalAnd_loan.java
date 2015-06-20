package chapter3_4_ifelse_File_DecimalFormat_Random_equals_compareto;
import javax.swing.JOptionPane;  
/**
   This program demonstrates the logical && operator.
*/
public class LogicalAnd_loan
{
   public static void main(String[] args)
   {
      double salary;       // Annual salary
      double yearsOnJob;   // Years at current job
      String input;        // To hold string input

      // Get the user's annual salary.
      input = JOptionPane.showInputDialog("Enter your annual salary.");
      salary = Double.parseDouble(input);

      // Get the number of years at the current job.
      input = JOptionPane.showInputDialog("Enter the number of " +
                                    "years at your current job.");
      yearsOnJob = Double.parseDouble(input);

      // Determine whether the user qualifies for the loan.
      if (salary >= 30000 && yearsOnJob >= 1)
      {
            JOptionPane.showMessageDialog(null, "You qualify for the loan.");
      }
      else
      {
            JOptionPane.showMessageDialog(null, "You do not qualify for the loan.");
      }
      
      System.exit(0);
   }
}
