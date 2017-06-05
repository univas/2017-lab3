package br.edu.univas.si3.lab3.conta;

import java.util.ArrayList;
import java.util.Date;

public abstract class Conta implements Manutencao {
	
	private int numero;
	private String cliente;
	private float saldo;
	private ArrayList<Movimento> movimentos = new ArrayList<Movimento>();

	public Conta(int numero, String cliente) {
//		System.out.println("construtor da Conta");
		this.numero = numero;
		this.cliente = cliente;
	}

	public final void sacar(float valor) throws SaldoInsuficienteException {
//		System.out.println("sacar: " + numero);
		
		if(saldo < valor) {
			throw new SaldoInsuficienteException(
					"Saldo insuficiente para sacar " + valor);
		}		
		saldo -= valor;
		criarMovimento("sacar", valor);
	}
	
	public boolean depositar(float valor) throws ValorInvalidoException {
//		System.out.println("depositar: " + numero);
		if(valor <= 0) {
			throw new ValorInvalidoException("O valor não pode ser negativo: " + valor);
		}
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
	
	public void transferirPara(Conta contaDestino, float valor) 
			throws SaldoInsuficienteException, ValorInvalidoException {
		System.out.println("transferirPara: " + numero);
		
//		boolean sacouComSucesso = this.sacar(valor);
		this.sacar(valor);
		contaDestino.depositar(valor);
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
