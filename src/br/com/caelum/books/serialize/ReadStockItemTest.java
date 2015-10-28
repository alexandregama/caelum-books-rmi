package br.com.caelum.books.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.caelum.books.estoque.StockItem;

public class ReadStockItemTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("stock.txt"))) {
			StockItem stock = (StockItem) ois.readObject();
			System.out.println(stock);
		}
	}
	
}
