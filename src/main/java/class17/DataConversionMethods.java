package class17;

public class DataConversionMethods {

	public static void main(String[] args) {
		// String --> int
		// String s="welcome"; //cannot convert to int
		
		/*
		String s1="10";
		String s2="20";
		System.out.println(s1+s2);
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		 */
		
		/*
		//String --> double
		String s3 ="10.5";
		String s4 ="20.89";
		System.out.println(Double.parseDouble(s3)+Double.parseDouble(s4));
		*/
		
		/*
		//String --> boolean
		//String s="true"; in this case only it will return true value in all other cases in will return False value
		String s="WELCOME"; // other than true, if you pass any string that will return false
		System.out.println(Boolean.parseBoolean(s));
		*/
		
		//int, double, boolean, char → String
		int a=10;
		double d =10.5;
		char c='A';
		boolean bool=true;
		
		String s=String.valueOf(a);
		System.out.println(s);
		
		
		s=String.valueOf(d);
		System.out.println(s);
		
		s=String.valueOf(c);
		System.out.println(s);
		
		s=String.valueOf(bool);
		System.out.println(s);
	}

}
