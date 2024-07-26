package class7;

import java.util.Arrays;

public class SortingStrings {

	public static void main(String[] args) {
		// char s[]= {'D','A','C','E'};
		String s[] = { "scott", "farukh", "johny", "dave" };
		System.out.println("Before Sorting " + Arrays.toString(s));

		Arrays.sort(s);

		System.out.println("After Sorting " + Arrays.toString(s));

	}

}
