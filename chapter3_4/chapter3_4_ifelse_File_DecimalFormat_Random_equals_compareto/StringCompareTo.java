package chapter3_4_ifelse_File_DecimalFormat_Random_equals_compareto;
/**
   This program compares two String objects using
   the compareTo method.
 */

public class StringCompareTo
{
	public static void main(String [] args)
	{
		String name1 = "Mary",
				name2 = "Mark",
				name3 = "Mark",
				name4 = "mark";

		// Compare "Mary" and "Mark"
		if (name1.compareTo(name2) < 0)
		{
			System.out.println(name1 + " is less than " + name2);
		}
		else if (name1.compareTo(name2) == 0)
		{
			System.out.println(name1 + " is equal to " + name2);
		}
		else if (name1.compareTo(name2) > 0)
		{
			System.out.println(name1 + " is greater than " + name2);
		}
		
		//compare name2 and name3
		if (name2.compareTo(name3) < 0)
		{
			System.out.println(name2 + " is less than " + name3);
		}
		else if (name2.compareTo(name3) == 0)
		{
			System.out.println(name2 + " is equal to " + name3);
		}
		else if (name2.compareTo(name3) > 0)
		{
			System.out.println(name2 + " is greater than " + name3);
		}
		
		//compare name2 and name4
		if (name2.compareTo(name4) < 0)
		{
			System.out.println(name2 + " is less than " + name4);
		}
		else if (name2.compareTo(name4) == 0)
		{
			System.out.println(name2 + " is equal to " + name4);
		}
		else if (name2.compareTo(name4) > 0)
		{
			System.out.println(name2 + " is greater than " + name4);
		}
	}
}
