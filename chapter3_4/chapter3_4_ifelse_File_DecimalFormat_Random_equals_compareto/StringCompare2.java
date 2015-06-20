package chapter3_4_ifelse_File_DecimalFormat_Random_equals_compareto;
/**
   This program compares two String objects using the equals method and ==.
 */
public class StringCompare2{
	public static void main(String [] args)
	{
		String name1 = "Mark",
				name2 = "Mark",
				name3 = "Mary",
				name4 = name1,
				name5 = new String(name1);//new string object

		// Compare "Mark" and "Mark" with == //string pool
		if (name1 == name2)  
		{
			System.out.println(name1 + " and " + name2 +
					" are the same.");
		}
		else
		{
			System.out.println(name1 + " and " + name2 +
					" are the not the same.");
		}

		// Compare "Mark" and "Mark" with equals method
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

		//compare Mark and Mary with ==
		if (name1 == name3)  
		{
			System.out.println(name1 + " and " + name3 +
					" are the same.");
		}
		else
		{
			System.out.println(name1 + " and " + name3 +
					" are the not the same.");
		}



		if (name1.equals(name3))
		{
			System.out.println(name1 + " and " + name3 +
					" are the same.");
		}
		else
		{
			System.out.println(name1 + " and " + name3 +
					" are the not the same.");
		}

		System.out.println();
		//compare name1, Mark and name4, Mark with ==.// String pool
		if (name1 == name4)  
		{
			System.out.println(name1 + " and " + name4 +
					" are the same using with ==.");
		}
		else
		{
			System.out.println(name1 + " and " + name4 +
					" are the not the same using with ==.");
		}

		if (name1.equals(name4))
		{
			System.out.println(name1 + " and " + name4 +
					" are the same with equals method.");
		}
		else
		{
			System.out.println(name1 + " and " + name4 +
					" are the not the same.");
		}

		System.out.println();
		//compare name1 and name5 with ==. new string object
		if (name1 == name5)  
		{
			System.out.println(name1 + " and " + name5 +
					" are the same using with ==.");
		}
		else
		{
			System.out.println(name1 + " and " + name5 +
					" are the not the same using with ==.");
		}

		if (name1.equals(name5))
		{
			System.out.println(name1 + " and " + name5 + " are the same.");
		}
		else
		{
			System.out.println(name1 + " and " + name5 + " are the NOT the same.");
		}

	}
}
