package br.edu.univas.si3.lab3.main;

public class Ponto {
	
	int x;
	
	int y;

	void print() {
		System.out.print(x);
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		Ponto p1;
		p1 = new Ponto();
		
		Ponto p2 = new Ponto();
		
		p1.x = 1;
		p1.y = 3;
		
		p2.x = 2;
		p2.y = 1;
		
		p1.print();
		p2.print();
	}

}
