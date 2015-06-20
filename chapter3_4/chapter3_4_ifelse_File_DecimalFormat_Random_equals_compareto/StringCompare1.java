package chapter3_4_ifelse_File_DecimalFormat_Random_equals_compareto;
/**
   This program correctly uses the == and equals() operator to compare two String objects. 
 */
public class StringCompare1{
	public static void main(String [] args)
	{
		String name1 = "Mark",
				name2 = "Mark";

		if (name1 == name2)  
{
			System.out.println(name1 + " and " + name2 +
					" are the same.");
		}
		else
		{
			System.out.println(name1 + " and " + name2 +
					" are the NOT the same.");
		}

		if (name1.equals(name2))
		{
			System.out.println(name1 + " and " + name2 +
					" are the same.");
		}
		else
		{
			System.out.println(name1 + " and " + name2 +
					" are the NOT the same.");
		}

	}
}
