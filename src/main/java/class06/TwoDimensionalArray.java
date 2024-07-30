package class06;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring Array - when the size of the array is fixed
		//Approach 1
		//int a[][] =new int[3][2];
		//int [][] a=new int[3][2]; -- Valid
		//int []a[] =new int[3][2]; -- Valid
		/*
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		*/
		
		
		//Approach 2
		int a[][]= { {100,200},
				{300,400},
				{500,600}
				
		};
		
		//Find size of an array
		System.out.println("length of the rows "+a.length);
		System.out.println("length of the column "+ a[0].length);
		
		// read single value from an array
		System.out.println(a[2][1]); //600
		
		// to read all the data 
		// Normal for loop 
		// Approach 1
//		for(int r=0;r<=2;r++)
//		{
//			for(int c=0;c<=1;c++)
//			{
//				System.out.print(a[r][c] + " ");
//			}
//			System.out.println();
//		}
		
//		// Approach 2
//		for(int r=0;r<=a.length-1;r++)
//		{
//			for(int c=0;c<=a[r].length-1;c++)
//			{
//				System.out.print(a[r][c] + " ");
//			}
//			System.out.println();
//		}
		
		// using forEach
		for (int arr[] : a) {
			
			for (int is2 : arr) {
				System.out.print(is2+" ");
			}
			System.out.println();
			
		}
	}

}
