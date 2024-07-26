package assignments;

import java.util.HashSet;

public class FindDuplicateElementsInArray {

	public static void main(String[] args) {
	//4) write a program to find out the duplicate values from the below line
	//int a[] = { 100, 100, 200, 300, 400, 100 ,200};
	//Video Link :https://www.youtube.com/watch?v=X_NfqtyG4Bs

		
		
	//String arr[] = { "Java", "C", "Python", "java", "Java1" };
		int arr[] = { 100, 200, 300, 400, 100 ,200,100};
//		// Approach 1 --> Best Approach 
//		boolean flag = false;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] == arr[j]) {
//					System.out.println("Found Duplicate Element :" + arr[i]);
//					flag = true;
//
//				}
//			}
//		}
//
//		if (flag == false) {
//			System.out.println(" Duplicate Element Not Found :");

//		}

//		// Approach 2
		HashSet langs = new HashSet();	
//		langs.add("Java");
//		langs.add("Python");
//		langs.add("Java");
		
//		System.out.println(langs.add("Java"));
//		System.out.println(langs.add("Python"));
//		System.out.println(langs.add("Java"));
//		System.out.println(langs);

		//change the int l to String l or any other data types based on input value
		boolean flag=false;
		for (int l : arr) {
			//System.out.println(langs.add(l));
			if(langs.add(l)==false)
			{
				System.out.println("Found Duplicate Element: "+l);
				flag=true;
			}		
		}
		
		if(flag==false)
		{
			System.out.println("Not Found Duplicate Element");
		}

	}

}

