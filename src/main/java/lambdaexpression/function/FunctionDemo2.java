package lambdaexpression.function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionDemo2 {

	class Employee2 {
		String ename;
		int salary;

		Employee2(String ename, int salary) {
			this.ename = ename;
			this.salary = salary;
		}
	}

	public static void main(String[] args) {
		FunctionDemo2 outerInstance = new FunctionDemo2();
		ArrayList<Employee2> emplist = new ArrayList<>();
		emplist.add(outerInstance.new Employee2("David", 60000));
		emplist.add(outerInstance.new Employee2("John", 30000));
		emplist.add(outerInstance.new Employee2("Jane", 20000));

		Function<Employee2, Integer> fn = e -> {
			int sal = e.salary;
			if (sal >= 10000 && sal <= 20000)
				return (sal * 10 / 100);
			else if (sal > 20000 && sal <= 30000)
				return (sal * 20 / 100);
			else if (sal > 30000 && sal <= 50000)
				return (sal * 30 / 100);
			else
				return (sal * 40 / 100);
		};
		
		Predicate<Integer> p=b->b>5000;

		for (Employee2 emp : emplist) {
			
			
			int bonus = fn.apply(emp); //function
			
			if(p.test(bonus)) //predicate 
			{
			System.out.println(emp.ename + "  " + emp.salary);
			System.out.println("Bonus is " + bonus);
		}
		}
	}

}
