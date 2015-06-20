package sourceCodeChapter5_6;
/**
   You must complete this program so it calculates
   and displays the area of a rectangle. 
 */
// Insert any necessary import statements here.
public class AreaRectangle
{

	double length;      
	double width;
	double area;

	public static void main(String[] args)
	{
		AreaRectangle areaR = new AreaRectangle();

		// Get the rectangle's length from the user.
		areaR .getLength();

		// Get the rectangle's width from the user.
		areaR .getWidth();

		// Get the rectangle's area.
		areaR.getArea();

		// Display the rectangle data.
		areaR.displayData();
	}

	private void displayData() {
		// TODO Auto-generated method stub
		System.out.println(length +" " + width + " " + area);
	}

	private double getArea() {
		// TODO Auto-generated method stub
		return length * width;
	}

	private double getWidth() {
		// TODO Auto-generated method stub
		return width;
	}

	private  double getLength() {
		// TODO Auto-generated method stub
		return length;
	}
}

