package br.ufal.ic.easy.refactoring.examples.before.compra;

import java.util.List;

import br.ufal.ic.easy.refactoring.examples.Product;

public class Purchase {

	private double price;
	private List<Product> products;
	private float discount;
	
	
	public Purchase(List<Product> products, double price){
		this.products = products;
		this.price = price;
		
	}
	
	public Purchase(List<Product> products, float discount){
		this.products = products;
		this.discount = discount;
		
	}
	
}
