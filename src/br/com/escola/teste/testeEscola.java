package br.com.escola.teste;

import br.com.escola.modelos.*;

import java.io.InterruptedIOException;

public class testeEscola {
    public static void main(String[] args) {
        Escola Diocesano = new Diocesano("Diocesano La salle");
        Escola Militao = new Militao("Militao Antonio de Lima");
        Escola Juliano = new JulianoNeto("Juliano Neto");

        Aluno a = new Aluno("Juninho", 18, "48.802.999-5", 'M', 1001);
        Aluno a1 = new Aluno("Julia", 16, "48.854.999-5", 'F', 3402);
        Aluno a2 = new Aluno("Bruna", 15, "58.866.876-9", 'F', 2303);
        Aluno a3 = new Aluno("Jorge", 21, "23.765.542-2", 'M', 1004);
        Aluno a4 = new Aluno("Paula", 19, "34.862.876-9", 'F', 2345);
        Aluno a5 = new Aluno("Pedro", 16, "54.654.989-8", 'M', 2126);
        Aluno a6 = new Aluno("Julio", 19, "21.765.249-8", 'M', 2347);
        Aluno a7 = new Aluno("Julio", 19, "21.765.249-8", 'M', 5678);
        Aluno a8 = new Aluno("Priscila", 11, "32.367.876-1", 'F', 4589);
        Aluno a9 = new Aluno("Bianca", 12, "32.654.786-7", 'F', 3245);
        Aluno a10 = new Aluno("Judivan", 12, "23.715.549-3", 'M', 5764);
        Aluno a11 = new Aluno("Julio", 19, "22.715.229-3", 'M', 7642);

        Diocesano.matricula(a);
        Diocesano.matricula(a1);
        Diocesano.matricula(a2);
        Diocesano.matricula(a3);
        Diocesano.matricula(a4);
        Diocesano.matricula(a5);
        Diocesano.matricula(a6);
        Diocesano.matricula(a7);
        Militao.matricula(a8);
        Militao.matricula(a9);
        Militao.matricula(a10);
        Militao.matricula(a11);

        //System.out.println(Diocesano.getAlunos());
        System.out.println("Alunos da Escola DIOCESANO LA SALLE: ");
        System.out.println("----------------------------------");
        Diocesano.getAlunos().forEach(alunos -> System.out.println(alunos));
        System.out.println("----------------------------------");

        System.out.println("Alunos da Escola Militao Antonio de Lima: ");
        System.out.println("----------------------------------");
        Militao.getAlunos().forEach(alunos -> System.out.println(alunos));

        System.out.println("Quem é o aluno de matricula 2126? ");
        Aluno aluno = Diocesano.buscaMatricula(2126);
        System.out.println("Escola: "+ Diocesano.getNome()+ aluno);

    }
}
