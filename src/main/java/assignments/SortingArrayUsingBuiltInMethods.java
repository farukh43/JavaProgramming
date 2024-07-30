package assignments;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class SortingArrayUsingBuiltInMethods {

	public static void main(String[] args) {
		
		//Approach 1
		/*
		int a[] = { 30, 50, 20, 10, 60 };
		System.out.println("Arrray Before Sorting :" + Arrays.toString(a));
		Arrays.parallelSort(a);

		System.out.println("Arrray After Sorting :" + Arrays.toString(a));
		 */
		
		/*
		//Approach 2
		
		int a[] = { 30, 50, 20, 10, 60 };
		System.out.println("Arrray Before Sorting :" + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Arrray After Sorting :" + Arrays.toString(a));
	*/
		
		//Approach 3
		//Descending Order
		Integer a[] = { 30, 50, 20, 10, 60 };
		System.out.println("Arrray Before Sorting :" + Arrays.toString(a));
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println("Arrray After Sorting :" + Arrays.toString(a));
			
		
	}

}
