package RectangleClassPhase5;
/**
   This program demonstrates the Rectangle class's constructor.
*/
public class ConstructorDemo
{
   public static void main(String[] args)
   {
      // Create a Rectangle object, passing 25.0 and
      // 20.0 as arguments to the constructor.
      Rectangle box = new Rectangle(25.0, 20.0);

      // Display the length.
      System.out.println("The box's length is " + box.getLength() + "feet");

      // Display the width.
      System.out.println("The box's width is " + box.getWidth() + "feet");

      // Display the area.
      System.out.println("The box's area is " + box.getArea() + "square-feet");
   }
}
