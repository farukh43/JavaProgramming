package assignments;

public class CheckStringIsPalindrome {

	public static void main(String[] args) {

		String OrginalString = "Welcome";
		String Rev = "";

		for (int i = OrginalString.length() - 1; i >= 0; i--) {
			Rev = Rev + OrginalString.charAt(i);
		}

		System.out.println(Rev);

		if (OrginalString.equals(Rev)) {
			System.out.println("Given String is Palindrom " + OrginalString + " " + Rev + " ");
		}

		else {
			System.out.println("Given String is NOT a Palindrom " + OrginalString + " " + Rev + " ");

		}
	}

}
