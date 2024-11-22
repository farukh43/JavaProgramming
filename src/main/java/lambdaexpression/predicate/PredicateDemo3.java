package lambdaexpression.predicate;

import java.util.function.Predicate;

//joining Predicates - and , or , Negate
//p1  -- checks number is even
//p2 -- checks greater than 50 
public class PredicateDemo3 {

	public static void main(String[] args) {
		int[] a = { 5, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65 };

		Predicate<Integer> p1 = i -> i % 2 == 0;
		Predicate<Integer> p2 = i -> i > 50;
		
		// and
		System.out.println("Following are numbers Even & Greater then 50...");

		for (int n : a) {
			// if(p1.test(n) && p2.test(n)) the same thing can be written as
			if (p1.and(p2).test(n)) {
				System.out.println("Using and :"+n);
			}
		}
		
		//Or
		
		for (int n : a) {
			// if(p1.test(n) && p2.test(n)) the same thing can be written as
			if (p1.or(p2).test(n)) {
				System.out.println("Using Or :"+n);
			}
		}
		
		//negate
		
		for (int n : a) {
			if (p1.negate().test(n)) {
				System.out.println("Using Negte: " +n);
			}
		}
		

	}

}
