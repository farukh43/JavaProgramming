package assignments;

public class SwappingOfTwoNo {

	public static void main(String[] args) {
//		Assignment
//		-----------
//		1) swapping of 2 numbers
//		Solution (Video link): https://youtu.be/3vbiz6KzauI?list=PLUDwpEzHYYLtgkX6Y6aIZ2lXcsjMqleEa
		int a = 10;
		int b = 20;

		System.out.println("The value of a before Swapping " + a);
		System.out.println("The value of b before Swapping " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("The value of a After Swapping " + a);
		System.out.println("The value of b After Swapping " + b);

		System.out.println("The value of a before Swapping " + a);
		System.out.println("The value of b before Swapping " + b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("The value of a After Swapping " + a);
		System.out.println("The value of b After Swapping " + b);

		
	}

}
