package class04;
	
public class SwitchCaseStatement {

	public static void main(String[] args) {
		int weekno=10;
		
		switch(weekno)
		{
		case 1 : System.out.println("Sunday");break;
		case 2 : System.out.println("Monday");break;
		case 3 : System.out.println("Tueday");break;
		case 4 : System.out.println("Wednesday");break;
		case 5 : System.out.println("Thrusday");break;
		case 6 : System.out.println("Friday");break;
		case 7 : System.out.println("Saturday");break;
		default:System.out.println("Invalid Week number");break;
		}

	}

}
