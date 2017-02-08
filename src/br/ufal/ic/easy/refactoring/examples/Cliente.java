package br.ufal.ic.easy.refactoring.examples;

import java.util.ArrayList;
import java.util.List;

import br.ufal.ic.easy.refactoring.examples.after.Loja;
import br.ufal.ic.easy.refactoring.examples.after.compra.Compra;

import br.ufal.ic.easy.refactoring.examples.before.compra.CompraInvalidaException;

public class Cliente {
	
	
	public static void main(String[] args) throws CompraInvalidaException{
		  List<Produto> produtos = new ArrayList<>();
		  
		  produtos.add(new Camiseta());
		  produtos.add(new Bermuda());
		  
		  Loja lojaAfter = new Loja();
		  Compra compra = lojaAfter.comprarAPrazo(produtos);
		  
		  System.out.println(compra.toString());
	}
	


	public void compraAntesDoRefatoramento() throws CompraInvalidaException {
		List<Produto> produtos = new ArrayList<>();

		produtos.add(new Camiseta());
		produtos.add(new Bermuda());

		br.ufal.ic.easy.refactoring.examples.before.Loja loja = new br.ufal.ic.easy.refactoring.examples.before.Loja();
		br.ufal.ic.easy.refactoring.examples.before.compra.Compra compra = loja.comprarAPrazo(produtos);

		System.out.println(compra.toString());
	}

	public void compraDepoisDoRefatoramento() throws CompraInvalidaException {
		List<Produto> produtos = new ArrayList<>();

		produtos.add(new Camiseta());
		produtos.add(new Bermuda());

		Loja loja = new Loja();
		Compra compra = loja.comprarAPrazo(produtos);

		System.out.println(compra.toString());
	}

}
