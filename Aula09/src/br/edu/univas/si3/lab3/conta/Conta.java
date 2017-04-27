package br.edu.univas.si3.lab3.conta;

import java.util.ArrayList;
import java.util.Date;

public class Conta {
	
	private int numero;
	private String cliente;
	private float saldo;
	private ArrayList<Movimento> movimentos = new ArrayList<Movimento>();

	public Conta(int numero, String cliente) {
//		System.out.println("construtor da Conta");
		this.numero = numero;
		this.cliente = cliente;
	}

	public boolean sacar(float valor) {
		System.out.println("sacar: " + numero);
		
		saldo -= valor;
		
		Movimento mov = new Movimento();
		mov.descricao = "sacar";
		mov.valor = valor;
		mov.data = new Date();
		movimentos.add(mov);
		
		return false;
	}
	
	public boolean depositar(float valor) {
		System.out.println("depositar: " + numero);
		return false;
	}
	
	public boolean transferirPara(Conta contaDestino, float valor) {
		System.out.println("transferirPara: " + numero);
		
		this.sacar(valor);
		contaDestino.depositar(valor);
		
		return false;
	}
	
	public ArrayList<Movimento> getUltimosMovimentos(int qtd) {
		return null;
	}
	
	public float getSaldo() {
		System.out.println("getSaldo: " + numero);
		return saldo;
	}
	
	public int getNumero() {
		System.out.println("getNumero: " + numero);
		return numero;
	}
	
}
