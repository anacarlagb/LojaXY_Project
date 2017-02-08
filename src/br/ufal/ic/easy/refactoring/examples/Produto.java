package br.ufal.ic.easy.refactoring.examples;

public class Produto {
	
	protected String marca;
	protected float preco;
	
	
	
	public Produto(String nome, float preco) {
		this.marca = nome;
		this.preco = preco;
	}



	@Override
	public String toString() {
		return "Produto [marca=" + marca + ", preco=" + preco + "]\n";
	}



	public float getPreco() {
		return preco;
	}
	
	
	
	
	
	
	
    
}
