package lambdaexpression.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
	String ename;
	int salary;
	int experience;

	Employee(String name, int sal, int exp) {
		ename = name;
		salary = sal;
		experience = exp;
	}

}

public class PredicateDemo2 {

	public static void main(String[] args) {
		Employee emp = new Employee("John", 50000, 3);

		// Ex1
		// emp obj --> return name if sal>30K and Exp >3
		Predicate<Employee> pr = e -> (e.salary > 30000 && e.experience > 3);
		System.out.println(pr.test(emp));// true

		// ex2
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("John", 50000, 5));
		al.add(new Employee("David", 20000, 2));
		al.add(new Employee("Scott", 30000, 3));
		al.add(new Employee("Robbrt", 40000, 4));
		al.add(new Employee("Hari", 60000, 6));

		for (Employee employee : al) {

			if (pr.test(employee)) {
				System.out.println(employee.ename + "  " + employee.salary);
			}
		}
	}

}
