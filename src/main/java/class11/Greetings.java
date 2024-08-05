package class11;

public class Greetings {
	
	//1) No Param   no Return Value
	
	void m1()
	{
		System.out.println("Helooo .....");
	}
	
	//2) No params, Return value

	String m2()
	{
		return "Helooo how are you.....";
	}
	
	//3) Takes params, No return value
	
	void m3(String name)
	{
		System.out.println("Helooo ....." +name);
	}
	
	//4) Takes params, Returns value

	String m4(String name)
	{
		return "Helooo ....." +name;
	}
	
}
