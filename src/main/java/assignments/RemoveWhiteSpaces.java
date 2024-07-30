package assignments;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {

		String Str = "Java     Programming     selenium   automation";

		System.out.println("Before Removing the White Space :-->" + Str);

		Str = Str.replaceAll("\\s", "");

		System.out.println("After Removing the White Space: -->" + Str);

	}

}
