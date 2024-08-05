package class13;

public class StaticMain {

	public static void main(String[] args) {
			// 1) Static methods can access static keywords and methods without creating objects
			System.out.println(Staticdemo.a);
			Staticdemo.m1();
			
			//System.out.println(b); //cannot access , b is non static
			//m2(); //cannot access , m2() is non static
			
			
			// 2)Static methods can access non-static keywords and methods through objects only
			
			Staticdemo sd = new Staticdemo();
			System.out.println(sd.b);
			sd.m2();
			sd.m();
	}

}
