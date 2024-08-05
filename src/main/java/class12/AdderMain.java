package class12;

public class AdderMain {

	public static void main(String[] args) {
		Adder obj = new Adder();
		obj.sum(); //1
		obj.sum(10,20);//2
		obj.sum(10,20.09);//3
		obj.sum(10.15,20);//4
		
		obj.sum(10,30,40); //5
		//obj.sum(109.098+89+09); errors
		
		
		
	}

}
