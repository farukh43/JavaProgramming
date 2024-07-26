package class7;

import java.util.Arrays;

public class SortingElementinArray {

	public static void main(String[] args) {
		int a[] = { 300, 100, 200, 900, 600,100 };

		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(a)); // to print the Array
//		
//		for (int i : a) {
//			System.out.println(i);
//		}

		Arrays.sort(a);
		System.out.println("After Sorting");
		System.out.println(Arrays.toString(a)); // to print the Array

	}

}
