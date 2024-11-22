package javacollection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("X");
		l.add("Y");
		l.add("Z");
		l.add("A");
		l.add("B");
		l.add("C");

		LinkedList l1 = new LinkedList();
		l1.addAll(l);
		System.out.println(l1);//[X, Y, Z, A, B, C]
		
		
		l1.removeAll(l);
		System.out.println(l1);//[]
		
		//sort   Collections.sort(collection)
		System.out.println("Before Sorting " +l);//[X, Y, Z, A, B, C]
		Collections.sort(l);
		System.out.println("After Sorting " +l); //[A, B, C, X, Y, Z]
	
		//Reverse Order
		Collections.sort(l, Collections.reverseOrder());
		System.out.println("Reverse Order " +l); //[Z, Y, X, C, B, A]
	
		//shuffling
		Collections.shuffle(l);
		System.out.println("After Shuffling " +l); //[A, X, Y, B, C, Z]
		
		
		
	}

}
