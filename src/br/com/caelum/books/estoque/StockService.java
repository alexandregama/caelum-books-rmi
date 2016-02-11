package br.com.caelum.books.estoque;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class StockService extends UnicastRemoteObject implements StockRmi {
	
	private static final long serialVersionUID = 1L;

	public StockService() throws RemoteException {
		super();
	}

	private HashMapStockItemsDao repository = new HashMapStockItemsDao();
	
	@Override
	public StockItem getByCode(String code) throws RemoteException {
		return repository.get(code);
	}

	@Override
	public void decreaseQuantity(String code, Integer quantity) throws RemoteException {
		repository.updateQuantity(code, quantity);
	}

	@Override
	public List<StockItem> getAllStockItems(List<String> codes) throws RemoteException {
		return repository.getAllStockItemsFrom(codes);
	}

}
