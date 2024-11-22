package lambdaexpression.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {

		Supplier<Date> s = () -> new Date();
		System.out.println(s.get());
	}

}

/*
 * Predicate <T>  test()
 * Function<T,R> apply()
 * Consumer<T> accept()
 * Supplier<R> get()
 */
