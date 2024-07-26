package assignments;

public class CountSumOfDigits {

	public static void main(String[] args) {
		/*
		5) Find sum of digits in a number
	   input: 1234
	   sum = 10
	   Video Link: https://www.youtube.com/watch?v=ZLaBlxnmrxc
	*/
	
	int num=12345;
	int sum=0;
	while(num>0)
	{
		sum=sum+num%10;
		num=num/10;
	}
	
	System.out.println("Sum of digits in a number " + sum);
	
	}

}
