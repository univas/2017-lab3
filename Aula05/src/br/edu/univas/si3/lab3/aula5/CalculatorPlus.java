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
	
	boolean divide(int value) {
		if(value == 0) {
			return false;
		}
		result /= value;
		return true;
	}
}