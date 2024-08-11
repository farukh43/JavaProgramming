package class19;

class Parent {
	String Name = "John";

	void m1() {
		System.out.println("This is m1 from Parent....");
	}
}

class Child extends Parent {
	int id = 101;

	void m2() {

		System.out.println("This is m2 from Child....");

	}
}

public class TypeCastingObjects1 {

	public static void main(String[] args) {
		/*
		Child ch= new Child();
		System.out.println(ch.Name); //Parent
		ch.m1();//Parent
		System.out.println(ch.id);//child
		ch.m2();//child
		*/
		
//		Parent p =new Child(); //Upcasting
//		System.out.println(p.Name); //Parent
//		p.m1();//Parent
		
		
		//System.out.println(p.id);//child --> We cannot access
		//p.m2();//child --> We cannot access
		
		//downcasting
		// we will get classcastExeption
		//ignore the below approach
//		Parent p =new Parent();
//		Child c=(Child)p; 
//		
//		System.out.println(c.Name);
//		System.out.println(c.id);
//		c.m1();
//		c.m2();

	}

}
