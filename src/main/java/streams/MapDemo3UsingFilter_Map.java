package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
	int empid;
	String ename;
	int salary;
	
	Employee (int empid,String ename,int salary)
	{
		this.empid=empid;
		this.ename=ename;
		this.salary=salary;
		
	}
}

public class MapDemo3UsingFilter_Map {

	public static void main(String[] args) {
		
		/*
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(101, "Alex", 10000));
		employeesList.add(new Employee(101, "Alex", 10000));
		employeesList.add(new Employee(101, "Alex", 10000));
		employeesList.add(new Employee(101, "Alex", 10000));
		*/
		List<Employee> employeesList =Arrays.asList(
									new Employee(101,"Alex",10000),
									new Employee(102,"Brian",20000),
									new Employee(103,"Charles",30000),
									new Employee(104,"David",40000),
									new Employee(105,"Edward",50000)
									);
		
		//Collection-->Stream --->Filter --->map---->collect
		//combination of filter and map
		List <Integer> EmployeeSalList=employeesList.stream().filter(e->e.salary>20000)
		.map(e->e.salary)
		.collect(Collectors.toList());
		
		System.out.println(EmployeeSalList);
	}

}
