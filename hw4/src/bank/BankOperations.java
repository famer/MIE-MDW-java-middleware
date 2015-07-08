package bank;

import javax.jws.WebService;

@WebService
public class BankOperations {
	public boolean Transfer( int from, int to, double amount ) {
		BankAccount ba = new BankAccount();
		if ( ba.AccountExists(from) && ba.AccountExists(to)
				&& ba.AccountBalance(from,  -amount) ) {
			ba.ChangeBalance(from, -amount);
			ba.ChangeBalance(to, amount);
			return true;
		}
		return false;
	}
}
