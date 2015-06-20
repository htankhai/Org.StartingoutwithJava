package chapter1_2_primitveDatatype_variable_Joptionpane;
// This program calculates hourly wages plus overtime.
public class Wages
{
   public static void main(String[] args)      
   {
      double regularWages;       // The calculated regular wages.
      double basePay = 45;       // The base pay rate. 
      double regularHours = 40;  // The hours worked less overtime.
      double overtimeWages;      // Overtime wages
      double overtimePay = 61.5; // Overtime pay rate
      double overtimeHours = 10; // Overtime hours worked
      double totalWages;         // Total wages
   
      regularWages = basePay * regularHours; 
      overtimeWages = overtimePay * overtimeHours;
      totalWages = regularWages + overtimeWages;
      System.out.println("Wages for this week are $" +
                         totalWages);
   }
}  
