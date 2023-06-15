
//https://www.youtube.com/watch?v=nNI2eH_b3R4&list=PLhChZSBQLZWGrORbbkpPuELxTTAFRoXYP&index=20

public class Test {
	
	Test()
	{
		this(10);   //this statement should be in first line otherwise it's throws compile time error
		System.out.println("0 args constructor");
	}
	
	Test(int a)
	{
		this(10,20);  //one constructor is able to call only one constructor at a time using this keyword
		System.out.println("1 args constructor");
	}
	
	Test(int a, int b)
	{
		System.out.println("2 args constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//named approach object creation format
		Test t1 = new Test();
//		Test t2 = new Test(10);
//		Test t3 = new Test(10,20);
		
		//nameless approach object creation format
		new Test();
//		new Test(10);
//		new Test(10,20);
//				
				
	}

}

/* Rules of constructor
 * 1. constructor and class name must be same
 * 2. Constructor doesn't return any value.
 * 3. constructor is able to take parameters
 */
/* calling the constructor
 * 1. to call the constructor using this keyword
 * 2. this must be first statement inside the constructor
 * 3. one constructor can call only one constructor at a time 
 */
/* Usage of Constructor
 * 1. constructor are used to write business login of the application and that logic will be executed during object creation.
// * 2. Constructor is used to pass some value to the instance variable during object creation */
