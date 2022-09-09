package br.com.escola.teste;

import br.com.escola.modelos.Aluno;
import br.com.escola.modelos.Pessoa;
import br.com.escola.modelos.Professor;

import javax.swing.text.StyledEditorKit;
import java.util.*;

public class teste {
    public static void main(String[] args) {

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

        Set<Pessoa> lista = new LinkedHashSet<>(); //linkedHashSet segue a ordem de add.
        lista.add(a6);
        lista.add(a3);
        lista.add(a4);
        lista.add(a1);
        lista.add(a2);
        lista.add(a5);
        lista.add(a7);

        for (Pessoa pessoas : lista) {
            System.out.println(pessoas);
        }

        //lista.forEach(pessoa -> System.out.println(pessoa));

        Map<String, Pessoa> numeroRgAlunos = new HashMap<>();
        numeroRgAlunos.put("48.802.999-5", a);
        numeroRgAlunos.put("48.854.999-5", a1);
        numeroRgAlunos.put("58.866.876-9", a2);
        numeroRgAlunos.put("23.765.542-2", a3);
        numeroRgAlunos.put("34.862.876-9", a4);

        System.out.println("Quem é o aluno do RG: 48.802.999-5? ");
        System.out.println(numeroRgAlunos.get(a.getRg()));

    }
}
