package bankAccount;
/**
   This program demonstrates how the BankAccount class constructor throws 
   custom exceptions.
*/
public class BankAccountTest
{
   public static void main(String [] args)
   {
      // Force a NegativeStartingBalance exception.
      try
      {
         BankAccount account =
                     new BankAccount(-100.0);
      }
      catch(NegativeStartingBalance e)
      {
         System.out.println(e.getMessage());
      }
      
      try
      {
         BankAccount2 account2 =
                     new BankAccount2(-100.0);
      }
      catch(NegativeStartingBalance e)
      {
         System.out.println(e.getMessage());
      }
      
   }
}