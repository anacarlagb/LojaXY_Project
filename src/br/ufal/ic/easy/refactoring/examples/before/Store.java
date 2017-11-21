package br.ufal.ic.easy.refactoring.examples.before;

import java.util.ArrayList;
import java.util.List;

import br.ufal.ic.easy.refactoring.examples.Shorts;
import br.ufal.ic.easy.refactoring.examples.Shirt;
import br.ufal.ic.easy.refactoring.examples.Product;
import br.ufal.ic.easy.refactoring.examples.before.compra.Purchase;
import br.ufal.ic.easy.refactoring.examples.before.compra.InvalidPurchaseException;

public class Store {

	private String name;
	private List<Product> productsInStock;
	
	public Store(){
		name = "Store XY";
		productsInStock = new ArrayList();
		productsInStock.add(new Shirt());
		productsInStock.add(new Shirt());
		productsInStock.add(new Shirt());
		productsInStock.add(new Shorts());
		productsInStock.add(new Shorts());	
	}
	

	public Purchase cashPurchase(List<Product> products) throws InvalidPurchaseException{
		if(products.size() < productsInStock.size()){
			double total = 0;
			for(Product product : productsInStock){

				total += product.getPrice();
			}

			double discountedValue = total * 0.1;
			double discountedTotal = total - discountedValue;
			return new Purchase(products, discountedTotal);
		}
		throw new InvalidPurchaseException();
	}
	
	public Purchase creditPurchase(List<Product> products) throws InvalidPurchaseException{
		if(products.size() < productsInStock.size()){
			double total = 0;
			for(Product product : productsInStock){

				total += product.getPrice();
			}

			double discountedValue = total * 0.05;
			double discountedTotal = total - discountedValue;
			return new Purchase(products, discountedTotal);
		}
		throw new InvalidPurchaseException();
	}
	
	
	
	
	
	





	
	
	
}
