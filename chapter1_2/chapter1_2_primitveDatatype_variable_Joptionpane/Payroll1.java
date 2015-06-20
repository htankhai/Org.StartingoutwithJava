package chapter1_2_primitveDatatype_variable_Joptionpane;
public class Payroll1
{
   public static void main(String[] args)
   {
      int hours = 40;
      double grossPay, payRate = 55.0;

      grossPay = hours * payRate;
      System.out.println("Your gross pay is $" + grossPay);
   }
}