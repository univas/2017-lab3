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
		inscritos.add(m);
	}
	
	public ArrayList<Aluno> listarAprovados() {
		ArrayList<Aluno> aprovados = new ArrayList<Aluno>();
		
		for(Matricula mat : inscritos) {
			if(mat.calcularMedia() >= 60f) {
				Aluno aluno = mat.getAluno();
				aprovados.add(aluno);
			}
		}
		return aprovados;
	}
	
	public int getQuantidadeDeMatriculados() {
		return inscritos.size();
	}
	
	public float calcularMedia() {
		float soma = 0f;
		for(int i = 0; i < inscritos.size(); i++) {
			Matricula mat = inscritos.get(i);
			soma += mat.calcularMedia();
		}
		return soma / inscritos.size();
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
}
