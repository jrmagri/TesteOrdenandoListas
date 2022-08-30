package br.com.escola.modelos;

public class Professor extends Pessoa{
    public Professor(String nome, int idade, String rg, char sexo ) {
        super(nome, idade, rg, sexo);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int compareTo(Pessoa outraIdade) {
        return (this.idade - outraIdade.getIdade());

    }
}
