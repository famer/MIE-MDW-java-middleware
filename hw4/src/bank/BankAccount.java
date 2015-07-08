package bank;

import javax.jws.WebService;
 
@WebService
public class BankAccount {
 
    public boolean AccountExists( int number ) {
        return Account.Accounts.containsKey(number);
    }
 
    public boolean AccountBalance( int number, double balance ) {
        if ( !this.AccountExists(number) ) {
            return false;
        }
        double value = (Double)Account.Accounts.get(number);
        if ( (value + balance) >= 0 ){
            return true;
        }
        return false;
    }
 
    public boolean ChangeBalance( int number, double value ) {
        if ( !this.AccountExists(number) ) {
            return false;
        }
        if ( !this.AccountBalance(number, value) ) {
            return false;
        }
        Account.Accounts.put(number,
                Account.Accounts.get(number) + value);
        return true;
    }
}