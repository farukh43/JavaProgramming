package assignments;

public class MaxAndMinElementInArray {

	public static void main(String[] args) {
		int a[]= {50,30,40,20,60};
		
//		For Finding the Max Element		
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Maximum Element is array is: "+ max);
		
		
//		For Finding the min Element		
		int min=a[0];
		for (int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
	
		System.out.println("Minimum Element is array is: "+ min);
		
		
	}

}
