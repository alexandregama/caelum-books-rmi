package br.com.caelum.books.estoque;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class HashMapStockItemsDao {

	private Map<String, StockItem> itens = new HashMap<String, StockItem>();
	
	public HashMapStockItemsDao() {
		itens.put("ARQ", new StockItem("ARQ", 10, 1));
		itens.put("REST", new StockItem("REST", 12, 1));
		itens.put("SOA", new StockItem("SOA", 8, 1));
		itens.put("JSF", new StockItem("JSF", 15, 1));
		itens.put("TDD", new StockItem("TDD", 7, 1));
	}

	public StockItem get(String code) {
		return itens.get(code);
	}
	
	public void updateQuantity(String code, Integer quantity) {
		StockItem stockItem = itens.get(code);
		
		stockItem.decreaseQuantity(quantity);
	}

	public List<StockItem> getAllStockItemsFrom(List<String> codes) {
		List<StockItem> items = new ArrayList<>();
		codes.forEach(code -> items.add(itens.get(code)));
		
		return items;
	}
	
}
