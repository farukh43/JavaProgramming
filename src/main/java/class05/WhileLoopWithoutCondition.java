package class05;

public class WhileLoopWithoutCondition {

	public static void main(String[] args) {
		int i=1;
		while(true)
		{
			System.out.println("Hello");
			i++;
			//This is infinite Loop
			//To break the loop we will do the below thing		
			if(i==10)
			{
				break;
			}
		}

	}

}
