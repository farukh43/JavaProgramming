package assignments;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
	
	// 3) Prime number
	// Video Link: https://www.youtube.com/watch?v=vwjhT_OTp1w
	//Natural Number > 1 
	//Which has only 2 factors 1 and itself
	//19 => 1 and 19 => Prime Number
	//28 => 1,2,4, 7, 14, 28 => Not a Prime Number
	
		int num=19;
		int count=0;
		
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i ==0)
					count++;
			}	
			
			if(count==2)
			{
				System.out.println("Prime Number");
			}
			else
			{
				System.out.println("Not Prime Number");
				
			}
		}
		else
		{
			System.out.println("Not Prime Number");
			
		}
	
	}

}
