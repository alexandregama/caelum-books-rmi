package br.com.caelum.books.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import br.com.caelum.books.estoque.StockItem;
import br.com.caelum.books.estoque.StockRmi;

public class StockServiceClient {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
//		StockRmi service = Naming.lookup("rmi://localhost:1099/stock"); we don't neet to write rmi protocol
		StockRmi service = (StockRmi) Naming.lookup("/stock");
		
		StockItem stock = service.getByCode("REST");
		
		System.out.println(stock);
	}
	
}
