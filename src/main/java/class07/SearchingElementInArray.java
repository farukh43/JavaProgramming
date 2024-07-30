package class07;

public class SearchingElementInArray {

	// Searching an element in array (linear Search)
	
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 40, 40, 50 };
		int search_element = 40;

		boolean status = false;
		/*
		 * for (int i = 0; i < a.length; i++) { if (a[i] == search_element) {
		 * System.out.println("Element Found"); status = true;
		 * 
		 * break; }
		 * 
		 * }
		 */ 
		for (int i : a) {
			if (i == search_element) {
				System.out.println("Element Found");
				status = true;

				break;
			}
		}

		if (status == false) {
			System.out.println("Element Not Found");
		}

		// System.out.println("Element Not Found"); --THIS WON'T WORK
	}

}
