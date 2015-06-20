package sourceCodeChapter5_6;
/**
   This program demonstrates that two methods may have
   local variables with the same name.
*/

public class LocalVars
{
   public static void main(String[] args)
   {
      texas();
      california();
   }
   
   /**
      The texas method has a local variable named birds.
   */
   
   public static void texas()
   {
      int birds = 6000;
      
      System.out.println("In texas there are " +
                         birds + " birds.");
   }
   
   /**
      The california method also has a local variable named birds.
   */
   public static void california()
   {
      int birds = 4500;

      System.out.println("In california there are " +
                         birds + " birds.");
   }
}
