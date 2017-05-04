package br.edu.univas.si3.lab3.conta;

import java.util.ArrayList;
import java.util.Date;

public abstract class Conta {
	
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
//		System.out.println("sacar: " + numero);
		
		if(saldo < valor) {
			return false;
		}		
		saldo -= valor;
		criarMovimento("sacar", valor);
		return true;
	}
	
	public boolean depositar(float valor) {
//		System.out.println("depositar: " + numero);
		saldo += valor;
		criarMovimento("depositar", valor);
		return true;
	}

	private void criarMovimento(String descricaoMov, float valorMov) {
		Movimento mov = new Movimento();
		mov.descricao = descricaoMov;
		mov.valor = valorMov;
		mov.data = new Date();
		movimentos.add(mov);
	}
	
	public boolean transferirPara(Conta contaDestino, float valor) {
		System.out.println("transferirPara: " + numero);
		
//		boolean sacouComSucesso = this.sacar(valor);
		if(this.sacar(valor)) {
			contaDestino.depositar(valor);
			return true;
		}
		return false;
	}
	
	public ArrayList<Movimento> getUltimosMovimentos(int qtd) {
		ArrayList<Movimento> ultimos = new ArrayList<Movimento>();
		
		int ini = movimentos.size() - qtd;
		for (int i = ini; i < movimentos.size(); i++) {
			ultimos.add(movimentos.get(i));
		}
		return ultimos;
	}
	
	public float getSaldo() {
//		System.out.println("getSaldo: " + numero);
		return saldo;
	}
	
	public int getNumero() {
//		System.out.println("getNumero: " + numero);
		return numero;
	}
	
	public abstract void atualizarSaldo();
//	{
//		//???????????????????
//		System.out.println("atualizarSaldo de conta");
//	}
	
}
