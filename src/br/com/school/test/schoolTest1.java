package br.com.school.test;

import br.com.school.models.*;

public class schoolTest1 {
    public static void main(String[] args) {
        School diocesano = new Diocesano("diocesano La salle");
        School militao = new Militao("militao Antonio de Lima");
        School juliano = new JulianoNeto("juliano Neto");

        Student a = new Student("Juninho", 18, "48.802.999-5", 'M', 1001);
        Student a1 = new Student("Julia", 16, "48.854.999-5", 'F', 3402);
        Student a2 = new Student("Bruna", 15, "58.866.876-9", 'F', 2303);
        Student a3 = new Student("Jorge", 21, "23.765.542-2", 'M', 1004);
        Student a4 = new Student("Paula", 19, "34.862.876-9", 'F', 2345);
        Student a5 = new Student("Pedro", 16, "54.654.989-8", 'M', 2126);
        Student a6 = new Student("Julio", 19, "21.765.249-8", 'M', 2347);
        Student a7 = new Student("Julio", 19, "21.765.249-8", 'M', 5678);
        Student a8 = new Student("Priscila", 11, "32.367.876-1", 'F', 4589);
        Student a9 = new Student("Bianca", 12, "32.654.786-7", 'F', 3245);
        Student a10 = new Student("Judivan", 12, "23.715.549-3", 'M', 5764);
        Student a11 = new Student("Julio", 19, "22.715.229-3", 'M', 7642);

        diocesano.registration(a);
        diocesano.registration(a1);
        diocesano.registration(a2);
        diocesano.registration(a3);
        diocesano.registration(a4);
        diocesano.registration(a5);
        diocesano.registration(a6);
        diocesano.registration(a7);
        militao.registration(a8);
        militao.registration(a9);
        militao.registration(a10);
        militao.registration(a11);

        //System.out.println(diocesano.getStudents());
        System.out.println("Alunos da Escola DIOCESANO LA SALLE: ");
        System.out.println("----------------------------------");
        diocesano.getStudents().forEach(students -> System.out.println(students));
        System.out.println("----------------------------------");

        System.out.println("Alunos da Escola militao Antonio de Lima: ");
        System.out.println("----------------------------------");
        militao.getStudents().forEach(students -> System.out.println(students));

        System.out.println("Quem é o aluno de matricula 2126? ");
        Student student = diocesano.searchForRegistration(2126);
        System.out.println("Escola: " + diocesano.getName() + student);
    }
}
