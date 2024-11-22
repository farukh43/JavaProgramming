package lambdaexpression;

public class Notes {
	/*
	 * Objective of Lambda expression Functional programming features we can achieve
	 * using lambda to improve the code optimization/consize code
	 * 
	 * What is lambda expression 
	 * def - lambda expression is an Anonymous functions
	 * 
	 * What is Anonymous functions 
	 * 1. Nameless 
	 * 2. no return type 
	 * 3. No access modifier
	 * 
	 * Ex of labmba expression
	 * n-> return n*n; - Invalid -> if we use return type we should define the {}
	 * n-> {return n*n;}; - Valid
	 * n-> {return n*n}; - Invalid -> ; is missing refer the above eg
	 * n-> {n*n;};       - Invalid -> {} is not required here
	 * n->n*n;			- valid
	 * 
	 * 
	 * what is functional internaface?
	 * It should contains only one single abstarct method (SAM- single abstarct method )
	 * 
	 * Java 8 onwards we can create Abstract menthods, default method and static method in abstract 
	 * 
	 * ex of functional internaface in java which is already available
	 * Runnable ->run()
	 * Callable->call()
	 * Comparable->compareTo()
	 * ActionListener->actionperformed()
	 * 
	 * Lambda expression can we invoked only through functional interfaces
	 *
	 *Pre- definned functional Interfaces
	 *---------------------------------------
	 *We can use it to write the lambda expression in general coding
	 *ex
	 *1. Predicate - test()
	 *2. Function  - apply()
	 *3. Consumer  - accept()
	 *4. Supplier  - get()
	 *
	 *java.util.function package contains the above interfaces
	 *
	 *1. Predicate 
	 *--------------
	 *It is having only one abstract method test() which will return boolean value
	 *It will take only one Argument as i/p and return boolen value
	 *It is used in conditional checks in code
	 *
	 *interface Predicate<T>
	 *{
	 *public abstract boolen test(T t)
	 *{
	 *}
	 *}
	 *
	 *---------------------------------------
	 *2. Function
	 *---------------------------------------
	 *It is a predefined functional Interface
	 *It is having only one abstract method apply() we can pass any type of argument and this will return a single value of any time
	 *<T,R> =<type, Return Type>
	 *interface Function<T,R>
	 *{
	 *public R apply(T);
	 *}
	 *}
	 *
	 *---------------------------------------
	 *function chaining
	 *andThen()
	 *compose()
	 *----------------------------------------
	 *3.Consumer - accept - only input no return value
	 *----------------------------------------
	 *It is a predefined functional Interface
	 *It is having only one abstract method accept()
	 *we can pass any type of argument - only one
	 *It does not return any return value , but it will consume the input
	 *
	 *----------------------------------------
	 *3.Supplier - get - only one input but to retun value
	 *----------------------------------------
	 *t is a predefined functional Interface
	 *It is having only one abstract method get()
	 *we can NOT pass any type of argument
	 *It will return a single value of any type
	 *
	 *
	 *
	 *
	 *
	 */
	

}
