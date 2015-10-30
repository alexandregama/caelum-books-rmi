package br.com.caelum.books.serialize;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.caelum.books.estoque.StockItem;

public class WriteStockItemTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		StockItem stock = new StockItem("ARQ", 5, 1);
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stock.txt"))) {
			oos.writeObject(stock);
			System.out.println("StockItem was written!");
		}
	}
	
}
