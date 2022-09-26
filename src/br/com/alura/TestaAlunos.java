package br.com.alura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {
	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		alunos.add("Madonna");
		alunos.add("Beyonce");
		alunos.add("Gaga");
		alunos.add("Kylie");
		alunos.add("Hayley");
		alunos.add("Robin");
		
		
		boolean rihannaEstaAi = alunos.contains("Rihanna");
		System.out.println(rihannaEstaAi);
		
		System.out.println(alunos);
		
		for (String aluno : alunos) { 
			System.out.println(aluno);
		}
		
		alunos.forEach(aluno -> {
			System.out.println("nome: " + aluno);
		});
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
		System.out.println(alunosEmLista.get(3));
		
	}
}
