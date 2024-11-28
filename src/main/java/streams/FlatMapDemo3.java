package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	String sname;
	int sid;
	char grad;
	
	Student (String sname, int sid, char grad)
	{
		this.sname=sname;
		this.sid=sid;
		this.grad=grad;
		
	}
}
public class FlatMapDemo3 {

	public static void main(String[] args) {
	
	List<Student> studentList1= new ArrayList<Student>();
	studentList1.add(new Student("Smith", 101, 'A'));
	studentList1.add(new Student("John", 102, 'B'));
	studentList1.add(new Student("Kendy", 103, 'C'));
	
	List<Student> studentList2= new ArrayList<Student>();
	studentList1.add(new Student("Scott", 101, 'A'));
	studentList1.add(new Student("Mary", 102, 'B'));
	studentList1.add(new Student("kitty", 103, 'C'));

	List<List<Student>> studentList = Arrays.asList(studentList1,studentList2);
	
	//before java 8
	/*
	for (List<Student> s : studentList) {
		for (Student stu : s) {
			System.out.println(stu.sname);
			
		}
		
	}
	*/
	
	//Using stream /FlatMap()
	List<String> nameList=studentList.stream()
			.flatMap(stulist->stulist.stream())
			.map(s->s.sname)
			.collect(Collectors.toList());
	System.out.println(nameList);
	}

}
