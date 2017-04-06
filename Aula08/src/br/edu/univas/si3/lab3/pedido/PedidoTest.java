package br.edu.univas.si3.lab3.pedido;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class PedidoTest {

	@Test
	public void testAdicionaRetiraDoEstoque() {
		
		Produto p1 = new Produto("p1", 5);
		assertEquals(0, p1.getQuantidadeEstoque());
		
		p1.adicionarEstoque(3);
		assertEquals(3, p1.getQuantidadeEstoque());
		
		p1.adicionarEstoque(4);
		assertEquals(7, p1.getQuantidadeEstoque());
		
		p1.adicionarEstoque(5);
		assertEquals(12, p1.getQuantidadeEstoque());
		
		//retirar
		boolean result = p1.retirarEstoque(2);//sucesso
		assertTrue(result);
		assertEquals(10, p1.getQuantidadeEstoque());
		
		result = p1.retirarEstoque(7);//sucesso
		assertTrue(result);
		assertEquals(3, p1.getQuantidadeEstoque());
		
		result = p1.retirarEstoque(5);//fracasso
		assertFalse(result);
		assertEquals(3, p1.getQuantidadeEstoque());
		
		result = p1.retirarEstoque(3);//sucesso
		assertTrue(result);
		assertEquals(0, p1.getQuantidadeEstoque());
		
		result = p1.retirarEstoque(2);//fracasso
		assertFalse(result);
		assertEquals(0, p1.getQuantidadeEstoque());
	}

	@Test
	public void testAdicionarItem () {
		Pedido ped = new Pedido();
		
		Produto p1 = new Produto("p1", 5);
		p1.adicionarEstoque(10);
		boolean result = ped.adicionarItem(p1, 6);
		assertTrue(result);
		
		assertEquals(1, ped.getItens().size());
		
		//estas 3 linhas fazem a mesma coisa que a linha anterior
		ArrayList<Item> lista = ped.getItens();
		int qtd = lista.size();
		assertEquals(1, qtd);
		
		Produto p2 = new Produto("p2", 7);
		p2.adicionarEstoque(20);
		result = ped.adicionarItem(p2, 13);
		assertTrue(result);
		
		assertEquals(2, ped.getItens().size());
		
		//produto sem estoque
		Produto p3 = new Produto("p3", 2);
		result = ped.adicionarItem(p3, 9);
		assertFalse(result);
		
		assertEquals(2, ped.getItens().size());
	}

	@Test
	public void testCalcularPrecoTotalDoItem() {
		Produto p1 = new Produto("p1", 5.5f);
		Item i1 = new Item(p1, 10);
		
		assertEquals(55, i1.calcularPrecoTotal(), 0.01);
	}

	@Test
	public void testCalcularValorDoPedido () {
		
		Pedido ped = new Pedido();
		assertEquals(0, ped.calcularValorPedido(), 0.01);
		
		Produto p1 = new Produto("p1", 5);
		p1.adicionarEstoque(10);
		ped.adicionarItem(p1, 6);
		assertEquals(30, ped.calcularValorPedido(), 0.01);
		
		Produto p2 = new Produto("p2", 7);
		p2.adicionarEstoque(20);
		ped.adicionarItem(p2, 13);
		assertEquals(121, ped.calcularValorPedido(), 0.01);
	}

}
