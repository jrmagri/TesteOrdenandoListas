package br.com.escola.modelos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Escola {
    private String nome;
    private Set<Pessoa> alunos = new HashSet<>();
    private Map<Integer, Aluno> numeroMatricula = new HashMap<>();

    public Escola(String nome){
        this.nome = nome;
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.numeroMatricula.put(aluno.getNumeroMatricula(), aluno);
    }

    public String getNome() {
        return nome;
    }

    public Set<Pessoa> getAlunos() {
        return alunos;
    }

    public Aluno buscaMatricula(int numero){
        return numeroMatricula.get(numero);
    }

    @Override
    public String toString() {
        return "Escola: " +
                ", Nome: " + nome + '\'' +
                ", alunos: " + alunos +
                ", numeroMatricula: " + numeroMatricula;
    }
}
