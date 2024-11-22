package javacollection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableDemo {

	public static void main(String[] args) {
		// Hashtable ht= new Hashtable(); //Default capacity is 11, load factor is 0.75
		//	Map ht = new Hashtable();
		// Hashtable ht=new Hashtable(intial capacity);// - Intial capacity is defined as eg -60 ot 70 - create hashtable object with some capacity
		// Hashtable ht=new Hashtable(intial capacity , fill ratio/load factor);
		// Hashtable ht2=new Hashtable (60, 0.75f);
		Hashtable<Integer, String> ht= new Hashtable<Integer, String> ();
		ht.put(101, "John");
		ht.put(101, "JohnD");
		ht.put(102, "John");
		ht.put(103, "David");
		ht.put(104, "Smith");
		//ht.put(null, "Smith");//NullPointerException:- Not allowed
		//ht.put(105, null);///NullPointerException:- Not allowed
		
		System.out.println(ht); //{104=Smith, 103=David, 102=John, 101=JohnD}
		System.out.println(ht.get(104));//Smith
		
		//remove
		ht.remove(102);
		System.out.println(ht); //{104=Smith, 103=David, 101=JohnD}
		
		//contains
		System.out.println(ht.containsKey(104)); //true
		System.out.println(ht.containsKey(105)); // false
		
		System.out.println(ht.containsValue("David")); //true
		System.out.println(ht.containsValue("Y")); //false
		
		//empty
		System.out.println("Is Empty "+ht.isEmpty());//false
		
		//keySet
		System.out.println(ht.keySet());//[104, 103, 101]
		System.out.println(ht.values());//[Smith, David, JohnD]
		
		/*
		for (int k: ht.keySet()) {
			System.out.println(k+ "   "+ ht.get(k));
			
		}
		*/
		
		//Entry Specific methods
		for(Map.Entry entry:ht.entrySet()) //(Key,value)
		{
			System.out.println(entry.getKey()+ "  "+entry.getValue());
		}
		
		//iterator
		Set s=ht.entrySet();
		Iterator itr=s.iterator();
		
		while (itr.hasNext()) {
			
			Map.Entry entry = (Entry) itr.next();
			System.out.println(entry.getKey() + "  "+ entry.getValue());
			
		}
		
	
	}

}
