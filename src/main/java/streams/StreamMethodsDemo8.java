package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethodsDemo8 {
	
	    public static void main(String[] args) {
	        List<String> animalsList = Arrays.asList("Dog", "Cat", "Elephant");
	        List<String> birdsList = Arrays.asList("Peacock", "Parrot", "Crow");

	        Stream<String> stream1 = animalsList.stream();
	        Stream<String> stream2 = birdsList.stream();

	        List<String> finalList = Stream.concat(stream1, stream2).collect(Collectors.toList());

	        for (String item : finalList) {
	            System.out.println(item);
	        } 
	    }
	}



