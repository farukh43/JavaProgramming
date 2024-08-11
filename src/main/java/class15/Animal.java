package class15;

public class Animal {

	String color = "white";

	void eat() {
		System.out.println("eating....");
	}
}

class Dog extends Animal {
	String color = "black";

	void displayColor() {
		System.out.println(" Using This Keyword the color is " + this.color);
		System.out.println(" Using Super keyword the color is " + super.color);
	}

	void eat() {
		// System.out.println("eating bread....");
		super.eat();
	}
}