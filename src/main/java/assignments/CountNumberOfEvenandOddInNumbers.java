package assignments;

public class CountNumberOfEvenandOddInNumbers {

	public static void main(String[] args) {

		/*
		 * 4) Count Number of Even and Odd digits in a Number
		   Input: 23456
		   Output: 3 even 2 odd
		   Video Link: https://www.youtube.com/watch?v=Ns4LoG56SZ4
		 */
		int num = 123456999;
		int even_count = 0;
		int odd_count = 0;

		while (num > 0) {
			int rem = num % 10;
			if (rem % 2 == 0) {
				even_count++;
			} else {
				odd_count++;
			}
			num = num / 10;
		}
		System.out.println("Number of Even Number is " + even_count);
		System.out.println("Number of Even Number is " + odd_count);

	}

}
