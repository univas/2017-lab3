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
			
		try {
			super.sacar(manutencaoMensal);
		} catch (SaldoInsuficienteException e) {

			try {
				super.sacar(super.getSaldo());
			} catch (SaldoInsuficienteException e1) {
				System.out.println("Não pode acontecer isso!!!");
				e1.printStackTrace();
			}
			
		}
	}
	
	@Override
	public void manter() throws SaldoInsuficienteException {
		super.sacar(manutencaoMensal);
	}
	
}
