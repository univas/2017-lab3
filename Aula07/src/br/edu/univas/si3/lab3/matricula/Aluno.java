package br.edu.univas.si3.lab3.matricula;

import java.util.ArrayList;

public class Aluno {

	private String nome;
	private int matricula;
	private ArrayList<Matricula> matriculas = new ArrayList<Matricula>();
	
	public Aluno(int mat, String nome) {
		this.matricula = mat;
		this.nome = nome;
	}
	
	public boolean estaAprovado(Disciplina d) {
		return false;//TODO: implementar
	}
	
	public void matricular(Disciplina d) {
		//TODO: implementar
	}
	
	public int getCargaHoraria() {
		return 0;//TODO: implementar
	}
	
}
