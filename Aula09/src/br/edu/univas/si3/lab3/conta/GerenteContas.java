package br.edu.univas.si3.lab3.conta;

import java.util.ArrayList;

public class GerenteContas {

	private ArrayList<Conta> contas = new ArrayList<Conta>();
	
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
