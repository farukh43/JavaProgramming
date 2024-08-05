package class13;

public class ThisKeyword {

	int x,y;// class variable /instance variable
	/*
	ThisKeyword (int a, int b)
	{
		this.x=a;
		this.y=b;
	}
	*/
	
	// o/p of the below methis is 0 and 0 , becoz java could not differentiate the local and class variable
	
//	void setData (int x, int y)
//	{
//		x=x;
//		y=y;
//	}
	
	void setData (int x, int y)	{
		this.x=x;
		this.y=y;
	}
	
//the below method will work without this keyword becoz variable names are different
//	void setData (int a, int b)
//	{
//		x=a;
//		y=b;
//	}
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
	
	
	
	
	public static void main(String[] args) {
		
		//ThisKeyword th = new ThisKeyword(100,200);
		ThisKeyword th = new ThisKeyword();
		th.setData(100, 200);
		th.display();
	}

}
