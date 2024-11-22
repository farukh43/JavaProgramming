package lambdaexpression.function;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f = n -> n * n;
		System.out.println(f.apply(5));
		System.out.println(f.apply(10));
		System.out.println(f.apply(2));
		
		//String Lenght
		//string -->lenght --int
		
		Function<String,Integer> fn=s->s.length();
		System.out.println(fn.apply("Welcome")); //7
		System.out.println(fn.apply("Java Programming"));// 16
	}

}
