package sourceCodeChapter5_6;
/**
   This program demonstrates a method with a parameter.
 */
public class PassArg_toMethod{
	public static void main(String[] args)
	{
		int x = 10;

		System.out.println("I am passing initialized value : " + x + 
				"\n values to method displayValue.");
		displayValue(5);                       // Pass by value 5
		displayValue(x);                       // Pass by variable x  
		displayValue(x * 4);                   // Pass by variable x 
		displayValue(Integer.parseInt("700")); // Pass by value 700
		System.out.println("Now I am back in main.");
		System.out.println("The value of x is " + x);
	}

	/**
      The displayValue method displays the value of its integer parameter.
	 */
	public static void displayValue(int num)
	{
		System.out.println("The value is " + num);
	}
}
