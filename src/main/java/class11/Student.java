package class11;

public class Student {

	int sid;
	String sname;
	char grad;

	void printStudentdata() {
		System.out.println(sid + " " + sname + " " + grad);
	}

	void setStudentData(int id, String name, char gr)
	{
		sid=id;
		sname=name;
		grad=gr;
	}

	// constructor
	// this will return any value
	// constructor name and class name should be same
	// void is not compulsory
	// constructor used to initialize the  data in the variable
	// to access methods we need to creat the object
	// No need to call the constructor, at the time of object creation automatically invoked
	Student(int id, String name, char gr)
	{		
			sid=id;
			sname=name;
			grad=gr;
	}
	

}
