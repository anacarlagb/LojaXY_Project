package br.ufal.ic.easy.refactoring.examples.after.compra;

import java.util.List;

import br.ufal.ic.easy.refactoring.examples.Produto;
import br.ufal.ic.easy.refactoring.examples.before.compra.CompraInvalidaException;

public class Compra {

	private double preco;
	private List<Produto> produtos;
	private float desconto;

	public Compra(List<Produto> produtos, float desconto){
		this.produtos = produtos;
		this.desconto = desconto;
	}

	public void calcularComprar(){

	   double total = 0;
	   for(Produto produto : produtos){
		   
		   total += produto.getPreco();
	   }
		   
		double valorDescontado = total * desconto;
		preco = total - valorDescontado;			 
	}
	
	
	
	
	
	
	public List<Produto> getProdutos() {
		return produtos;
	}

	@Override
	public String toString() {
		return "Compra [preco=" + preco + ", produtos=" + produtos + "]";
	}
	
	
	
	
	
	
	
}
