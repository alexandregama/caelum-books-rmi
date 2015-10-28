package br.com.caelum.books;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import br.com.caelum.books.estoque.StockRmi;
import br.com.caelum.books.estoque.StockService;

public class StockPublisher {

	public static void main(String[] args) throws RemoteException {
		StockRmi service = new StockService();
		
		try {
			LocateRegistry.createRegistry(1099);
			Naming.rebind("/stock", service);
			System.out.println("Stock service is ready to be used!");
		} catch (MalformedURLException e) {
			throw new RuntimeException("Error while trying to rebind a service with MalformedUrl.", e);
		} catch (RemoteException e) {
			throw new RuntimeException("RemoteException while trying to rebind a service", e);
		}
	}
	
}
