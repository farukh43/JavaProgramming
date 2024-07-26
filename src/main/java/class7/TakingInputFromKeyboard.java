package class7;

import java.util.Scanner;

public class TakingInputFromKeyboard {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		/*
		 * System.out.println("Enter Num"); int num= in.nextInt();
		 * System.out.println("Given Number is "+ num);
		 * 
		 * System.out.println("Enter Num"); double num= in.nextDouble();
		 * System.out.println("Given Number is "+ num);
		 */

		System.out.println("Enter your city");
	String city=in.next();
	System.out.println("Your your city " +city);
	}

}
