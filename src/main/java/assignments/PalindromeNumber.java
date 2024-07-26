package assignments;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		/*
		2) Palindrome number (Conditional Statement + Looping)
	   input 121
	   after reversing 121
	   video link: https://www.youtube.com/watch?v=kNE3vq1g2e8
	
		*/   
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");

		int num = sc.nextInt();
		int org_num=num;
		
		  int rev = 0;
		 
		  while (num != 0) 
		  {
		   rev = rev * 10 + num % 10; 
		   num = num / 10;
		  
		  }
		  
		  System.out.println("Reverese Number is " + rev);
		 
		  if(org_num==rev)
		  {
			  System.out.println("Number is Palindrom : " + "Orginal Num is "+ org_num +" And Reverse num is " +rev);
		  }
		  
		  else
		  {
			  System.out.println("Number is NOT Palindrom : " + "Orginal Num is "+ org_num +" And Reverse num is " +rev);
			    }
		  
	
	}

}
