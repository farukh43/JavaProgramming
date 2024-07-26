package assignments;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		/*
		1) Reverse a number ( % / = operators )
	   input 1234
	   output 4321
	   video link: https://www.youtube.com/watch?v=m0lMpNIG6vU
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");

		int num = sc.nextInt();
		//Always Use the first Approach
		// 1.Using Algorithm
		/*
		 * int rev = 0;
		 * 
		 * while (num != 0) 
		 * {
		 *  rev = rev * 10 + num % 10; 
		 *  num = num / 10;
		 * 
		 * }
		 * 
		 * System.out.println("Reverese Number is " + rev);
		 */

		/*
		 * //2. Using StringBuffer Class StringBuffer sb = new
		 * StringBuffer(String.valueOf(num)); StringBuffer rev = sb.reverse();
		 * System.out.println("Reverese Number is " + rev);
		 * 
		 */
		
		// 3. Using StringBuilder Class
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev = sbl.reverse();
		System.out.println("Reverese Number is " + rev);

	}

}
