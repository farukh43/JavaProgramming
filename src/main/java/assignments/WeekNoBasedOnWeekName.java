package assignments;

public class WeekNoBasedOnWeekName {

	public static void main(String[] args) {
		
		//3) print week number based on week name (switch case)

		String weekName="Monday";
		
		switch(weekName)
		{
		case "Sunday" :System.out.println("The Week No Is "+1);break;
		case "Monday" :System.out.println("The Week No Is "+2);break;
		case "Tuesday" :System.out.println("The Week No Is "+3);break;
		case "Wednesday" :System.out.println("The Week No Is "+4);break;
		case "Thrusday" :System.out.println("The Week No Is "+5);break;
		case "Friday" :System.out.println("The Week No Is "+6);break;
		case "Saturday" :System.out.println("The Week No Is "+7);break;
		default:System.out.println("Invalid Week Number");
		
		
		
		
		}
		
		
	}

}
