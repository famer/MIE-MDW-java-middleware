package currency;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ConvertCurrencyInterface extends Remote {
	public static double EUR = 1.44;
	public static double USD = 2.44;
	public static double GBP = 3.44;
	
	
	public double Convert(String from, String to, double amount) throws RemoteException;
}