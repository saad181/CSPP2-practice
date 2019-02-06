public class Wallet {
	String name;
	int amount;

	public Wallet() {
		
	}
	public Wallet(String name,int amount) {
		this.name = name;
		this.amount =amount;
	}
	public String getName() {
		return this.name;
	}
	public int getAmount() {
		return this.amount;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String toString() {
		return this.name+" "+this.amount;
	}
}