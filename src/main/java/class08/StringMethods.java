package class08;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		String s = "Welcome";
		String s1 = new String("Welcome");

		System.out.println(s);
		System.out.println(s1);

		// length()- returns length of a string (number of characters)
		int l = s.length();
		System.out.println(l);
		System.out.println(s.length());
		System.out.println("Welcome".length());

		// concat() - joining Strings
		String s3 = "welcome";
		String s4 = "to java";
		String s5 = " automation";

		System.out.println(s3 + s4);
		System.out.println(s3.concat(s4));

		System.out.println(s3.concat(s4).concat(s5));
		System.out.println(s3.concat(s4 + s5));

		System.out.println("Welcome " + "to Java");
		System.out.println("Welcome ".concat("to Java"));

		// trim() - Remove spaces right and left side
		s = "   Welcome  ";

		System.out.println("Before Trimming " + s.length());// 12
		System.out.println(s);
		System.out.println(s.trim());
		System.out.println(s.length());// 12

		System.out.println("After Trimming " + s.trim().length());// 12

		// charAt - returns a character from a string based on index
		// index starts from 0

		s = "welcome";
		System.out.println(s.charAt(3)); // c
		System.out.println(s.charAt(0));

		// contains()- returns true/false
		// checks string is part of main string or not
		System.out.println(s.contains("wel"));// true
		System.out.println(s.contains("come")); // true
		System.out.println(s.contains("Wel"));// false
		System.out.println(s.contains("COME"));// false
		System.out.println(s.contains("welme"));// false

		// equals(), equalsIgnoreCase() - compare String
		s1 = "welcome";
		s3 = "welcome";
		System.out.println("--------------");
		System.out.println(s1 == s3); // true
		System.out.println(s1.equals(s3));// true
		System.out.println(s1.equals("Welcome"));// false
		System.out.println(s1.equalsIgnoreCase("Welcome"));// true
		System.out.println();

		// replace()- replace single/multiple (sequence) of characters in string
		s = "welcome to selenium java selenium python selenium c#";
		System.out.println(s.replace('e', 'X'));
		System.out.println(s.replace("selenium", "playwright"));
	
	//substring --extract substring from the main string
	// starting index - 0
	// ending index - 1
	System.out.println("Sub String --------------");
	s = "selenium";
	System.out.println(s.substring(1, 5)); // elen
	System.out.println(s.substring(0, 3)); // Sel
	
	//toUpperCase() toLowerCase()
	
	System.out.println(s.toLowerCase());
	System.out.println(s.toUpperCase());
	
	//split() -  split the string into multiple parts based on delimeter
	//delimeter - @ , .
	//this convert the string into arrays
	s="abc123@gmail.com";
	String a[]=s.split("@");
	System.out.println("Using Arrays To String" + Arrays.toString(a));
	
	System.out.println(a[0]);
	System.out.println(a[1]);
	
	//ex1
	String amount="$15,20,55";
	System.out.println(amount.replace("$", "")); //15,20,55
	System.out.println(amount.replace(",", "").replace("$", ""));//152055
	
	//ex2
	s="abc,123@xyx";  //abc 123 xyz
	String Arr1[]=s.split(","); //abc 123@xyz
	System.out.println(Arrays.toString(Arr1));//[abc, 123@xyx]
	String arr2[]=Arr1[1].split("@");
	System.out.println(Arrays.toString(arr2)); //[123, xyx]
	
	System.out.println("-----------"); 
	System.out.println(Arr1[0]);// abc	
	System.out.println(arr2[0]);//123
	System.out.println(arr2[1]);//xyx
	
	//ex 3
	s="abc 123";
	String ar[]=s.split(" ");
	System.out.println(Arrays.toString(ar));
	
	// we can not use these symbols as delimeters becoz they are also used as regEx * % ^ & ()
	
	//ex4 - without equalsToIgnoreCase
	String Name="John Kenedy";
	System.out.println(Name.contains("john")); //false
	System.out.println(Name.replace('J', 'j').contains("john")); //true
	System.out.println(Name.toLowerCase().contains("john")); //true
	
	
	}

}
