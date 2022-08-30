package br.com.escola.modelos;

public abstract class Pessoa implements Comparable<Pessoa> {
    protected String nome;
    protected int idade;
    protected String rg;
    protected char sexo;

    public Pessoa(){

    }

    public Pessoa(String nome, int idade, String rg, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.rg = rg;
        this.sexo = sexo;


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return
                "Nome : " + nome +
                        ", Idade : " + idade +
                        ", RG : " + rg +
                        ", Sexo : " + sexo;
    }

    @Override
    public int compareTo(Pessoa outraIdade) {
        return (this.idade - outraIdade.getIdade());
    }
}
