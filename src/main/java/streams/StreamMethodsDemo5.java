package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethodsDemo5 {

	public static void main(String[] args) {
		
		List<Integer> list1 =Arrays.asList(2,4,1,3,5,7,6);
		
		List<Integer> sortedList=list1.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList); //ascending order

		
		List<Integer> reversesortedList=list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reversesortedList); //descending order
	
	
		//String
		List <String> list2=Arrays.asList("John","Mary","Kim","David","Smith");
		
		List<String> sortedList2=list2.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList2); //ascending order

		
		List<String> reversesortedList2=list2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(reversesortedList2); //descending order
	
	
	}

}
