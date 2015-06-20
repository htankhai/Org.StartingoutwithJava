package chapter9_staticInstance;


/**
   This program demonstrates the Countable class which has static field.
 */
public class StaticDemo{
	public static void main(String[] args)
	{
		int objectCount;

		// Create three instances of the Countable class.
		Countable object1 = new Countable();
		Countable object2 = new Countable();
		Countable object3 = new Countable();

		// Get the number of instances from
		// the class's static field.
		objectCount = object1.getInstanceCount();
		System.out.println(objectCount + " instances of the class were created.");
	}
}
