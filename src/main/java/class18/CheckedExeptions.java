package class18;

public class CheckedExeptions {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program is started");
		System.out.println("Program is inprogress");
		Thread.sleep(5000);
		/*
		try
		{
		Thread.sleep(5000);
		}catch(InterruptedException e)
		{
		}
		*/
		System.out.println("Program is completed");
		System.out.println("Program is exited");
	
	}

}
