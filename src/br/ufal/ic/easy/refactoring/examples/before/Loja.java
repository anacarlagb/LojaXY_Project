package br.ufal.ic.easy.refactoring.examples.before;

import java.util.ArrayList;
import java.util.List;

import br.ufal.ic.easy.refactoring.examples.Bermuda;
import br.ufal.ic.easy.refactoring.examples.Camiseta;
import br.ufal.ic.easy.refactoring.examples.Produto;
import br.ufal.ic.easy.refactoring.examples.before.compra.Compra;
import br.ufal.ic.easy.refactoring.examples.before.compra.CompraInvalidaException;

public class Loja {

	private String nome;
	private List<Produto> produtosEmEstoque;
	
	public Loja(){
		
		nome = "Loja XY";
		produtosEmEstoque = new ArrayList();
		produtosEmEstoque.add(new Camiseta());
		produtosEmEstoque.add(new Camiseta());
		produtosEmEstoque.add(new Camiseta());
		produtosEmEstoque.add(new Bermuda());
		produtosEmEstoque.add(new Bermuda());
		
		
	}
	

	public Compra comprarAvista(List<Produto> listaProdutos) throws CompraInvalidaException{
		if(listaProdutos.size() < produtosEmEstoque.size()){
			double total = 0;
			for(Produto produto : produtosEmEstoque){

				total += produto.getPreco();
			}

			double valorDescontado = total * 0.1;
			double totalComDesconto = total - valorDescontado;
			return new Compra(listaProdutos, totalComDesconto);
		}
		throw new CompraInvalidaException();
	}
	
	public Compra comprarAPrazo(List<Produto> listaProdutos) throws CompraInvalidaException{
		if(listaProdutos.size() < produtosEmEstoque.size()){
			double total = 0;
			for(Produto produto : produtosEmEstoque){

				total += produto.getPreco();
			}

			double valorDescontado = total * 0.05;
			double totalComDesconto = total - valorDescontado;
			return new Compra(listaProdutos, totalComDesconto);
		}
		throw new CompraInvalidaException();
	}
	
	
	
	
	
	





	
	
	
}
