package chapter7_8;
import java.util.ArrayList; 

/**
   This program demonstrates an ArrayList.
*/

public class ArrayListDemo1{
   public static void main(String[] args)
   {
      // Create an ArrayList to hold some names.
      ArrayList<String> nameList = new ArrayList<String>();
      
      // Add some names to the ArrayList.
      nameList.add("Htan");
      nameList.add("James");
      nameList.add("Catherine");
      nameList.add("Bill");
      
      // Now display the items in nameList.
      System.out.println(nameList);
      
      // Display the items in nameList and their indices.
      for (int index = 0; index < nameList.size(); index++)
      {
         System.out.println("Index: " + index + " Name: " +
                            nameList.get(index));
      }
      
      // Display the size of the ArrayList.
      System.out.println("\nThe ArrayList has " +
                         nameList.size() +
                         " objects stored in it.");

      // Now display the items in nameList.
      for (int index = 0; index < nameList.size(); index++)
         System.out.println(nameList.get(index));
      
   // Now display the items in nameList.
      for (String name : nameList)
         System.out.println(name);
      
   // Now remove the item at index 1.
      nameList.remove(1);
      
      System.out.println("The item at index 1 is removed. " +
                         "Here are the items now.");
                         
      // Display the items in nameList and their indices.
      for (int index = 0; index < nameList.size(); index++)
      {
         System.out.println("Index: " + index + " Name: " +
                            nameList.get(index));
      }
      
      // Now insert an  item at index 1.
      nameList.add(1, "Mary");
      
      System.out.println("Mary was added at index 1. " +
                         "Here are the items now.");
                         
      // Display the items in nameList and their indices.
      for (int index = 0; index < nameList.size(); index++)
      {
         System.out.println("Index: " + index + " Name: " +
                            nameList.get(index));
      }
      
      // Now replace the item at index 1.
      nameList.set(2, "Becky");
      
      System.out.println("Catherine was replaced with Becky. " +
                         "Here are the items now.");
                         
      // Display the items in nameList and their indices.
      for (int index = 0; index < nameList.size(); index++)
      {
         System.out.println("Index: " + index + " Name: " +
                            nameList.get(index));
      }
   }
}