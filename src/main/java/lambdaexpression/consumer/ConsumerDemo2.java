package lambdaexpression.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee {
	String ename;
	int salary;
	String gender;

	Employee(String ename, int salary, String gender) {
		this.ename = ename;
		this.salary = salary;
		this.gender = gender;

	}
}

public class ConsumerDemo2 {

	public static void main(String[] args) {

		ArrayList<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee("David", 50000, "Male"));
		emplist.add(new Employee("John", 30000, "Male"));
		emplist.add(new Employee("Mary", 20000, "Female"));
		emplist.add(new Employee("Scott", 60000, "Male"));
		//function
		Function <Employee, Integer> f=emp->(emp.salary*10)/100; //task 1
		
		//predicate
		Predicate <Integer> p=b->b>=5000; //task 2
		
		//Consumer
		Consumer <Employee> c=emp->{
		System.out.println(emp.ename);	
		System.out.println(emp.salary);	
		System.out.println(emp.gender);	
		}; //task 3
		
		for (Employee e : emplist) {
			int bonus=f.apply(e); //calculate bonus invoked Function
			
			if(p.test(bonus)) //invoked predicate
			{
				c.accept(e);// invoked consumer
				System.out.println("Employee bonus :"+bonus);
			}
			
		}
	}

}
