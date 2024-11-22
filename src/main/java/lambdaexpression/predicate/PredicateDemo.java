package lambdaexpression.predicate;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

		// Ex1
		Predicate<Integer> p = i -> (i > 10);
		System.out.println(p.test(20)); // true
		System.out.println(p.test(2));// false

		// Ex - 2 - Check the lenght of the given string is greater tha 4 or not
		Predicate<String> st = s -> (s.length() > 4);
		System.out.println(st.test("Welcome"));// true
		System.out.println(st.test("XYZ"));// false

		// Ex-3 Print array element whose size is >4 from array
		String Name[] = { "David", "Scott", "smith", "john", "Mary" };
		for (String names : Name) {
			if (st.test(names)) {
				System.out.println(names);
			}

		}
		
		
		
	}

}
