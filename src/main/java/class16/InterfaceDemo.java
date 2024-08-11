package class16;

interface Shape {
	int lenght = 10; // final & static
	int width = 20;// final static

	void circle(); // abstract method

	default void square() {
		System.out.println("This is square ...- default method");
	}

	static void rectangle() {
		System.out.println("This is rectangle ... - static method");
	}

//	 void squareroot() // Not allowed
//	{
//		System.out.println("This is square ...");
//	}	

}

public class InterfaceDemo implements Shape {

	public void circle() {
		System.out.println("This is circle ... - abstract method");

	}

	void triangle() {
		System.out.println("This is triangle ... ");

	}
	
	int x=100, y=200;

	public static void main(String[] args) {
		// Scenario 1
		/*
		  InterfaceDemo idboj = new InterfaceDemo(); 
		 idboj.circle();
		 idboj.square();
		 Shape.rectangle();
		 */
		// Scenario 2
		Shape sh = new InterfaceDemo();
		sh.circle(); // abstract
		sh.square(); // default
		Shape.rectangle(); // static method can directly
		// sh.triangle(); // we can not access this
		System.out.println(Shape.lenght + Shape.width);
		//System.out.println(sh.x+ sh.y); // we cannot access
	}

}
