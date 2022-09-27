package br.com.alura;

public class TestaCursoComAluno {
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
		
		System.out.println("Todos alunos: ");
		
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		
		System.out.println("O aluno esta matriculado? " + javaColecoes.estaMatriculado(a1));
		
		Aluno nome = new Aluno("Madonna", 160858);
		System.out.println("e este aluno esta matriculado? " + javaColecoes.estaMatriculado(nome));
		
		System.out.println("o a1 eh igual Madonna? " + a1.equals(nome));
		
		System.out.println("eh equals? " + (a1.hashCode() == nome.hashCode()));
		
	}
}
