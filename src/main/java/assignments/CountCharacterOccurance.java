package assignments;

public class CountCharacterOccurance {

	public static void main(String[] args) {
		String s = "aabbccededwxsa";
		int totalcount = s.length(); // Total len
		int totalcountafterRemove = s.replace("a", "").length();
		int count=totalcount-totalcountafterRemove;
		System.out.println("Number occurance of a is :"+count);
	
	
	}

}
