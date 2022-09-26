package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TesteAlunoSemAcento {
	public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();
        
        //1) adicione alguns alunos
        alunos.add("Madonna");
        alunos.add("Cher");
        alunos.add("Rihanna");
        
        //2) imprima o tamanho da colecao
        System.out.println(alunos.size());
        
        //3) tente adicionar um aluno que existe
        alunos.add("Madonna");
        
        boolean madonnaJaExiste = alunos.contains("Madonna");
        System.out.println("Madonna ja foi adicionada? " +  madonnaJaExiste);
        
        //4) imprima novamente o tamanho da colecao
        System.out.println(alunos.size());

    }
}
