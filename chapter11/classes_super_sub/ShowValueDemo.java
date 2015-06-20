package classes_super_sub;

/**
   This program demonstrates the methods in the
   SuperClass3 and SubClass3 classes.
 */
public class ShowValueDemo{
	public static void main(String[] args)
	{
		//Create a Subclass1 object
		SubClass1 sub1 = new SubClass1();

		//Create SubClass2 object
		SubClass2 sub2 = new SubClass2();

		// Create a SubClass3 object.
		SubClass3 myObject = new SubClass3();
		myObject.showValue(10);      
		myObject.showValue(1.2);      
		myObject.showValue("Hello");  
	}
}