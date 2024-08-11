package class15;

class Test {
	final int x = 100;
}

public class FinalKeyword {

	public static void main(String[] args) {
		Test t = new Test();
		// t.x=200; we can not change the x, becoz x is final
		System.out.println(t.x);

	}

}
