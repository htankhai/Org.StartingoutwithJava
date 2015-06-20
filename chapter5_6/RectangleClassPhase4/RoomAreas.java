package RectangleClassPhase4;
import javax.swing.JOptionPane;
//sourceCodeChapter5_6
/**
   This program creates four instances of the Rectangle class.
 */
public class RoomAreas
{
	public static void main(String[] args)
	{
		double number;       // To hold a number
		double totalArea;    // The total area 
		String input;        // To hold user input

		// Create three Rectangle objects.
		Rectangle livingroom = new Rectangle();
		Rectangle kitchen = new Rectangle();
		Rectangle bedroom = new Rectangle();
		Rectangle Masterbedroom = new Rectangle();

		// Get and store the dimensions of the livingroom .
		input = JOptionPane.showInputDialog("What is the " +		"livingroom 's length?");
		number = Double.parseDouble(input);
		livingroom .setLength(number);
		input = JOptionPane.showInputDialog("What is the " + 		"livingroom 's width?");
		number = Double.parseDouble(input);
		livingroom .setWidth(number);

		
		// Get and store the dimensions of the kitchen.
		input = JOptionPane.showInputDialog("What is the " +
				"kitchen's length?");
		number = Double.parseDouble(input);
		kitchen.setLength(number);

		JOptionPane.showMessageDialog(null,"Length of kitchen is " + kitchen.getLength());

		input = JOptionPane.showInputDialog("What is the " +
				"kitchen's width?");
		number = Double.parseDouble(input);
		kitchen.setWidth(number);

		JOptionPane.showMessageDialog(null,"Width of kitchen is "+ kitchen.getWidth());
		JOptionPane.showMessageDialog(null,"Area of kitchen is" + kitchen.getArea());

		// Get and store the dimensions of the bedroom.
		input = JOptionPane.showInputDialog("What is the " +
				"bedroom's length?");
		number = Double.parseDouble(input);
		bedroom.setLength(number);

		input = JOptionPane.showInputDialog("What is the " +
				"bedroom's width?");
		number = Double.parseDouble(input);
		bedroom.setWidth(number);

		// Get and store the dimensions of the Masterbedroom .
		input = JOptionPane.showInputDialog("What is the " +
				"Masterbedroom 's length?");
		number = Double.parseDouble(input);
		Masterbedroom.setLength(number);

		input = JOptionPane.showInputDialog("What is the " +
				"Masterbedroom 's width?");
		number = Double.parseDouble(input);
		Masterbedroom .setWidth(number);


		// Calculate the total area of the rooms.
		totalArea = kitchen.getArea() + bedroom.getArea() + Masterbedroom.getArea()
				+ livingroom.getArea();

		// Display the total area of the rooms.
		JOptionPane.showMessageDialog(null, "The total area " + "of the rooms is " + totalArea);

		System.exit(0);
	}
}
