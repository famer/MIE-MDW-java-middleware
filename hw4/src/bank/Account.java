package bank;

import java.util.HashMap;
import java.util.Map;

public class Account {
	private static Account account;
	public static Account getAccount() {
		if (account != null) {
			return account;
		}
		account = new Account();
		return account;
	}
	public static final Map<Integer, Double> Accounts = new HashMap<Integer, Double>();
	static {
		Accounts.put(10, 10000.00);
		Accounts.put(12, 5000000.00);
	}
	public static void CreateAccount(int number, double balance) {
		Accounts.put(number, balance);
	}
}
