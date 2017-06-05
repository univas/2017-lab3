package br.edu.univas.si3.lab3.conta;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestConta {

//	@Test
	public void testChamarMetodos() {
		
//		Conta c1 = new Conta(11, "C11");
//		Conta c2 = new Conta(12, "C12");
		ContaCorrente cc = new ContaCorrente(2, "c2", 5);
		ContaPoupanca cp = new ContaPoupanca(3, "C3", 1);
		
//		c1.depositar(10);
//		c1.sacar(5);
//		c1.getNumero();
//		c1.getSaldo();
//		c1.transferirPara(c2, 3);
		
//		c2.transferirPara(c1, 4);
		
//		cc.depositar(100);
//		cc.sacar(500);
//		cc.getNumero();
//		cc.getSaldo();
//		cc.atualizarSaldo();
//		
//		cp.depositar(10000);
//		cp.sacar(5000);
//		cp.getNumero();
//		cp.getSaldo();
//		cp.atualizarSaldo();
		
		fail("Not yet implemented");
	}
	
	@Test
	public void testConta() {
//		Conta c1 = new Conta(11, "C11");//não pode mais pois a Conta tornou-se abstrata
//		Conta c2 = new Conta(12, "C12");
		ContaCorrente cc = new ContaCorrente(2, "c2", 5);
		ContaPoupanca cp = new ContaPoupanca(3, "C3", 1);

		GerenteContas ger = new GerenteContas();
		
//		ger.acidionar(c1);
//		ger.acidionar(c2);
		ger.acidionar(cc);
		ger.acidionar(cp);
		
		ger.atualizarTodasContas();
	}

	@Test
	public void testManutencao() {
		//TODO: tarefa: implementar.
	}

	@Test
	public void testSacar() {
		
		ContaCorrente cc = new ContaCorrente(2, "c2", 5);
		try {
			cc.depositar(100);
		} catch (ValorInvalidoException e1) {
			fail("não era para chegar aqui");
		}
		try {
			cc.sacar(50);
		} catch(SaldoInsuficienteException e) {
			System.out.println("Erro ao sacar: " + e);
		}
		
		//TODO: tarefa: implementar o restante.
	}

	@Test
	public void testDepositar() {
		ContaCorrente cc = new ContaCorrente(2, "c2", 5);
		assertEquals(0f, cc.getSaldo(), 0.01);
		try {
			cc.depositar(100);
		} catch (ValorInvalidoException e) {
			fail("Não era para dar esta exceção");
		}
		assertEquals(100f, cc.getSaldo(), 0.01);

		try {
			cc.depositar(-1);
			fail("não era para chegar aqui");
		} catch (ValorInvalidoException e) {
			System.out.println("aqui era mesmo para dar exceção");
		}
		assertEquals(100f, cc.getSaldo(), 0.01);
	}
}
