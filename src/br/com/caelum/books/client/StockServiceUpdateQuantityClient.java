package br.com.caelum.books.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import br.com.caelum.books.estoque.StockItem;
import br.com.caelum.books.estoque.StockRmi;

public class StockServiceUpdateQuantityClient {

	public static void main(String[] args) {
		String api_url = "rmi://localhost:1099/stock";
		
		try {
			StockRmi service = (StockRmi) Naming.lookup(api_url);
			
			StockItem originalStock = service.getByCode("ARQ");
			System.out.println(originalStock);
			
			
			service.decreaseQuantity("ARQ", 2);
			StockItem updatedStock = service.getByCode("ARQ");
			System.out.println(updatedStock);
		} catch (MalformedURLException | NotBoundException e) {
			throw new RuntimeException("Error while trying to lookup rmi service with Malformed url.", e);
		} catch (RemoteException e) {
			throw new RuntimeException("Error while trying to lookup rmi service", e);
		}
		
	}
	
}
