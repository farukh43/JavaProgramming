package javacollection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");
		ArrayList al_dup = new ArrayList();
		al_dup.addAll(al);
		System.out.println(al_dup);
		
		al_dup.removeAll(al_dup);
		System.out.println("After Removing"+al_dup);
	
		// Sort -- Collections.Sort
		System.out.println("Elememnts in the array List:" +al);
		Collections.sort(al);
		System.out.println("Elememnts in the array List after sorting:" +al);
		
		Collections.sort(al.reversed());
		System.out.println("Elememnts in the array List after reverse Order:" +al);
		
		//Shuffling Collections .shuffle
		Collections.shuffle(al);
		System.out.println("Elememnts in the array List after shuffling:" +al);
		
	
	}

}
