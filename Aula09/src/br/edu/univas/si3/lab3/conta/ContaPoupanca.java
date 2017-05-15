package br.edu.univas.si3.lab3.conta;

public class ContaPoupanca extends Conta {

	private float taxaDeJuros;
	
	public ContaPoupanca(int numero, String cliente, float taxaJuros) {
		super(numero, cliente);
//		System.out.println("construtor da ContaPoupanca");
		this.taxaDeJuros = taxaJuros;
	}
	
	public void atualizarSaldo() {
		System.out.println("atualizarSaldo de ContaPoupanca");
		
		float acrescimo = super.getSaldo() * taxaDeJuros;
		super.depositar(acrescimo);
	}
	
	@Override
	public void manter() {
		float acrescimo = super.getSaldo() * taxaDeJuros;
		super.depositar(acrescimo);
	}
}
