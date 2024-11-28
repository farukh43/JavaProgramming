package class20;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListDemo {

	public static void main(String[] args) {
		
		//Declaration
		ArrayList mylist =new ArrayList();
		//List mylist = new ArrayList();
		//ArrayList<String> mylist =new ArrayList <String>();
		
		//Adding data into arraylist
		//add method will add the value in queue after the last element
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
		//size of the arraylist
		System.out.println("Size of an arraylist:" +mylist.size());
		
		//Printing arraylist
		System.out.println("Printing data from arraylist:"+mylist);//[100, 10.5, welcome, A, true, 100, null, null]
		
		//remove element from arraylist
		mylist.remove(5);
		System.out.println("After removing:"+mylist);//[100, 10.5, welcome, A, true, null, null]
		
		//Insert element in the arraylist
		mylist.add(2,"java");
		System.out.println("After insertion:"+mylist); //[100, 10.5, java, welcome, A, true, null, null]
		
		//Modify or replace element in the arraylist (modify/replace/change)
		mylist.set(2, "python");
		System.out.println("After replacing:"+mylist); //[100, 10.5, python, welcome, A, true, null, null]
		
		//Access specific elements from arraylist
		System.out.println(mylist.get(3)); //welcome
		
		//reading all the elements from arraylist 
		
		/*
		//using normal for loop
		for(int i=0;i<mylist.size();i++)
		{
			//mylist.get(i)
			System.err.println(mylist.get(i));
		}
		*/
		
		/*
		//using enhanced for loop or foreach... loop
		for (Object x : mylist) {
			System.err.println(x);
			
		}
		*/
		
		//Using iterator
		//<Object> is optional
		// for heterogeneous data we can specify the datatype 
		//Iterator<String> it=mylist.iterator();
		Iterator<Object> it=mylist.iterator();
		
		while(it.hasNext())
		{
			System.err.println(it.next());
		}
		
		//Checking arraylist is empty or not		
		System.out.println("Is arraylist empty "+ mylist.isEmpty());
		
		
		//remove all the elements from array list
		// we cannot remove few random elements from the list to acheive this we need to create another list and save the value which we need to remove and then pass it too the original list
		ArrayList mylist2 = new ArrayList();
		mylist2.add(100);
		mylist2.add("welcome");
		
		mylist.removeAll(mylist2);
		
		System.out.println("After removing multiple elements "+ mylist);
		
		//remove all the elements/clear
		mylist.clear();
		System.out.println("Is arraylist empty "+ mylist.isEmpty());//true
		
				
	}

}
