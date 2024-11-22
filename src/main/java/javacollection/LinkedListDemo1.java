package javacollection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		
		//Declare linked list
		//LinkedList <Integer> l = new LinkedList<Integer>();
		//LinkedList <String> l = new LinkedList<String>();
		
		LinkedList l = new LinkedList();
		
		//Add elements into linked list
		l.add(100);
		l.add("Welcome");
		l.add(10.5);
		l.add('A');
		l.add(null);
		l.add(true);
		
		System.out.println(l);
		// Size 
		// Arraylist is set to 10 as default size
		// Linked is set as 0 in default
		System.out.println(l.size());
		
		//remove
		//l.remove(3); //index
		System.out.println("After removing"+l); //[100, Welcome, 10.5, null, true]
	
		l.remove(true); 
		//l.remove('A'); -- INVALID Syntax
		//values -We cannot remove CHAR from the list, remaining we can remove
		// If we use the remove method and remove the CHAR , it will through ARRAY INDEX out of bound exception
		// We can use Index and Value to remove the char
		//l.remove(3) - which will remove the Char value
		System.out.println("After removing"+l);//[100, Welcome, 10.5, null]
		
		//insert /delete element in the middle of linked list
		l.add(3,"Java");
		System.out.println("After Insertion element "+l);//[100, Welcome, 10.5, Java, null]
		
		//retriving value / object
		System.out.println(l.get(3)); //java
		
		//change the value
		l.set(5, "X");
		System.out.println("After changing the value element "+l);//[100, Welcome, 10.5, Java, A, X]
		
		//contains
		System.out.println(l.contains("Java")); //true
		System.out.println(l.contains("Python")); //false
		
		//isEmpty
		System.out.println(l.isEmpty());
		
		//reading elements from LL using for loop
		/*
		for (int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		*/
	
		//reading elements from LL using for..each loop
		/*
		for (Object value : l) {
			System.out.println(value);
		}
		*/
		//Iterator Method
		Iterator it =l.iterator();
		while (it.hasNext())
			{
			System.out.println(it.next());
		}
		
	}

}
