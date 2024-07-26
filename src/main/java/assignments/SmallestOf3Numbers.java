package assignments;

public class SmallestOf3Numbers {

	public static void main(String[] args) {
	//	2) smallest of 3 numbers (if...else)
		int num1=1000;
		int num2=200;
		int num3=300;
		
		if(num1<num2 && num1<num3)
		{
			System.out.println("Num1 is the smallest Num "+num1);
		}
		else if (num2<num1 && num2<num3){
			System.out.println("Num2 is the smallest Num "+num2);
		}
		else
		{
			System.out.println("Num3 is the smallest Num "+num3);
		}
	}

}
