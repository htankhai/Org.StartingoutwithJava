package RectangleClassPhase4;
import RectangleClassPhase5.Rectangle;
/**
   This program demonstrates the Rectangle class's setLength, setWidth, 
   getLength, getWidth, and getArea methods.
 */
public class RectangleDemo
{
	public static void main(String[] args)
	{
		// Create a Rectangle object.
		Rectangle livingRoom = new Rectangle(20.0, 20.0);
		Rectangle kitchen = new Rectangle(15.0,10.0);
		Rectangle bedroom = new Rectangle(20.0, 15.0);
		Rectangle masterBedroom = new Rectangle(20.0, 25.0);
		Rectangle bathRoom_2 = new Rectangle(20.0, 20.0);

		// Create  livingRoom a Rectangle object, passing 20.0 and
		// 20.0 as arguments to the constructor.

		// Display the length.
		System.out.println("The livingRoom 's length is " + livingRoom .getLength() + "feet");

		// Display the width.
		System.out.println("The livingRoom 's width is " + livingRoom .getWidth() + "feet");

		// Display the area.
		System.out.println("The livingRoom 's area is " + livingRoom .getArea() + "square-feet");
		

		// Set length to 15.0 and width to 10.0.

		// Display the length.
		System.out.println("The kitchen's length is " +
				kitchen.getLength()+ "feet.");

		// Display the width.
		System.out.println("The kitchen's width is " +
				kitchen.getWidth()+ "feet.");

		// Display the area.
		System.out.println("The kitchen's area is " +
				kitchen.getArea() + "square-feet.");

		// Create bedroom a Rectangle object, passing 10.0 and
		// 15.0 as arguments to the constructor.

		// Display the length.
		System.out.println("The bedroom 's length is " + bedroom .getLength()+ "feet");

		// Display the width.
		System.out.println("The bedroom 's width is " + bedroom .getWidth() + "feet");

		// Display the area.
		System.out.println("The bedroom 's area is " + bedroom .getArea() + "square-feet");

		// Create masterBedroom a Rectangle object, passing 20.0 and
		// 20.0 as arguments to the constructor.

		// Display the length.
		System.out.println("The masterBedroom 's length is " + masterBedroom .getLength() + "feet");

		// Display the width.
		System.out.println("The masterBedroom 's width is " + masterBedroom .getWidth() + "feet");

		// Display the area.
		System.out.println("The masterBedroom 's area is " + masterBedroom .getArea() + "square-feet");


		// Create  bathRoom_2 a Rectangle object, passing 20.0 and
		// 20.0 as arguments to the constructor.

		// Display the length.
		System.out.println("The bathRoom_2 's length is " + bathRoom_2 .getLength() + "feet");

		// Display the width.
		System.out.println("The bathRoom_2 's width is " + bathRoom_2 .getWidth() + "feet");

		// Display the area.
		System.out.println("The bathRoom_2 's area is " + bathRoom_2 .getArea()+ "square-feet");


		//Display the house's area
		System.out.println("The area of house is " + (kitchen.getArea() +bedroom .getArea()+ 
				masterBedroom .getArea() + livingRoom .getArea() + bathRoom_2 .getArea())+ "square-feet");
	}
}

