package br.edu.univas.si3.lab3.order;

public class Item {
	
	//TODO: exercício para casa: colocar private.
	//TODO: e alterar o construtor para recerber estes dois valores
	String name;
	int code;
	private float unitValue;
	private int amount;//quantidade
	
//	//contrtutor default - não precisa ser declarado caso seu corpo for vazio
//	public Item() {
//		
//	}

	//construtor com parâmetros
	public Item(int amount, float value) {
		this.amount = amount;
		unitValue = value;
	}
	
	public float totalValue() {
		return amount * unitValue;
	}
}
