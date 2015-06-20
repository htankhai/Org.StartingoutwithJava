package sourceCodeChapter5_6;
/**
   This program demonstrates that only a copy of an argument is passed into a method.
 */
public class PassByValue{
	public static void main(String[] args)
	{
		int number = 99; // number starts with 99

		// Display the value in number.
		System.out.println("number is " + number);

		// Call changeMe method, passing the value in number as an argument.
		changeMe(number);

		// Display the value in number again.
		System.out.println("number is " + number + " in main method");
		
		//instance variable
		number = 90;
		System.out.println("number is " + number + " in main method");
	}

	/**
      The changeMe method accepts an argument and then
      changes the value of the parameter. local variable.
	 */

	public static void changeMe(int myValue)
	{
		System.out.println("I am changing the value from " +myValue);

		// Change the myValue parameter variable to 0.
		myValue = 0;

		// Display the value in myValue.
		System.out.println("Now the value is " + myValue + " in method changeMe");

		myValue = 10;

		// Display the value in myValue.
		System.out.println("Now the value is " + myValue + " in method changeMe");
	}
}
