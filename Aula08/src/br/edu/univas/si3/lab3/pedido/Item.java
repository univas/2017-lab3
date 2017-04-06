package br.edu.univas.si3.lab3.pedido;

public class Item {

	private Produto produto;
	private int quantidade;
	
	public Item(Produto p, int quantidade) {
		this.produto = p;
		this.quantidade = quantidade;
	}
	
	public float calcularPrecoTotal() {
		return produto.getPreco() * quantidade;
	}
	
	public Produto getProduto() {
		return produto;
	}
}
