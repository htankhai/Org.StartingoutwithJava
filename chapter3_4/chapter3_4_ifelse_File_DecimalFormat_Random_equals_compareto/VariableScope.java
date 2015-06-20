package chapter3_4_ifelse_File_DecimalFormat_Random_equals_compareto;
import javax.swing.JOptionPane;  
/**
   This program demonstrates how variables may be declared
   in various locations throughout a program.
*/
public class VariableScope
{
   public static void main(String[] args)
   {
      // Get the user's first name.
      String firstName;
      firstName = JOptionPane.showInputDialog("Enter your " +
                                              "first name.");

      // Get the user's last name.
      String lastName;
      lastName = JOptionPane.showInputDialog("Enter your " +
                                             "last name.");

      // Display a message.
      JOptionPane.showMessageDialog(null, "Hello " + firstName + " " + lastName);
     
      System.exit(0);
   }
}
