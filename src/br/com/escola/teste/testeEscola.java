package br.com.escola.teste;

import br.com.escola.modelos.Aluno;
import br.com.escola.modelos.Escola;
import br.com.escola.modelos.Professor;

import java.io.InterruptedIOException;

public class testeEscola {
    public static void main(String[] args) {
        Escola Diocesano = new Escola("Diocesano La salle");

        Aluno a = new Aluno("Juninho", 18, "48.802.999-5", 'M', 1001);
        Aluno a1 = new Aluno("Julia", 16, "48.854.999-5", 'F', 3402);
        Aluno a2 = new Aluno("Bruna", 15, "58.866.876-9", 'F', 2303);
        Aluno a3 = new Aluno("Jorge", 21, "23.765.542-2", 'M', 1004);
        Aluno a4 = new Aluno("Paula", 19, "34.862.876-9", 'F', 2345);
        Aluno a5 = new Aluno("Pedro", 13, "54.654.989-8", 'M', 2126);
        Aluno a6 = new Aluno("Julio", 19, "21.765.249-8", 'M', 2347);
        Aluno a7 = new Aluno("Julio", 19, "21.765.249-8", 'M', 5678);

        Diocesano.matricula(a);
        Diocesano.matricula(a1);
        Diocesano.matricula(a2);
        Diocesano.matricula(a3);
        Diocesano.matricula(a4);
        Diocesano.matricula(a5);
        Diocesano.matricula(a6);
        Diocesano.matricula(a7);

        System.out.println(Diocesano.getAlunos());

        Diocesano.getAlunos().forEach(alunos -> System.out.println(alunos));

        System.out.println("Quem é o aluno de matricula 2126? ");
        Aluno aluno = Diocesano.buscaMatricula(2126);
        System.out.println("Escola: "+ Diocesano.getNome()+ aluno);

    }
}
