package br.edu.univas.si3.lab3.order;

public class Item {
	
	String name;
	int code;
	float unitValue;
	int amount;//quantidade
	
	float totalValue() {
		return amount * unitValue;
	}
}
