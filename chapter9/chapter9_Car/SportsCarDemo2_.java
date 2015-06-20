package chapter9_Car;


/**
   This program shows that you can switch on an enumerated type.
 */
public class SportsCarDemo2_{
	public static void main(String[] args)
	{
		// Create a SportsCar object.
		SportsCar yourNewCar = new SportsCar(CarType.PORSCHE, CarColor.RED, 100000);

		System.out.println(yourNewCar);

		// Get the car make and switch on it.
		/*switch (yourNewCar.getMake())
		{
		case FORD:
			System.out.println("Your car was made in America.");
			break;
		case PORSCHE :
			System.out.println("Your car was made in Germany.");
			break;
		case FERRARI :
			System.out.println("Your car was made in Italy.");
			break;
		case JAGUAR :
			System.out.println("Your car was made in England.");
			break;
		default:
			System.out.println("I'm not sure where that car "
					+ "was made.");
		}*/

		// Create a SportsCar object.
		SportsCar yourNewCar2 = new SportsCar(CarType.FORD, 
				CarColor.GREY, 30000);

		System.out.println(yourNewCar2);

		// Get the car make and switch on it.
		/*switch (yourNewCar2.getMake())
		{
		case FORD:
			System.out.println("Your car was made in America.");
			break;
		case PORSCHE :
			System.out.println("Your car was made in Germany.");
			break;
		case FERRARI :
			System.out.println("Your car was made in Italy.");
			break;
		case JAGUAR :
			System.out.println("Your car was made in England.");
			break;
		default:
			System.out.println("I'm not sure where that car "
					+ "was made.");
		}*/

	}
}