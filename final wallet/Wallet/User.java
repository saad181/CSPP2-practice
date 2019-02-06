public class User {
	String name;
	Wallet[] warray;
	int wsize;
	Wallet wt = new Wallet();
	public User(int num) {
		this.name = name;
		warray = new Wallet[num];
		wsize = 0;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void addWallet(String wname){
		for (int i = 0; i < warray.length; i++) {
			if (warray[i] == null) {
				warray[i] = new Wallet(wname,1000);
				wsize++;
				break;

			}
		}

	}
	public void credit(String name, int amount) {
		
	
		for (int i = 0; i < wsize; i++) {
			if (warray[i].getName().equals(name)) {
				wt = warray[i];
				break;
			}
		}
		if (amount > 0) {
			wt.amount = wt.amount + amount;
		}
		if (amount < 0) {
			System.out.println("Negative amount");
		}

	}
	public void debit(String wname, int amount) {
		for (int i = 0; i < wsize; i++) {
			if (warray[i].getName().equals(wname)) {
				wt = warray[i];
				break;
			}
		}
		if (amount >= 0 && wt.amount >= amount) {
			wt.amount = wt.amount - amount;
		}
		else if (wt.amount < amount) {
			System.out.println("Insufficient funds");
		}
		else {
			System.out.println("Negative amount");
		}
	}
	public void balance(String wname) {
		for (int i = 0; i < wsize; i++) {
			if (warray[i].getName().equals(wname)) {
				System.out.println((float)warray[i].getAmount());
				break;
			}
		}
	}
	public void transfer(String dname, String cname, int amount) {
		
		for (int i = 0; i < wsize; i++) {
			if (warray[i].name.equals(dname)) {
				if (warray[i].amount < amount) {
					System.out.println("Insufficient funds");
					break;
				}
				warray[i].amount = warray[i].amount - amount;
			}
			if (warray[i].name.equals(cname)) {
				warray[i].amount = warray[i].amount + amount;
			}
		}


	}
}