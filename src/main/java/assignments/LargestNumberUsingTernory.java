package assignments;

public class LargestNumberUsingTernory {

	public static void main(String[] args) {
		//1) largest of 2 numbers (if...else, ternary operator)
		int num1=1000;
		int num2=200;
		
		int largest=(num1>num2) ? num1 :num2;
		System.out.println("Largest number is "+largest);

	}

}
