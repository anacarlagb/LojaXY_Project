package br.ufal.ic.easy.refactoring.examples.after;

import java.util.ArrayList;
import java.util.List;

import br.ufal.ic.easy.refactoring.examples.Bermuda;
import br.ufal.ic.easy.refactoring.examples.Camiseta;
import br.ufal.ic.easy.refactoring.examples.Produto;
import br.ufal.ic.easy.refactoring.examples.after.compra.Compra;
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

	public Compra gerarComprar(List<Produto> listaProdutos, double desconto) throws CompraInvalidaException{
		if(listaProdutos.size() < produtosEmEstoque.size()){
			Compra compra =  new Compra(listaProdutos, (float) desconto);
			compra.calcularComprar();
			return compra;
		}
		throw new CompraInvalidaException();
	}

	public Compra comprarAvista(List<Produto> listaProdutos) throws CompraInvalidaException{
		return gerarComprar(listaProdutos, 0.1);
	}

	public Compra comprarAPrazo(List<Produto> listaProdutos) throws CompraInvalidaException{
		return gerarComprar(listaProdutos, 0.05);
	}
	
	
	
	
	
	
	



}
