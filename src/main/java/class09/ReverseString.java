package class09;

public class ReverseString {

	public static void main(String[] args) {
		
		/*
		// Approach
		String s = "Welcome";
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.println(s.charAt(i));
			rev = rev + s.charAt(i);
		}

		System.out.println("Reverse String is :" + rev);
		*/

		/*
		// Approach 2
		String s = "Welcome";
		String rev = "";
		char a[] = s.toCharArray();
		for (int i = a.length - 1; i >= 0; i--) {
			rev = rev + a[i];
		}
		System.out.println("Reverse String is :" + rev);
		 */
		
		//Approach 3 - Using StringBuffer
		StringBuffer a=new StringBuffer("welcome");
		a.reverse();
		System.out.println("Reverse String is :" + a);
		
		
		//Approach 4 - Using StringBuilder
		StringBuilder s=new StringBuilder("Welcome");
		s.reverse();
		System.out.println("Reverse String is :" + s);
		
		
	}

}
