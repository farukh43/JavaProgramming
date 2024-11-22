package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {

	public static void main(String[] args) {

		/*
		 * ArrayList<Integer> numberList= new ArrayList<Integer>(); 
		 * numberList.add(10);
		 * numberList.add(15); 
		 * numberList.add(20); 
		 * numberList.add(25);
		 * numberList.add(30); 
		 * numberList.add(35);
		 */

		List<Integer> numberList = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
		List<Integer> evenNumberList = new ArrayList<Integer>();

		/*
		// without using streams
		for (int n : numberList) {
			if (n % 2 == 0) {
				evenNumberList.add(n);
			}

		}
		System.out.println(evenNumberList);
	*/
		//storing the values in another collection
		//with streams
		/*evenNumberList=numberList.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenNumberList);*/
		
		//printing individual value
		numberList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
	}

}
