package br.com.escola.modelos;

public class Aluno extends Pessoa {
    private int numeroMatricula;

    public Aluno(String nome, int idade, String rg, char sexo, int numeroMatricula) {
        super(nome, idade, rg, sexo);
        setNumeroMatricula(numeroMatricula);
    }

    public void setNumeroMatricula(int numeroMatricula) {
        if(numeroMatricula <=0){
            throw new numeroMatriculaException("O numero de matricula não pode ser 0, ou menor que 0!!! ");
        }
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
