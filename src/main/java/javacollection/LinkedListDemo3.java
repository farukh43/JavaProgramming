package javacollection;

import java.util.LinkedList;

public class LinkedListDemo3 {

	public static void main(String[] args) {
		LinkedList l = new LinkedList ();
		l.add("dog");
		l.add("dog");
		l.add("Cat");
		l.add("horse");
		
		System.out.println(l); //[dog, dog, Cat, horse]
		l.addFirst("Tiger");
		l.addLast("Elephat");
		System.out.println(l);//[Tiger, dog, dog, Cat, horse, Elephat]
		
		System.out.println(l.getFirst()); //Tiger
		System.out.println(l.getLast()); // Elephant

		l.removeFirst();
		l.removeLast();
		System.out.println("After removing first & last elememt :" +l);//[dog, dog, Cat, horse]
	
	}

}
