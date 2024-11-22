package lambdaexpression;

/*
//Example 1
interface Cab1 {
	public void bookCab(String source, String destination);

}

//class Ola implements Cab1
//{
//	public void bookCab( String source, String Destination)
//{
//		System.out.println("Ola cab is booked from "+ source + " To" +Destination);
//	}
//	
//}
public class Test1 {

	public static void main(String[] args) {
		Cab1 cab = (source, Destination)->System.out.println("Ola cab is booked from "+ source + " To" +Destination);
		cab.bookCab("Hyd", "Mumbai");

	}
}
*/

//Example 2
interface Cab1 {
	public String bookCab(String source, String destination);

}


public class LambdaExDemo2 {

	public static void main(String[] args) {
		Cab1 cab = (source, Destination)->{
		System.out.println("Ola cab is booked from "+ source + " To " +Destination);
		return ("Price: 500 Rs");};
		System.out.println(cab.bookCab("HYD", "Mumbai"));

	}
}







