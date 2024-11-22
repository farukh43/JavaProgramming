package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {

	public static void main(String[] args) {
		List <String> vehicles=Arrays.asList("bus","car","bicycle","flight","train");
		List<String> vehiclesListinUppercase = new ArrayList<String>();
	
		//Without Streams Concept without using streams
		/* 
		for (String name : vehicles) {
			vehiclesListinUppercase.add(name.toUpperCase());
		}
		System.out.println(vehiclesListinUppercase);
		*/
		
		//Steam - map
		
		vehiclesListinUppercase=vehicles.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(vehiclesListinUppercase);
	}

}
