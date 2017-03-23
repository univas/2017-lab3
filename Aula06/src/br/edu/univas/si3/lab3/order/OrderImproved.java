package br.edu.univas.si3.lab3.order;

import java.util.ArrayList;

public class OrderImproved {

	private ArrayList<Item> items = new ArrayList<Item>();
	private float totalValue = 0f;
	
	public void addItem(Item newItem) {
		items.add(newItem);
		totalValue += newItem.totalValue();
	}
	
	public float getTotalValue() {
		return totalValue;
	}

}
