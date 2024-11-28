package class20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		//Decaration
		//HashMap map= new HashMap();
		//Map mymap =new HashMap();
		HashMap<Integer,String> hm =new HashMap<Integer,String>();
		
		
		//adding pairs
		hm.put(101, "John");
		hm.put(102, "Scott");
		hm.put(103, "Mary");
		hm.put(104, "Scott");
		hm.put(102, "David");
		
		System.out.println(hm); //{101=John, 102=David, 103=Mary, 104=Scott}
		//Size
		System.out.println("Size of hasmap:" +hm.size());//4
		
		//remove pair
		hm.remove(103);
		System.out.println("After removing pair: "+hm); //103 is key of the pair
		
		//access value of the key
		System.out.println(hm.get(102)); //102 is key //David
		
		//containsKey - will return true and False
		System.out.println(hm.containsKey(101)); //true
		System.out.println(hm.containsKey(109)); //false
		
		//containsValue - will return true and False
		System.out.println("Contains value - " + hm.containsValue("David")); //True
		System.out.println("Contains value - " + hm.containsValue("Farukh")); //false
		
		
		//Get all the keys from hashmap
		System.out.println(hm.keySet()); //returns all the keys as set -->[101, 102, 104]
		System.out.println(hm.values());//returns all the value as collection - >[John, David, Scott]
		System.out.println(hm.entrySet()); //Returns all the entries as Set-->jaqv [101=John, 102=David, 104=Scott]
		
		//Reading data from hashmap
		
		//Using for..each (preferable in this case
//		for(int k:hm.keySet())
//		{
//			System.out.println(k+ "   "+hm.get(k));
//		}
		
		//Using Iterator
		Iterator <Entry <Integer, String>> it= hm.entrySet().iterator();
		while(it.hasNext())
		{
			Entry<Integer, String> entry=it.next();
		System.out.println(entry.getKey()+"   "+entry.getValue());
		
		}
		
		//clearing the hashmap
		hm.clear();
		System.out.println(hm.isEmpty());//true
	}

}
