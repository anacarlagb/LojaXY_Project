package br.ufal.ic.easy.refactoring.examples.after;

import java.util.ArrayList;
import java.util.List;

import br.ufal.ic.easy.refactoring.examples.Shorts;
import br.ufal.ic.easy.refactoring.examples.Shirt;
import br.ufal.ic.easy.refactoring.examples.Product;
import br.ufal.ic.easy.refactoring.examples.after.compra.Purchase;
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

	public Purchase generatePurchase(List<Product> products, double discount)
		throws InvalidPurchaseException{
		if(products.size() < productsInStock.size()){
			Purchase purchase =  new Purchase(products, (float) discount);
			purchase.calculate();
			return purchase;
		}
		throw new InvalidPurchaseException();
	}
	

	public Purchase cashPurchase(List<Product> products) throws InvalidPurchaseException{
		return generatePurchase(products, 0.1);
	}

	public Purchase creditPurchase(List<Product> products) throws InvalidPurchaseException{
		return generatePurchase(products, 0.05);
	}
	
	
	
	
	
	
	



}
