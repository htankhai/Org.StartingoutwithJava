package chapter1_2_primitveDatatype_variable_Joptionpane;
import javax.swing.JOptionPane;
/**
   This program demonstrates using dialogs with JOptionPane.
*/
public class NamesDialog_swing
{
   public static void main(String[] args)
   {
      String firstName;  // The user's first name
      String middleName; // The user's middle name
      String lastName;   // The user's last name
 
      // Get the user's first name as an argument
      firstName = JOptionPane.showInputDialog("What is " +
                               "your first name? ");
      
      // Get the user's middle name as an argument
      middleName = JOptionPane.showInputDialog("What is your middle name? ");
      
      // Get the user's last name as an argument
      lastName =
           JOptionPane.showInputDialog("What is " +
                                "your last name? ");

      // Display a greeting getting first and second arguments
      JOptionPane.showMessageDialog(null, "Hello " +
                      firstName +" " + lastName);
      
      //end program of JOptionPane class 
      System.exit(0);
   }
}
