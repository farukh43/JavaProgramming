package javacollection;

import java.util.HashSet;

public class HashSetDemo1 {

	public static void main(String[] args) {
		// Decaration
		HashSet myset = new HashSet();// Default capacity 16 & Load Factor 0.75
		// HashSet myset = new HashSet(100); //Intial capacity 100 -user defined
		// HashSet myset = new HashSet(100,(float)0.90); //Intial capacity 100 and Load
		// factor 90% -user defined
		// Set myset =new HashSet();
		// HashSet<String> myset =new HashSet<String>();

		// adding elements in to hashset
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add(true);
		myset.add('A');
		myset.add(100);
		myset.add(null);
		myset.add(null);

		// printing hashset
		System.out.println(myset); // [null, A, 100, 10.5, welcome, true] - Insertion order is not preserved

		// Removing element from the hashset
		myset.remove(10.5);// 10.5 is value (not index)
		System.out.println("After removing " + myset);

		//contains
		System.out.println(myset.contains("welcome")); //true
		System.out.println(myset.contains("xyz")); //false
		
	}

}
