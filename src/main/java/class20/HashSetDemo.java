package class20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//Decaration
		
		HashSet myset =new HashSet();
		 //Set myset =new HashSet();
		 //HashSet<String> myset =new HashSet<String>();

		//adding elements in to hashset
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add(true);
		myset.add('A');
		myset.add(100);
		myset.add(null);
		myset.add(null);
		
		//printing hashset
		System.out.println(myset); //[null, A, 100, 10.5, welcome, true]
		
		//Size of hashset
		
		System.out.println(myset.size());
	
		//Removing element from the hashset
		myset.remove(10.5);// 10.5 is value (not index)
		System.out.println("After removing " + myset);
	
		//Inserting element - Not Possible
		//access specific element - Not Possible
		
		//Convert HashSet --> ArrayList
		ArrayList al = new ArrayList(myset);
		System.out.println(al);//[null, A, 100, welcome, true]
		System.out.println(al.get(2));//100
		
		//Reading all the elements using for..each Loop
//		for (Object x : myset) {
//			System.out.println(x);	
//		}
//		
		// Using Iterator
		Iterator<Object> it =myset.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		//Clearing all the elements in hashset
		myset.clear();
		System.out.println(myset.isEmpty());
		
		
	
	}

}
