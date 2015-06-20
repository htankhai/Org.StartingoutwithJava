package chapter1_2_primitveDatatype_variable_Joptionpane;
// This program demonstrates the String class's length method.
public class StringLength
{
   public static void main(String[] args)
   {
      String name = "Hermann";
      int stringSize;

      stringSize = name.length();
      System.out.println(name + " has " + stringSize +
                         " characters.");
   }
}
