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
		for(Matricula mat : matriculas) {
			Disciplina disc = mat.getDisciplina();
			if(disc == d) {//verifica se é a mesma referência dos objetos
				
				if(mat.calcularMedia() >= 60) {
					return true;
				}
			}
		}
		return false;
	}
	
	public void matricular(Disciplina d) {
		Matricula novaMatricula = new Matricula(this, d);
		matriculas.add(novaMatricula);
	}
	
	public int getCargaHoraria() {
		int soma = 0;
		for(int i = 0; i < matriculas.size(); i++) {
			Matricula mat = matriculas.get(i);
			Disciplina disc = mat.getDisciplina();
			soma += disc.getCargaHoraria();
		}
		return soma;
	}
	
}
