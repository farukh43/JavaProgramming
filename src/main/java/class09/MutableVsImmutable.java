package class09;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {
		//mutable - can change the original
		int a[]= {20,10,40,50,30};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		//immutable
		String s=new String("welcome");
		System.out.println(s); //welcome
		String concatedString= s.concat("to java");
		System.out.println(s); //welcome -->immutable - we cannot change
		System.out.println(concatedString); //welcome to java
		
	
	}

}
