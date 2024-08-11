package class18;

public class Notes {
	/*
	Exception Handling
	-----------------------
	Exception is an event which will cause program termination
	
	Errors
	----------
	1) Syntax
	2) logical
	
	Types of Exceptions
	--------------------------
	
	Checked Exceptions:
	Identified by the Java compiler.
	Examples: InterruptedException, FileNotFoundException, IOException.
	
	Unchecked Exceptions:
	Not identified by the Java compiler.
	Examples: ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException
		
	try{
	statement
	}catch(Exception e)
	{
	}	
	---------------------
	//For closing connections (ex-db) , for closing files finally block will be executed
	try{
	statement
	}catch(Exception e)
	{
	}finally
	{
	}
	
	Case 1: Exception occurred, catch block handled → finally block will execute.
	Case 2: Exception occurred, catch block NOT handled → finally block will execute.
	Case 3: Exception does not occur, catch block ignored → finally block will execute.
	---------------------------------------------
	checked exeptions can be handled in 2 ways
	Using try catch
	throws
	ex- InterruptedException, file notFoundExeption
	*/
}
