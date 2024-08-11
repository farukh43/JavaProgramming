package class19;

//upcasting - converting value from smaller --> larger
// int ---> long
//flaot---> double

//downcasting - converting value from larger -->smaller
//long--> int
//double-->float

public class TypeCastingConcept {

	public static void main(String[] args) {
//upcasting - automatic --- smaller to larger
		/*
		  int intvalue=100; 
		  long longvalue=intvalue; 
		  System.out.println(longvalue);
		 */

		//float floatvalue = 10.5F;
		//double doublevalue = floatvalue;
		//System.out.println(doublevalue);
		
		//downcasting - manually -- larger to smaller
		
		//long longvalue=10000;
		//int intvalue=(int) longvalue;
		
		//double doublevalue=12.55;
		//float floatvalue=(float)doublevalue;
		
		//example1
		/*int i=100;
		double d=i;//upcasting
		System.out.println(d);
		*/
		
		//example2 -- data loss
		double d=10.5;
		int i=(int)d;//downcasting
		System.out.println(i);
	}

}
