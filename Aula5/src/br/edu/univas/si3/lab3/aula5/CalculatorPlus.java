package br.edu.univas.si3.lab3.aula5;

public class CalculatorPlus {
	
	//TODO: implementar os testes

	float result;
	
	void clear() {
		result = 0f;
	}
	
	void sum(int value) {
		result += value;
	}
	
	void subtract(int value) {
		result -= value;
	}
	
	void multiply(int value) {
		result *= value;
	}
	
	void divide(int value) {
		result /= value;
	}
}