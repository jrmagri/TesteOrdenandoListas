package br.com.escola.teste;

import br.com.escola.modelos.Aluno;
import br.com.escola.modelos.Pessoa;
import br.com.escola.modelos.Professor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) throws Exception {
        Aluno a = new Aluno("Juninho", 18, "48.802.999-5", 'M', 0001);
        Aluno a1 = new Aluno("Julia", 16, "48.854.999-5", 'F', 3402);
        Aluno a2 = new Aluno("Bruna", 15, "58.866.876-9", 'F', 2303);
        Aluno a3 = new Aluno("Jorge", 21, "23.765.542-2", 'M', 1004);
        Aluno a4 = new Aluno("Paula", 19, "34.862.876-9", 'F', 0345);
        Aluno a5 = new Aluno("Pedro", 13, "54.654.989-8", 'M', 0126);
        Aluno a6 = new Aluno("Julio", 19, "21.765.249-8", 'M', 2347);
        Aluno a7 = new Aluno("Julio", 19, "21.765.249-8", 'M', 5678);

        Professor p = new Professor("Paulao", 35, "34.802.943-4", 'M');
        Professor p1 = new Professor("Fabiana", 40, "34.802.943-4", 'F');
        Professor p2 = new Professor("Andrea", 45, "34.802.943-4", 'F');
        Professor p3 = new Professor("Wilson", 50, "34.802.943-4", 'M');
        Professor p4 = new Professor("Juliana", 32, "34.802.943-4", 'F');
        Professor p5 = new Professor("Pascoal", 31, "34.802.943-4", 'M');
        Professor p6 = new Professor("Robert", 37, "34.802.943-4", 'M');
        Professor p7 = new Professor("Fabiana", 45, "34.802.923-4", 'F');
        System.out.println(p1.equals(p7));

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
        listaPessoas.add( new Aluno("Carlos", 23, "2327837283", 'M', 4574));
        listaPessoas.add( new Professor("Julieta", 58, "232323-49", 'F'));

        List<Pessoa> pessoasMaiores = new ArrayList<>();
        List<Pessoa> pessoasMenores = new ArrayList<>();

        System.out.println("Lista completa ");
        for (int i = 0; i < listaPessoas.size(); i++) {
            System.out.println(listaPessoas.get(i));
        }
        //listaPessoas.forEach(pessoa -> {
            //System.out.println(pessoa);
        //});

        System.out.println("---------------------");

        Collections.sort(listaPessoas);
        System.out.println("Lista ordenada por idade: ");
        listaPessoas.forEach(pessoa -> {
            if(pessoa.getIdade() >= 18){
                pessoasMaiores.add(pessoa);
            }
            if(pessoa.getIdade() <18){
                pessoasMenores.add(pessoa);
            }
            System.out.println(pessoa);
        });







         System.out.println("----------------Lista com maiores de idade ----------------------");
         System.out.println(pessoasMaiores);

        System.out.println("-----------------Lsta com menores de idade --------------------------");
        System.out.println(pessoasMenores);


    }
}
