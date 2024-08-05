package class12;

public class Adder {
	int a = 10, b = 20;

	void sum() { //point 1
		System.out.println(a + b);
	}

	void sum(int a, int y) {// point 2
		System.out.println(a + b);
	}
	
	
	void sum(int a, double y) {// point 3
		System.out.println(a + b);
	}
	
	void sum(double a, int y) {// point 4
		System.out.println(a + b);
	}
	
	
	void sum(int a, int y, int c) {// point 4
		System.out.println(a + b+ c);
	}
	
	
	
	
	
	
}
