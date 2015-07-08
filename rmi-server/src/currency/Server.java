package currency;


import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.Naming;

public class Server extends UnicastRemoteObject implements ConvertCurrencyInterface {

	private static final long serialVersionUID = 1L;

	public Server() throws RemoteException {
	}

	// implementation of the interface method
	public double Convert(String fromName, String toName, double amount) throws RemoteException {
		double from = 0;
		double to = 1;
		
		switch (fromName) {
			case "EUR":
				from = this.EUR;
				break;
			case "USD":
				from = this.USD;
				break;
			case "GBP":
				from = this.GBP;
				break;

			default:
					from = to = 1;
			
		}
		
		switch (toName) {
			case "EUR":
				to = this.EUR;
				break;
			case "USD":
				to = this.USD;
				break;
			case "GBP":
				to = this.GBP;
				break;
				
			default:
					from = to = 1;
			
		}
		return amount * (from/to);
	}

	// start the server and register the object in the rmi registry
	public static void main(String args[]) {
		try {
			// install a security manager (uses a security policy)
			if (System.getSecurityManager() == null) {
				RMISecurityManager sm = new RMISecurityManager();
				System.setSecurityManager(sm);
			}

			// create rmi registry
			LocateRegistry.createRegistry(1099);

			// create remote object
			Server obj = new Server();

			// Bind the object instance to the name "HelloRMI"
			// 0.0.0.0 denotes the service will listen on all network interfaces
			Naming.rebind("//0.0.0.0/HelloRMI", obj);

			System.out.println("RMI	server	started,	"
					+ "listening	to	incoming	requests...");
		} catch (Exception e) {
			System.out.println("Error	occurred:	" + e.getLocalizedMessage());
		}
	}
}
