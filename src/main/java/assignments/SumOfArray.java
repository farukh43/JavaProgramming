package assignments;

public class SumOfArray {

	public static void main(String[] args) {
		/*
		1) Find Sum of Elements in Array
		a = {1,2,3,4,5}
		Sum = 15
		Ref Video: https://www.youtube.com/watch?v=BDvYp3GbfU4
		 */
		
		int a[] = { 20, 40, 90, 70 };
		int sum = 0;
		/*
		 * for (int i = 0; i <= a.length - 1; i++)
		 *  {
		 *   sum = sum + a[i]; 
		 *  }
		 */

		// enhanced for loop or for each loop

		for (int i : a) {
			sum = sum + i;
		}

		System.out.println("Sum of Ayyay elements : " + sum);
	}

}
