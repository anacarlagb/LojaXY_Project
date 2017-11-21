package br.ufal.ic.easy.refactoring.examples;

import java.util.ArrayList;
import java.util.List;

import br.ufal.ic.easy.refactoring.examples.after.Store;
import br.ufal.ic.easy.refactoring.examples.after.compra.Purchase;

import br.ufal.ic.easy.refactoring.examples.before.compra.InvalidPurchaseException;

public class Client {
	
	
	public static void main(String[] args) throws InvalidPurchaseException{
		  List<Product> products = new ArrayList<>();
		  
		  products.add(new Shirt());
		  products.add(new Shorts());
		  
		  Store store = new Store();
		  Purchase purchase = store.creditPurchase(products);
		  
		  System.out.println(purchase.toString());
	}
	


	public void purchaseBeforeRefactoring() throws InvalidPurchaseException {
		List<Product> products = new ArrayList<>();

		products.add(new Shirt());
		products.add(new Shorts());

		br.ufal.ic.easy.refactoring.examples.before.Store store = new br.ufal.ic.easy.refactoring.examples.before.Store();
		br.ufal.ic.easy.refactoring.examples.before.compra.Purchase purchase = store.cashPurchase(products);

		System.out.println(purchase.toString());
	}

	public void purchaseAfterRefactoring() throws InvalidPurchaseException {
		List<Product> products = new ArrayList<>();

		products.add(new Shirt());
		products.add(new Shorts());

		Store store = new Store();
		Purchase compra = store.cashPurchase(products);

		System.out.println(compra.toString());
	}

}
