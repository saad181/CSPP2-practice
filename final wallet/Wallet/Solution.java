import java.util.Scanner;

public class Solution {
	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		int c = 0;
		int num = Integer.parseInt(s.nextLine());
		User u = new User(num);
		u.setName(name);
		for (int i = 0; i < num; i++) {
			u.addWallet((s.nextLine()));
		}
		c = 0;
		int flag = 0;
		while (s.hasNext()) {
			String operation = s.nextLine();
			if (operation.equals("quit")) {
				System.out.println("Thank you");
				break;
			}
			String token = s.nextLine();
			String[] tokens = token.split(" ");
			switch (operation) {
				//Please complete the code for credit,debit,transfer and balance operations 
			case "credit":
				u.credit(tokens[0], Integer.parseInt(tokens[1]));
				break;
			case "transfer":
				u.transfer(tokens[0], tokens[1], Integer.parseInt(tokens[2]));
				break;
			case "debit":
				u.debit(tokens[0], Integer.parseInt(tokens[1]));
				break;
			case "balance":
				u.balance(tokens[0]);
				break;

			}
		}
	}
}
