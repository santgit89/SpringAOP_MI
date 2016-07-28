package business;

public class Bank {

	private int amount = 4000;
	private String account = "sbi123";

	public int deposit(int amount, String account) {
		if (account.equals(this.account)) {
			this.amount += amount;
			return this.amount;
		}
		else{
			throw new AccountNotFoundException();
		}
	}

}
