package class5;

public class WhileVsDowhileLoops {

	public static void main(String[] args) {
		
		// No value will be printed becoz the condition does not met and loop does not started
//		int i = 10; 
//		while (i <= 5) 
//		{
//			System.out.println(i);
//			i++; 
//		}
//	
		
		// 10 will be printed on console because it does not check the condition first
		int i = 10; 
		do
		{
			System.out.println(i);
			i++; 
		}
		while (i <= 5) ;
		
		
		
	}

}
