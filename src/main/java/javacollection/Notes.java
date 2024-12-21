package javacollection;

public class Notes {

	/*
	 * LinkedList
	 * ------
	 * Linked list is preferred when we have Insertion and deletion operation
	 * It is Linked Doubly - First element will be null last element will null all other elements will be linked
	 * for ex - null|X|nextelement Address|  |previous ele add|Z|nextelement Address|   |previous ele add|Z|NULL|
	 *
	 *	Structure: Elements are stored in containers called nodes, which are linked using pointers. Each node contains data and a reference to the next node.
		Types: Java’s LinkedList is implemented as a doubly linked list, meaning each node has references to both the next and previous nodes.
		Usage: Ideal for scenarios where frequent insertions and deletions are required, as these operations are more efficient compared to arrays.
		Methods: Common methods include add(), remove(), get(), addFirst(), addLast(), removeFirst(), and removeLast().
		Linked is set as 0 in default
		
	 
	 
	 *ArrayList(C)
	 *------------
	 *ArrayList is preferred when we have lot of retrieving operations
	 *because it is not linked it is easy to perform retrieve operations
	 *Arraylist is set to 10 as default size
	 *ex - if we have 15 element in the arraylist and when we try to add 16th element , a new arraylist will be created internally and existing data will be copied to the new list and OLD list is assigned to Garbage collection 
	
	*HashSet(C)
	*----------
	*the important thing is Load factor/Fill Ratio
	*Default size/intial allocation - 16
	*as long as 0.75 % of the ratio is acheived and we are adding new element the NEW size will be allocated (75% )
	*will not wait to fill the entire 100% load factor
	*once the load factor reaches 75% a new object will be created and old object assigned to garbage collection
	*Sorting is not possible directly
	* 
	* 
	* LinkedHashset(C)
	* --------------------
	* Duplicates are not allowed
	* Insertion Order is preserved
	* Default size/intial allocation - 16
	* as long as 0.75 % of the ratio is acheived and we are adding new element the NEW size will be allocated (75% )
	* will not wait to fill the entire 100% load factor
	* once the load factor reaches 75% a new object will be created and old object assigned to garbage collection
	* internal structure follows the HashTable+LinkedList
	* 
	* Queue (I) --> Dequeue (I) -->BlockingQueue(I) --> BlockingDeQueue (I) 
	* -----------
	* Priority Queue(C)
	* LinkedList(C) - is implemented by LIST (I) as well as Queue (I)
	* FIFO concept is implemented (sending Email CC and BCC) - Prior to processing 
	* Insertion Order is preserved
	* Duplicates are allowed
	* Heterogeneous Data is NOT allowed
	* 
	* 
	* HashTable
	* ----------------------
	* It is Synchronized
	* Thread Safe, at a time only 1 thread can access the method other threads will waiting 
	* One thread allowed at a time
	* performance is Slower compare to HashMap
	* Nulls cannot accept (not as Key and Values)
	* Intially Hashtable is there 
	* Later Hashap is introduced
	* It is Legacy
	* Based on Hashcode internally the data will be stored
	* Default capacity is 11
	* 
	
	*/

}
