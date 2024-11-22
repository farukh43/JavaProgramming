package lambdaexpression;

@FunctionalInterface
interface Cab {
	public void bookCab();
}

//withoit implemention the below cade we can write labda expression
//class Ola implements Cab {
//
//	// Traditional way
//	@Override
//	public void bookCab() {
//		// TODO Auto-generated method stub
//		System.out.println("Ola cab is booked");
//	}
//
//}

public class LambdaExDemo1 {

	public static void main(String[] args) {

		Cab cab=()->System.out.println("Ola cab is booked");
		cab.bookCab();
		
	}

}
