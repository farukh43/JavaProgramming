package javacollection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueDemo2 {
//This is for queue concept explaination
	public static void main(String[] args) {
		LinkedList q = new LinkedList();
		
		//adding elements add() offer()
		q.add("A");
		q.add("B");
		q.add("C");
		q.offer("C");
		q.offer(100);// allowed in queue
		System.out.println(q);//[A, B, C, C] --> insertion order preserved & duplicated allowed
		
		//get head element element() peak()
		//System.out.println(q.element()); //A -id we comment add and offer values we will get - Return head element, if empty return .NoSuchElementException
		//System.out.println(q.peek());// - A returns head element, if empty return null
		
		//Return and remove element from Queue remove()   poll()
		/* remove method will through the exception if the queue is empty
		poll method will return null if the queue is empty
		*/
		//System.out.println(q.remove()); //A
		//System.out.println(q);//[B, C, C]
		
		
		//System.out.println(q.poll()); //A
		//System.out.println(q);//[B, C, C]
		
		/*
		Iterator itr =q.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		*/
		
		for (Object value : q) {
			System.out.println(value);
			
		}
	}

}
