package class17.subpack2;

import class17.subpack1.Test1;

/*
public class Test2 extends Test1 {

	public static void main(String[] args) {
		/*
	 	Test1 t = new Test1();
		System.out.println(t.x);
		t.m1();
		 */
		
		/*
		// for protected we need to extends Test1
		Test2 t = new Test2();
		System.out.println(t.x);
		t.m1();
		
	}

}

*/
public class Test2 {

	public static void main(String[] args) {
		// public access modifier can be accessible with in the project
	 	Test1 t = new Test1();
		System.out.println(t.x);
		t.m1();
		
	}

}
