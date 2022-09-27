package br.com.alura;

public class TesteBuscaAlunosNoCurso {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 25));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 22));
		
		Aluno a1 = new Aluno("Madonna", 160858);
		Aluno a2 = new Aluno("Beyonce", 161854);
		Aluno a3 = new Aluno("Cher", 221313);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("quem eh o aluno com matricula 161854?");
		Aluno aluno = javaColecoes.buscaMatriculado(161854);
		System.out.println("aluno: " + aluno);
	}
}
