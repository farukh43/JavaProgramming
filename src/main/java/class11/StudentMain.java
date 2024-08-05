package class11;

public class StudentMain {

	public static void main(String[] args) {

		//Student stu = new Student();
		// 1.Using object refernce variables
		/*
		stu.sid=101;
		stu.sname="John";
		stu.grad='A';
		stu.printStudentdata();
		*/
		//Using method
		//stu.setStudentData(102,"Warner",'A');
		//stu.printStudentdata();
	
		
		Student stu = new Student(103, "Google", 'A');
		stu.printStudentdata();
	}

}
