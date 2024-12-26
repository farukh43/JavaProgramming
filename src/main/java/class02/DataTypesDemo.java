package class02;

public class DataTypesDemo {

	public static void main(String[] args) {
		/*Data Types

		 * Primitive Data Types:
		byte, short, int, long: Represent whole numbers without decimal points.
		float, double: Represent decimal numbers (floating-point).
		char: Represents a single character (enclosed in single quotes).
		boolean: Represents true or false values.

		Non-Primitive (Derived) Data Types:
		String: Stores sequences of characters (text).
		ArrayList: A dynamic array that can hold objects of any type.
		HashMap: Stores key-value pairs.
		etc
		 * 		
		 */
	
		int a =100, b=200;
		System.out.println("The value of a is "+a);
		System.out.println("The value of a is "+b);
		System.out.println(a+b);//300
		System.out.println("The sum of a and b is "+a+b); //100200
		System.out.println("The sum of a and b is "+(a+b)); 
		
		byte by=125;
		System.out.println(by);
		
		short sh=2345;
		System.out.println(sh);
		
		long l= 123445678L;
		System.out.println(l);
		
		//for long and float we need to describe the literal explicitly
		
		//decimal numbers
		float item_price=15.5F;
		System.out.println(item_price);
		
		double dbl=1234.43454;
		System.out.println(dbl);
		
		char grade ='A';
		System.out.println(grade);
		
		String name="John";
		System.out.println(name);
		
		//char ch1='ABC'; -- Invalid
		//String ch='ABC'; --Invalid	
		//String ch='A'; --Invalid
		//String ch=""; --Valid
		
//		boolean bl=true;
//		System.out.println(bl);
//		boolean bf=false;
//		System.out.println(bf);
//		
//		boolean b1="true"; --Invalid
//		boolean b1="false"; --Invalid
//		
//		String bl=true; --Invalid
//		String bl="true"; --valid
		

	}

}
