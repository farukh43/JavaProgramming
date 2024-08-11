package class18;

public class FinallyBlock {

	public static void main(String[] args) {
		System.out.println("Program is started");

		String s = null;
		try {
			System.out.println(s.length());
		} catch (NumberFormatException e) {
			System.out.println("Catch block handle exeception");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("you entered into finally block");
		}

		System.out.println("Program is completed");
		System.out.println("Program is exited");

	}

}
