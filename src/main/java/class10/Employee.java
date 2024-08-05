package class10;

public class Employee {
	// variables
	int eid;
	String name;
	String job;
	int sal;

	// methods
	void display() {
		System.out.println(eid);
		System.out.println(name);
		System.out.println(job);
		System.out.println(sal);

	}

	/*
	public static void main(String[] args) {
		Employee emp1 = new Employee();

		System.out.println("Before Assignining Values");

		emp1.display();

		emp1.eid = 101;
		emp1.name = "John";
		emp1.job = "Manager";
		emp1.sal = 560990;
		System.out.println("After Assignining Values");
		emp1.display();

		System.out.println("Object 2 Values");

		Employee emp2 = new Employee();

		emp2.eid = 102;
		emp2.name = "David";
		emp2.job = "Engineer";
		emp2.sal = 1234234;
		emp1.display();
	}
*/
}

