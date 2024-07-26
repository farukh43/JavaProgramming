package class6;

public class SingleDimensionalArrays {

	public static void main(String[] args) {
		
		//declaring arrays
		//approach 1 --.when u know the size of the array
		
		/*
		int a[]= new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		*/
		
		//approach 2 --> when the size of the array is unknown
				
		int a[]= {100,200,300,400,500};
		
		//find the length of the array
		System.out.println("Length of an array is " +a.length);
	
		//read single value from the array
		System.out.println(a[4]);
		
		
		//Reading all the values from array
		System.out.println("---Using Traditional Way ---");
		for(int i=0;i<a.length;i++) //i<=a.lenght-1  i<=4  i<5 
		{
			
			System.out.println(a[i]);
		}
		
		System.out.println("---Using ForEach Loop ---");
		//For Each loop
		for (int i : a) {
			System.out.println(i);
		}
	
	}

}
