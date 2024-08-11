package class18;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("Program is started");
	
		Scanner sc =new Scanner(System.in);
		//ex1
		/*
		System.out.println("Enter a number");
		int num=sc.nextInt();
		System.out.println(100/num); //ArithmeticException:
		 */
		
		/*
		//ex2
		int a[]=new int[5]; //java.lang.ArrayIndexOutOfBoundsException
		System.out.println("Enter a position 0-4");
		int pos=sc.nextInt();
		System.out.println("Enter a value");
		int value=sc.nextInt();
		a[pos]=value;
		System.out.println(a[pos]);
		*/
		
		/*
		//Example3
	//	String s="Welcome"; //(NumberFormatException
		String s="12345";
		int num=Integer.parseInt(s);
		System.out.println(num);
		*/
		
		//Example4
		String s=null;
		System.out.println(s.length());// java.lang.NullPointerException:
		
		System.out.println("Program is completed");
		System.out.println("Program is exited");
		
		
		
	
	
	
	
	
	
	}

}
