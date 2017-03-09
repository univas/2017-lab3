package br.edu.univas.si3.lab3.main;

import static org.junit.Assert.*;

import org.junit.Test;

public class MeanTest {

	@Test
	public void testMean() {
		
		int [] vector;
		vector = new int [3];
		vector [0] = 4;
		vector [1] = 7;
		vector [2] = 9;
		
		float result = Runner.calculateMean(vector);
		
		assertEquals(6.0f, result, 0.1);
		
		int [] vectorTwo = new int [] {2, 4, 6, 8, 10, 15, 20, 25}; //pode fazer com qualquer tipo primitivo
		result = Runner.calculateMean(vectorTwo);
		
		assertEquals(11.0f, result, 0.01);
	}
	
	@Test
	public void textExample() {
		int [] vectorTwo = new int [] {2, 4, 6, 8, 10};
		float result = Runner.calculateMean(vectorTwo);
		assertEquals(6, result, 0.001);
	}
	
	@Test
	public void textOddArray() {
		int [] resultOne = Runner.generateOddArray(1);
		assertEquals(1, resultOne.length); //afirma que o comprimento do array é 1
		assertEquals(1, resultOne[0]);//afirma que o valor da posição zero é 1
		
		int [] resultTwo = Runner.generateOddArray(2);
		assertEquals(2, resultTwo.length);//afirma que o comprimento do array é 2
		assertEquals(1, resultTwo[0]);//afirma que o valor da posição zero é 1
		assertEquals(3, resultTwo[1]);//afirma que o valor da posição um é 3
		
		int [] resultFive = Runner.generateOddArray(5);
		int [] checkFive = new int [] {1,3,5,7,9};
		
		assertEquals(5, resultFive.length);//afirma que o vetor tem 5 elementos
		assertArrayEquals(checkFive, resultFive);
	}
	
	@Test
	public void testOdd() {
		//exercício: testar com os valores: 0, 1, 2, 3, 4, 10, 11, 100 e 111
		
		assertEquals(false, Runner.isOdd(0));
		assertFalse(Runner.isOdd(0));
		
		assertTrue(Runner.isOdd(1));
		assertFalse(Runner.isOdd(2));
		assertTrue(Runner.isOdd(3));
		assertFalse(Runner.isOdd(4));
		assertFalse(Runner.isOdd(10));
		assertTrue(Runner.isOdd(11));
		assertFalse(Runner.isOdd(100));
		assertTrue(Runner.isOdd(111));
	}

}
