package class13;

public class Staticdemo {

	static int a=10; // Static Variable
	int b=20;			// non Static Variable
	
	static void m1() //static
	{
		System.out.println("this is m1 static method");
	}
	
	static void m2() //non static method
	{
		System.out.println("this is m2 non static method");
	}
	
	// 3.Non-static methods can access everything directly.
	void m() //non static method
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}

	/*	public static void main(String[] args) {
		// 1) Static methods can access static keywords and methods without creating objects
		System.out.println(a);
		m1();
		
		//System.out.println(b); //cannot access , b is non static
		//m2(); //cannot access , m2() is non static
		
		
		// 2)Static methods can access non-static keywords and methods through objects only
		
		//Staticdemo sd = new Staticdemo();
		//System.out.println(sd.b);
		//sd.m2();
		//sd.m();
		
	}
	*/

}
