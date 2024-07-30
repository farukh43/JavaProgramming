package class03;

public class OperatorsDemo {

	public static void main(String[] args) {
		//1) Arithmetic operators + - * / %

		int a=20,b=10;
		int result=a+b;
		System.out.println("Sum of a and b is "+result);
		
		System.out.println("Sum of a and b is "+(a+b));
		System.out.println("diff of a and b is "+(a-b));
		System.out.println("multiplication of a and b is "+(a*b));
		System.out.println("Division of a and b is "+(a/b));
		System.out.println("Modulo division of a and b is "+(a%b));
		
		
		//2) Relational/comparison operators > >= < <= !=
		//Return boolean value - true/false
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		b=20;
		System.out.println(a<=b);
		System.out.println(a>=b);
	System.out.println(a!=b);
	System.out.println(a==b);
	boolean res=a>b;
	System.out.println(res);
	
	//3) Logical operators && || !
	//Return boolean value - true/false
	
//	x      y      x&&y      x||y      !x      !y
//	TRUE   TRUE   TRUE      TRUE      FALSE   FALSE
//	TRUE   FALSE  FALSE     TRUE      		   
//	FALSE  TRUE   FALSE     TRUE      TRUE    
//	FALSE  FALSE  FALSE     FALSE     		   TRUE

	boolean x=true;
	boolean y=false;
	
	System.out.println(x && y); //false
	System.out.println(x || y);	// true
	System.out.println(!x);	//false
	System.out.println(!y); //true
	
	boolean b1=10>20; //Valid
	System.out.println(b1);
	
	boolean b2=20>10; //Valid
	System.out.println(b2);
	
	System.out.println(b1 && b2);//false
	System.out.println(b1 || b2);//true
	
	System.out.println((10<20) && (20>10)); //true
	
	}
}
