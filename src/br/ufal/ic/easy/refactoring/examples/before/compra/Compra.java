package br.ufal.ic.easy.refactoring.examples.before.compra;

import java.util.List;

import br.ufal.ic.easy.refactoring.examples.Produto;

public class Compra {

	private double preco;
	private List<Produto> produtos;
	private float desconto;
	
	
	public Compra(List<Produto> produtos, double price){
		this.produtos = produtos;
		this.preco = price;
		
	}
	
	public Compra(List<Produto> produtos, float desconto){
		this.produtos = produtos;
		this.desconto = desconto;
		
	}


	@Override
	public String toString() {
		return "Compra [preco=" + preco + ", produtos=" + produtos + "]";
	}
	
	
	
	
	
	
	
}
