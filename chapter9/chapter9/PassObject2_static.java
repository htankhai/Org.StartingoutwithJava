package chapter9;
/**
   This program passes an object as an argument.
   The object is modified by the receiving method.
 */
public class PassObject2_static
{
	public static void main(String[] args)
	{
		// Create a Rectangle object.
		Rectangle box = new Rectangle(12.0, 25.0);

		// Display the object's contents.
		System.out.println("Contents of the box object:");
		System.out.println("Length : " + box.getLength() +
				"\t Width : " + box.getWidth());

		// Pass a reference to the object to the displayRectangle method.      
		displayRectangle(box);

		// Pass a reference to the object to the
		// changeRectangle method.
		changeRectangle(box);

		// Display the object's contents again.
		System.out.println("\nNow the contents of the box object are:");
		System.out.println("Length : " + box.getLength() +
				" Width : " + box.getWidth());
	}

	/**
   The displayRectangle method displays the length and width of a rectangle.
   @param r A reference to a Rectangle
   object.
	 */

	public static void displayRectangle(Rectangle r)
	{
		// Display the length and width.
		System.out.println("\nLength : " + r.getLength() +
				" Width : " + r.getWidth() + " in display Rectangle method.");
	}

	/**
      The changeRectangle method sets a Rectangle
      object's length and width to 0.
      @param r The Rectangle object to change.
	 */

	public static void changeRectangle(Rectangle r)
	{
		r.setLength(30.0);
		r.setWidth(20.0);
	}
}
