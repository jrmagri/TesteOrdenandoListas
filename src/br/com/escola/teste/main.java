package br.com.escola.teste;

import br.com.escola.modelos.Aluno;
import br.com.escola.modelos.Pessoa;
import br.com.escola.modelos.Professor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Aluno a = new Aluno("Juninho", 19, "48.802.999-5", 'M');
        Aluno a1 = new Aluno("Julia", 16, "48.802.999-5", 'F');
        Aluno a2 = new Aluno("Bruna", 15, "58.866.876-9", 'F');
        Aluno a3 = new Aluno("Jorge", 25, "23.765.542-2", 'M');
        Aluno a4 = new Aluno("Paula", 19, "34.862.876-9", 'F');
        Aluno a5 = new Aluno("Pedro", 13, "54.654.989-8", 'M');
        Aluno a6 = new Aluno("Julio", 19, "21.765.249-8", 'M');

        Professor p = new Professor("Paulao", 35, "34.802.943-4", 'M');
        Professor p1 = new Professor("Fabiana", 40, "34.802.943-4", 'F');
        Professor p2 = new Professor("Andrea", 45, "34.802.943-4", 'F');
        Professor p3 = new Professor("Wilson", 50, "34.802.943-4", 'M');
        Professor p4 = new Professor("Juliana", 32, "34.802.943-4", 'F');
        Professor p5 = new Professor("Pascoal", 31, "34.802.943-4", 'M');
        Professor p6 = new Professor("Robert", 37, "34.802.943-4", 'M');

        List<Pessoa> listaPessoas = new ArrayList<>();
        listaPessoas.add(a);
        listaPessoas.add(a1);
        listaPessoas.add(a2);
        listaPessoas.add(a3);
        listaPessoas.add(a4);
        listaPessoas.add(a5);
        listaPessoas.add(a6);
        listaPessoas.add(p);
        listaPessoas.add(p1);
        listaPessoas.add(p2);
        listaPessoas.add(p3);
        listaPessoas.add(p4);
        listaPessoas.add(p5);
        listaPessoas.add(p6);

        List<Pessoa> pessoasMaiores = new ArrayList<>();

        System.out.println("Lista completa ");
        for (Pessoa pessoas : listaPessoas
                ) {
            System.out.println(pessoas);
        }

        System.out.println("---------------------");

        Collections.sort(listaPessoas);
        System.out.println("Lista ordenada por idade: ");
        for (Pessoa pessoas: listaPessoas
             ) {
            if(pessoas.getIdade() > 18){
                pessoasMaiores.add(pessoas);
            }
            System.out.println(pessoas);
        }

        System.out.println("----------------Maiores de idade ----------------------");
        System.out.println(pessoasMaiores);





    }
}
