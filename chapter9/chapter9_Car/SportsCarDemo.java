package chapter9_Car;
/**
   This program demonstrates the SportsCar class.
*/

public class SportsCarDemo{
   public static void main(String[] args)
   {
      // Create a SportsCar object.
      SportsCar yourNewCar1 = new SportsCar(CarType.FORD, 
                                    CarColor.RED, 30000);
      
            // Display the object's values.
      System.out.println(yourNewCar1);
      
      // Create a SportsCar object.
      SportsCar yourNewCar2 = new SportsCar(CarType.FERRARI, 
                                    CarColor.WHITE, 100000);
      
            // Display the object's values.
      System.out.println(yourNewCar2);
   }
}