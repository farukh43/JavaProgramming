package assignments;

public class RemoveJunkCharactersInString {

	public static void main(String[] args) {
		String s = "₠₿©⃀⅗√~!@#$%^&*? lating string 01234567890";
		s=s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s);
	}

}
