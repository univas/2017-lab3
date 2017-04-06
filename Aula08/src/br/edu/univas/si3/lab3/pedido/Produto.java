package br.edu.univas.si3.lab3.pedido;

public class Produto {

	private String nome;
	private int quantidadeEstoque;
	private float preco;
	
	public Produto(String nome, float preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public void adicionarEstoque(int qtd) {
		quantidadeEstoque += qtd;
	}
	
	public boolean retirarEstoque(int qtd) {
		if(quantidadeEstoque >= qtd) {
			quantidadeEstoque -= qtd;
			return true;
		}
		return false;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
}
