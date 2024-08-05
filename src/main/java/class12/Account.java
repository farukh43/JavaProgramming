package class12;

public class Account {
	
	private int accno;
	private String Name;
	private double amount;
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
		//this keyword --> if we remove the this keyword we will get the value as 0 in the main method
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

}
