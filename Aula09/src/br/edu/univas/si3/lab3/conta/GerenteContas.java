package br.edu.univas.si3.lab3.conta;

import java.util.ArrayList;

public class GerenteContas {

	private ArrayList<Conta> contas = new ArrayList<Conta>();
	
	private ArrayList<Manutencao> contasManutencao = 
			new ArrayList<Manutencao>();
	
	public void addConta(Manutencao c) {
		contasManutencao.add(c);
	}
	
	public void manterTodasAsContas() {
		for (Manutencao contaManutencao : contasManutencao) {
			//agora o manter lança exceção
			try {
				contaManutencao.manter();
			} catch (SaldoInsuficienteException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void acidionar(Conta conta) {
		contas.add(conta);
		
		//para distinguir uma filha de outra, usa-se: instanceof
	}
	
	public void atualizarTodasContas() {
		for (Conta conta : contas) {
			conta.atualizarSaldo();
		}
	}
}
