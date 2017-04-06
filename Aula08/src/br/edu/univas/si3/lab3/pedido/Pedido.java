package br.edu.univas.si3.lab3.pedido;

import java.util.ArrayList;

public class Pedido {

	private ArrayList<Item> itens = new ArrayList<Item>();
	
	public boolean adicionarItem(Produto p, int quantidade) {
		if(p != null) {
			boolean result = p.retirarEstoque(quantidade);
			if(result) { 
				//conseguiu retirar do estoque
				Item item = new Item(p, quantidade);
				itens.add(item);
				return true;
			}
		}
		return false;
	}
	
	public float calcularValorPedido() {
		float soma = 0f;
		
		for(Item it : itens) {
			soma += it.calcularPrecoTotal();
		}
		return soma;
	}
	
	public ArrayList<Item> getItens() {
		return itens;
	}
}
