package class09;

public class StringVStringBufferVsStringBuilder {

	public static void main(String[] args) {
		//String - immutable
		String s="welcome";
		s.concat("to java");
		System.out.println(s); //immutable - we cannot change value of s
	
//		//StringBuffer - mutable
//		StringBuffer s1 = new StringBuffer("welcome");
//		s1.append(" to java");
//		System.out.println(s1);//mutable - we can change original value of s
		
		// StringBuffer - mutable
		StringBuilder s1 = new StringBuilder("welcome");
		s1.append(" to java");
		System.out.println(s1);// mutable - we can change original value of s		
		
		
	}

}
