package br.edu.univas.si3.lab3.order;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrderTest {

	@Test
	public void testCalculateTotalOfOrder() {

		Order o1 = new Order();
		assertEquals(0, o1.calculateTotalValue(), 0.01);
				
		Item i1 = new Item(2, 7);
//		i1.amount = 2;
//		i1.unitValue = 7;
		
		o1.addItem(i1);
		assertEquals(14, o1.calculateTotalValue(), 0.01);
		
		Item i2 = new Item(4, 3);
//		i2.amount = 4;
//		i2.unitValue = 3;
		
		o1.addItem(i2);
		assertEquals(26, o1.calculateTotalValue(), 0.01);
	}
	
	@Test
	public void testCheckAddItem() {

		Order o1 = new Order();
		Item i1 = new Item(1, 1);
		i1.code = 5;
		assertEquals(0, o1.items.size());
		
		o1.addItem(i1);
		assertEquals(1, o1.items.size());
		assertEquals(5, o1.items.get(0).code);
	}

	@Test
	public void testTotalValueOrderImproved() {
		OrderImproved o1 = new OrderImproved();
		assertEquals(0, o1.getTotalValue(), 0.01);
		
		Item i1 = new Item(5, 4);
//		i1.amount = 5;
//		i1.unitValue = 4;
		
		o1.addItem(i1);
		assertEquals(20, o1.getTotalValue(), 0.01);
		
		Item i2 = new Item(6, 2);
//		i2.amount = 6;
//		i2.unitValue = 2;
		o1.addItem(i2);
		assertEquals(32, o1.getTotalValue(), 0.001);
	}
	
	@Test
	public void testVisibility() {
		OrderImproved o1 = new OrderImproved();
		
		Item i1 = new Item(5, 4);
//		i1.amount = 5;
//		i1.unitValue = 4;
		
//		o1.items.add(i1);//a visibilidade private não permite mais
		o1.addItem(i1);
		assertEquals(20, o1.getTotalValue(), 0.01);
	}
}
