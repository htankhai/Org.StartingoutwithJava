package RectangleClassPhase4;
/**
   Rectangle class, phase 4
   Under construction!
 */
public class Rectangle
{
	private double length;
	private double width;

	/**
   Constructor
	 */

	public Rectangle()
	{
		length= 0.0;
		width = 0.0;
	}

	/**
   Constructor
   @param len The length of the rectangle.
   @param w The width of the rectangle.
	 */

	public Rectangle(double len, double w)
	{
		length = len;
		width = w;
	}

	/**
      The setLength method stores a value in the length field.
      @param len The value to store in length field.
	 */

	public void setLength(double len)
	{
		length = len;
	}

	/**
      The setWidth method stores a value in the width field.
      @param w The value to store in width.
	 */

	public void setWidth(double w)
	{
		width = w;
	}

	/**
      The getLength method returns a Rectangle object's length.
      @return The value in the length field.
	 */

	public double getLength()
	{
		return length;
	}

	/**
      The getWidth method returns a Rectangle object's width.
      @return The value in the width field.
	 */

	public double getWidth()
	{
		return width;
	}

	/**
      The getArea method returns a Rectangle object's area.
      @return The product of length times width.
	 */

	public double getArea()
	{
		return length * width;
	}

	// Display the rectangle data.
	/*public void displayData(double length, double width, double area){
		System.out.println("length: "+ length + ", width: " + width+ "and area : "+ 
	getArea());
	}*/


}
