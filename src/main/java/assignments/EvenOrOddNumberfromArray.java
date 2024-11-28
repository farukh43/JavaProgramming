package assignments;

public class EvenOrOddNumberfromArray {

	public static void main(String[] args) {
	   /*
		2) Print Even and Odd numbers from array
	   a = {1,2,3,4,5,6}
	   Even = {2,4,6}
	   Odd = {1,3,5}
	   Video Link: https://www.youtube.com/watch?v=e3x0bnOrcAA
	*/
		System.out.println("Test");

		int a[]= {1,2,3,4,5,6};
		
		//extracting even numbers...
	/*	
		System.out.println("Even Number in Array---- ");
		for(int i=0;i<=a.length-1;i++)
		{
			if (a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		
		System.out.println("Odd Number in Array---- ");
		for(int i=0;i<=a.length-1;i++)
		{
			if (a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}
		*/
		// Using for Each Loop
		
		System.out.println("Even Number in Array---- ");
		for (int i : a) {
			if (i%2==0)
			{
				System.out.println(i);
			}
		}
		
		System.out.println("Odd Number in Array---- ");
		for (int i : a) {
			if (i%2!=0)
			{
				System.out.println(i);
			}
		}
	
	}

}
