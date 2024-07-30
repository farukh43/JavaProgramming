package class07;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingAndWritingDataToArray {

	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner in = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter your value for position " + i + ":");
			a[i] = in.nextInt();
		}

		System.out.println("printing array in element....");
		System.out.println(Arrays.toString(a));
	}

}
