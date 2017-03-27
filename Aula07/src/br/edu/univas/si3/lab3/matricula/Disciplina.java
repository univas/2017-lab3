package br.edu.univas.si3.lab3.matricula;

import java.util.ArrayList;

public class Disciplina {

	private String sigla;
	private int cargaHoraria;
	private ArrayList<Matricula> inscritos = new ArrayList<Matricula>();
	
	public Disciplina(String sigla, int ch) {
		this.sigla = sigla;
		this.cargaHoraria = ch;
	}
	
	public void adicionarInscrito(Matricula m){
		//TODO: implementar
	}
	
	public ArrayList<Aluno> listarAprovados() {
		return null;//TODO: implementar
	}
	
	public int getQuantidadeDeMatriculados() {
		return 0;//TODO: implementar
	}
	
	public float calcularMedia() {
		return 0f;//TODO: implementar
	}
}
