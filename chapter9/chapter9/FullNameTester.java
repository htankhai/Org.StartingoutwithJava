package chapter9;
/**
   This program creates a FullName object, and then calls the object's getLength method 
   before values are established for its reference fields. As a result, this program will
   crash.
*/

public class FullNameTester
{
   public static void main(String[] args)
   {
      int len;  // To hold the name length
      
      // Create a FullName object.
      FullName name = new FullName( "Khai","Htan" , "K");

      // Get the length of the full name.
      len = name.getLength();
      
      System.out.println( len +"\t" +name);
   }
}
