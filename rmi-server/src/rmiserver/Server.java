package rmiserver;

import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

import rmiserver.HelloRMIInterface;

import java.rmi.Naming;

public class Server extends UnicastRemoteObject implements HelloRMIInterface {

	private static final long serialVersionUID = 1L;

	public Server() throws RemoteException {
	}

	// implementation of the interface method
	public int calculate(int a, int b) throws RemoteException {
		return a + b;
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
