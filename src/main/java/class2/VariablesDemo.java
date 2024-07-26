package class2;

public class VariablesDemo {

	public static void main(String[] args) {
		/*
		 * Variables & Data types
		 * 
		 * Variable is a container which can hold data To represent data we need
		 * variables
		 * 
		 * int x=100; float itemprice=10.25; int age =30;
		 */

		// int a; //declaration
		// a=100; //assignment

//		int a=10; //declaration +assignment
//		System.out.println("a"); //a
//		System.out.println(a); //10
//		
//		a=20;
//		System.out.println(a); 

		// Approach 1 - - If all the variables are belongs to different data type
		// int a=100;
//		int b=200;
//		int c=300;

//		//approcach 2 - If all the variables are belongs to same data type
//		int a,b,c;
//		a=100;
//		b=200;
//		c=300;
		
		//approcach 3 - If all the variables are belongs to same data type
		int a=100, b=200,c=300;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		System.out.println("The value of a is "+a);
		System.out.println("The value of b is "+b);
		System.out.println("The value of c is "+c);
	
		//System.out.println(a,b,c); this is not allowed
		//System.out.println(a+b+c); // this will perform the addition not the concatination
		System.out.println(a+" "+b+ " "+c); //100 200 300
		

	}
	

}
