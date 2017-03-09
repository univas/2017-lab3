package br.edu.univas.si3.lab3.aula5;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculator {

	@Test
	public void testSum() {
		Calculator calc = new Calculator();
		assertEquals(5, calc.sum(2, 3));
		assertEquals(9, calc.sum(4, 5));
	}
	
	@Test
	public void testCalcPlus() {
		CalculatorPlus calc = new CalculatorPlus();
		
		assertEquals(0, calc.result, 0.01);
		
		calc.sum(4);
		assertEquals(4, calc.result, 0.01);
		
		calc.subtract(1);
		assertEquals(3, calc.result, 0.01);
		
		calc.multiply(4);
		assertEquals(12, calc.result, 0.01);
		
		calc.divide(6);
		assertEquals(2, calc.result, 0.01);
		
		calc.clear();
		assertEquals(0, calc.result, 0.01);
		
		CalculatorPlus otherCalc = new CalculatorPlus();

		otherCalc.sum(50);
		otherCalc.multiply(20);
		assertEquals(1000, calc.result, 0.01);
	}

}
