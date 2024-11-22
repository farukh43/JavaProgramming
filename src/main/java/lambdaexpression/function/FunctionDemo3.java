package lambdaexpression.function;

import java.util.function.Function;

public class FunctionDemo3 {

	public static void main(String[] args) {

		/*
		 * function chaining 
		 * andThen()
		 * compose()
		 */
		
		Function<Integer,Integer> f1=n->n*2;
		Function<Integer,Integer> f2=n->n*n*n;
		
		System.out.println(f1.andThen(f2).apply(2)); //6 64
		
		//					-----------> f1 valuse given to f2
		System.out.println(f1.compose(f2).apply(2)); //8 16
	
		//					<-----------f2 valuse given to f1					
	}

}
