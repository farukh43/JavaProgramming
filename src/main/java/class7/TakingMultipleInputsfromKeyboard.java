package class7;

import java.util.Scanner;

public class TakingMultipleInputsfromKeyboard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Ex 1
		/*
		 System.out.println("Enter First Num");
		 int num1=sc.nextInt();
		 
		 System.out.println("Enter Second Num");
		 int num2=sc.nextInt();
	
		 System.out.println("Addition of num1 and num2 is " +(num1+num2));
	*/
		 System.out.println("Enter Name");
		 String name=sc.next();
		 System.out.println("Your Entered Name "+name);
	
		 System.out.println("Enter Age");
		 int age=sc.nextInt();
		 System.out.println("Your Entered Name "+age);
		 
		 System.out.println("Enter unknown value: ");
		 Object value=sc.next();
		 System.out.println("your unknown value is: " +value);
	}

}
