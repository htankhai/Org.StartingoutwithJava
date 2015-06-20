package chapter3_4_ifelse_File_DecimalFormat_Random_equals_compareto;
import java.text.DecimalFormat;
/**
   This program demonstrates the DecimalFormat class.
 */
public class Format3
{
	public static void main(String[] args)
	{
		double number1 = 123.899;
		double number2 = 1233.899;
		double number3 = 12345.899;
		double number4 = 123456.899;
		double number5 = 1234567.899;
		double number6 = 0.12;
		double number7 = 0.05;

		// Create a DecimalFormat object.
		DecimalFormat formatter = new DecimalFormat("#,##0.00");
		//DecimalFormat formatter = new DecimalFormat("#0%");

		// Display the formatted variable contents.
		System.out.println(formatter.format(number1));
		System.out.println(formatter.format(number2));
		System.out.println(formatter.format(number3));
		System.out.println(formatter.format(number4));
		System.out.println(formatter.format(number5));
		System.out.println(formatter.format(number6));
		System.out.println(formatter.format(number7));
	}
}
