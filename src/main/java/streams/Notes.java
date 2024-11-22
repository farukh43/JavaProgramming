package streams;

public class Notes {
	
	//Streams
	/* Collection : To represent group of data/object as single entity
	 * Stream :to process the data from collections we use streams concepts
	 * 
	 * Streams provide filter and map mechanism to process the data
	 * java.io.streams is package is used to handle the Files
	 * Streams are used in java.util package
	 * 
	 * 1.filter
	 * On certain conditions filter will filter the data and stored in different collection
	 *
	 * 2.map
	 * In Jav a Streams, the map function is used to transform elements in a stream from one type to another. 
	 * It applies a given function to each element of the stream, producing a new stream of the transformed elements.
	 * 
	 * few methods in stream
	 * collect()
	 * count()
	 * sorted()
	 * distinct()
	 * foreach()
	 * min()
	 * max()
	 * 
	 * FilterMap
	 * -------------------------
	 * flatmap returns stream of objects
	 * Used for complex objects
	 * flatmap --> one to many
	 * Map returns signle value
	 * 
	 * Stream Methos
	 * ----------
	 * Terminal and Nonterminal Methods
	 * Refer the StreamMethodsDemo.java files for examples
	 *
	 *sorted
	 *anyMatch
	 *allmatch
	 *nonMatch
	 *
	 *findAny
	 *findFirst
	 *
	 *concatenating Strams
	 *
	 *---------------------------
	 *Parallel Streams
	 *
		The powerful feature of streams is that stream pipelines may execute either sequentially or in parallel. All collections support the parallelStream() method that returns a possibly parallel stream:
		Stream<Student> parallelStream = studentList.parallelStream();

		When a stream executes in parallel, the Java runtime divides the stream into multiple sub-streams. The aggregate operations iterate over and process these sub-streams in parallel and then combine the results.
		Stream = Sub Stream + Sub Stream + Sub Stream

	 * 
	 * 
	 */

}
