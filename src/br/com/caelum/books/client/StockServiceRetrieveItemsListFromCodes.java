package br.com.caelum.books.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

import br.com.caelum.books.estoque.StockItem;
import br.com.caelum.books.estoque.StockRmi;

public class StockServiceRetrieveItemsListFromCodes {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		StockRmi service = (StockRmi) Naming.lookup("rmi://localhost:1099/stock");
		
		List<StockItem> items = service.getAllStockItems(Arrays.asList("SOA", "TDD"));
		
		System.out.println(items);
	}
	
}
