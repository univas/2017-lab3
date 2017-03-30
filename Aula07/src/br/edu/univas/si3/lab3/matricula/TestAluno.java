package br.edu.univas.si3.lab3.matricula;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAluno {

	@Test
	public void testCargaHorariaAluno() {
		Aluno a2 = new Aluno(2, "aluno 2");
		Disciplina d1 = new Disciplina("d1", 2);
		Disciplina d2 = new Disciplina("d2", 4);
		
		a2.matricular(d1);
		assertEquals(2, a2.getCargaHoraria());

		a2.matricular(d2);
		assertEquals(6, a2.getCargaHoraria());
	}

}
