package br.edu.univas.si3.lab3.conta;

public class ContaCorrente extends Conta {

	private float manutencaoMensal;
	
	//visibilidade
	
	//data
	
	public ContaCorrente(int numero, String cliente, float manutMensal) {
		super(numero, cliente);
//		System.out.println("construtor da ContaCorrente");
		this.manutencaoMensal = manutMensal;
	}
	
	@Override
	public void atualizarSaldo() {
		System.out.println("atualizarSaldo de ContaCorrente");
		
		super.sacar(manutencaoMensal);
	}
	
	@Override
	public void manter() {
		super.sacar(manutencaoMensal);
	}
	
}
