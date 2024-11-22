package javacollection;

import java.util.HashSet;

public class HastSetDemo2 {

	public static void main(String[] args) {
		HashSet<Integer> evenNumber = new HashSet <Integer>();
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		
		System.out.println("HashSet :" + evenNumber);// [2, 4, 6]
		
		HashSet<Integer> number = new HashSet <Integer>();
		number.addAll(evenNumber);
		number.add(10);
		
		System.out.println("New HashSet :" + number);// New HashSet :[2, 4, 6, 10]
		
		//removeAll
		number.removeAll(evenNumber);
		System.out.println("After Removing :" + number);//[10]
		
		
	}

}
