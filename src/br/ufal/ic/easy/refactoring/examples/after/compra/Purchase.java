package br.ufal.ic.easy.refactoring.examples.after.compra;

import java.util.List;

import br.ufal.ic.easy.refactoring.examples.Product;
import br.ufal.ic.easy.refactoring.examples.before.compra.InvalidPurchaseException;

public class Purchase {

	private double price;
	private List<Product> products;
	private double discount;

	public Purchase(List<Product> products, double discount){
		this.products = products;
		this.discount = discount;
	}

	public void calculate(){

	   double total = 0;
	   for(Product produto : products){
		   
		   total += produto.getPrice();
	   }
		   
		double valorDescontado = total * discount;
		price = total - valorDescontado;			 
	}
	
	
	public List<Product> getProducts() {
		return products;
	}


	
	
	
	
	
	
	
}
