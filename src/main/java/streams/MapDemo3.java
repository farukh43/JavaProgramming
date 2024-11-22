package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {

	public static void main(String[] args) {
		
		List<Integer> numbersList = Arrays.asList(2,3,4,5);
		List<Integer> multipliedList =new ArrayList<Integer>();
		
		//before java8
		/*
		 for (int num : numbersList) {
			//System.out.println(num*3);
			 multipliedList.add(num*3);
			 
		}
		 System.out.println(multipliedList);
		 */
		
		//using streams - map
		//multipliedList=numbersList.stream().map(num->num*3).collect(Collectors.toList());
		//System.out.println(multipliedList);
		
		//or
		
		numbersList.stream().map(num->num*3).forEach(num->System.out.println(num));
		numbersList.stream().map(num->num*3).forEach(System.out::println);
	}

}
