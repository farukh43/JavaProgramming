package assignments;

import java.util.Arrays;

public class SortingOfElementsInArrayBubbleSort {
	/*
	1) Sorting elements using for loop a=[50,20,40,10,100] after sorting 10 20 40 50 100
			Ref Links https://www.youtube.com/watch?v=cJ2eMUiCFy4 
			https://www.youtube.com/watch?v=3PLtvTUOCpM
	*/
	public static void main(String[] args) {
		int a[] = { 4, 2, 1, 5, 3 };
		System.out.println("Arrray Before Sorting :" + Arrays.toString(a));
		int n = a.length;

		for (int i = 0; i < n - 1; i++) {

			for (int j = 0; j < n - 1; j++) {
				if (a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		
		System.out.println("Arrray After Sorting :" + Arrays.toString(a));
		

	}

}
