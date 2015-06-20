package chapter7_8;
/**
   This program demonstrates a method that accepts a variable number of arguments (varargs).
 */
public class VarargsDemo1
{
	public static void main(String[] args)
	{
		int result;  // To hold a result

		// Call the method with two arguments.
		result = sum(90000, 100000);
		System.out.println(result);

		// Call the method with four arguments.
		result = sum(100000, 120000, 130000, 140000);
		System.out.println(result);

		// Call the method with six arguments.
		result = sum(85000, 90000, 100000, 120000, 130000, 140000, 150000, 160000,175000, 185000,195000, 205000);
		System.out.println(result);
	}

	/**
      The sum method takes a variable number of int arguments and returns their sum.
      @param numbers The numbers to sum.
      @return The sum of the numbers
	 */
	public static int sum(int... numbers)
	{
		int total = 0;  // Accumulator

		// Add all the values in the numbers array.
		for (int val : numbers)
			total += val;

		// Return the total.
		return total;
	}
}