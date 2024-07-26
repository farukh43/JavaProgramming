package assignments;

public class CountNumberofDigits {

	public static void main(String[] args) {
		/*
		3) Count Number of Digits in a Number (looping)
	   Input: 423424
	   Output: 6
	   Video Link: https://www.youtube.com/watch?v=CnFBzBMEdMg

		*/   
		int num = 123456;
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}

		System.out.println(" Number of Digits : " + count);
	}

}
