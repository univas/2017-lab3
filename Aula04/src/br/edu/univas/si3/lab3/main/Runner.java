package br.edu.univas.si3.lab3.main;

public class Runner {

	public static void main(String[] args) {
		int [] vector;
		vector = new int [3];
		vector [0] = 4;
		vector [1] = 7;
		vector [2] = 9;
		
		float result = calculateMean(vector);
		if(result == 6.0f) {
			//deu certo
		} else {
			System.out.print("Deu erro!!!");
		}
		//System.out.println("Resultado: " + result);
		
		int [] vectorTwo = new int [] {2, 4, 6, 8, 10, 15, 20, 25}; //pode fazer com qualquer tipo primitivo
		result = calculateMean(vectorTwo);
		
		if(result == 11.0f) {
			//ok
		} else {
			System.out.println("Deu erro !!!");
		}
		
//		System.out.println("Resultado: " + result);
	}
	
	public static float calculateMean(int [] array) {
		float mean;
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}		
		mean = sum / array.length;
		return mean;
	}
	
	//retorna os n primeiros números ímpares
	public static int[] generateOddArray(int n) { 
		int [] oddNumber = new int[n];
		
		for(int i = 0; i < n; i++) {
			oddNumber[i] = i * 2 + 1;
		}
		return oddNumber;
	}
	
	//exercício: implementar este método
	public static boolean isOdd(int number) {
		return number % 2 == 1;
	}
	
}
