package br.com.escola.modelos;

public class Aluno extends Pessoa{
    public Aluno(String nome, int idade, String rg, char sexo) {
        super(nome, idade, rg, sexo);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int compareTo(Pessoa ref) {
        return (this.idade - ref.getIdade());

    }
}
