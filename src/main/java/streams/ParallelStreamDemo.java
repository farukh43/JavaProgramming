package streams;

import java.util.Arrays;
import java.util.List;

class Student1 {
	String sname;
	int score;

	Student1(String sname, int score) {
		this.score = score;
		this.sname = sname;

	}

	public String getName() {
		return this.sname;
	}

	public int getscore() {
		return this.score;
	}

}

public class ParallelStreamDemo {

	public static void main(String[] args) {

		List<Student1> studentList = Arrays.asList(
				new Student1 ("David", 82),
				new Student1 ("Bob", 90),
				new Student1 ("John", 65),
				new Student1 ("Cenedy", 55),
				new Student1 ("Eric", 85),
				new Student1 ("Smith", 88),
				new Student1 ("cott", 50));
	
		/*
		// using stream() - sequential
		studentList.stream().filter(s->s.getscore()>=80)
		.limit(3).
		forEach(stu->System.out.println(stu.getName()+" "+stu.getscore()));
		*/
		//parallel stream
		studentList.parallelStream().filter(s->s.getscore()>=80)
		.limit(3).
		forEach(stu->System.out.println(stu.getName()+" "+stu.getscore()));
		
		//convert stream()-->parallelStream()
		studentList.stream().parallel().filter(s->s.getscore()>=80)
		.limit(3).
		forEach(stu->System.out.println(stu.getName()+" "+stu.getscore()));
		
	}

}
