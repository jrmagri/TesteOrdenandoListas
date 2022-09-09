package br.com.escola.modelos;

public class Aluno extends Pessoa {
    private int numeroMatricula;

    public Aluno(String nome, int idade, String rg, char sexo, int numeroMatricula) {
        super(nome, idade, rg, sexo);
        this.numeroMatricula = numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    @Override
    public String toString() {
        return super.toString() + ", Numero matricula: " + numeroMatricula;
    }

    @Override
    public int compareTo(Pessoa outraIdade) {
        return (this.idade - outraIdade.getIdade());

    }
}
