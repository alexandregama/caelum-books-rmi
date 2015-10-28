package br.com.caelum.books.estoque;

import java.io.Serializable;

public class StockItem implements Serializable {

	private static final long serialVersionUID = 1L;

	private String code;
	
	private Integer quantity;

	public StockItem(String code, Integer quantity) {
		this.code = code;
		this.quantity = quantity;
	}

	public String getCode() {
		return code;
	}

	public Integer getQuantity() {
		return quantity;
	}
	
}
