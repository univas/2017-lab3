package br.edu.univas.si3.lab3.matricula;

public class Matricula {

	private int [] notas = new int [5];
	private int qtdNotas;
	private Disciplina disciplina;
	private Aluno aluno;
	
	public Matricula(Aluno aluno, Disciplina disciplina) {
		this.aluno = aluno;
		this.disciplina = disciplina;
		
		disciplina.adicionarInscrito(this);
	}
	
	public void inserirNota(int nota) {
		notas[qtdNotas++] = nota;
	}
	
	public float calcularMedia() {
		int soma = 0;
		for(int i = 0; i < qtdNotas; i++) {
			soma += notas[i];
		}
		return soma / qtdNotas;
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}
}
