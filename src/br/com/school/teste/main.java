package br.com.school.teste;

import br.com.school.models.Student;
import br.com.school.models.Person;
import br.com.school.models.Teacher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) throws Exception {
        Student a = new Student("Juninho", 18, "48.802.999-5", 'M', 0001);
        Student a1 = new Student("Julia", 16, "48.854.999-5", 'F', 3402);
        Student a2 = new Student("Bruna", 15, "58.866.876-9", 'F', 2303);
        Student a3 = new Student("Jorge", 21, "23.765.542-2", 'M', 1004);
        Student a4 = new Student("Paula", 19, "34.862.876-9", 'F', 0345);
        Student a5 = new Student("Pedro", 13, "54.654.989-8", 'M', 0126);
        Student a6 = new Student("Julio", 19, "21.765.249-8", 'M', 2347);
        Student a7 = new Student("Julio", 19, "21.765.249-8", 'M', 5678);

        Teacher p = new Teacher("Paulao", 35, "34.802.943-4", 'M');
        Teacher p1 = new Teacher("Fabiana", 40, "34.802.943-4", 'F');
        Teacher p2 = new Teacher("Andrea", 45, "34.802.943-4", 'F');
        Teacher p3 = new Teacher("Wilson", 50, "34.802.943-4", 'M');
        Teacher p4 = new Teacher("Juliana", 32, "34.802.943-4", 'F');
        Teacher p5 = new Teacher("Pascoal", 31, "34.802.943-4", 'M');
        Teacher p6 = new Teacher("Robert", 37, "34.802.943-4", 'M');
        Teacher p7 = new Teacher("Fabiana", 45, "34.802.923-4", 'F');
        System.out.println(p1.equals(p7));

        List<Person> listPeople = new ArrayList<>();
        listPeople.add(a);
        listPeople.add(a1);
        listPeople.add(a2);
        listPeople.add(a3);
        listPeople.add(a4);
        listPeople.add(a5);
        listPeople.add(a6);
        listPeople.add(p);
        listPeople.add(p1);
        listPeople.add(p2);
        listPeople.add(p3);
        listPeople.add(p4);
        listPeople.add(p5);
        listPeople.add(p6);
        listPeople.add( new Student("Carlos", 23, "2327837283", 'M', 4574));
        listPeople.add( new Teacher("Julieta", 58, "232323-49", 'F'));

        List<Person> olderPeople = new ArrayList<>();
        List<Person> minorPeople = new ArrayList<>();

        System.out.println("Lista completa ");
        for (int i = 0; i < listPeople.size(); i++) {
            System.out.println(listPeople.get(i));
        }
        //listaPessoas.forEach(people -> {
            //System.out.println(people);
        //});

        System.out.println("---------------------");

        Collections.sort(listPeople);
        System.out.println("Lista ordenada por idade: ");
        listPeople.forEach(people -> {
            if(people.getAge() >= 18){
                olderPeople.add(people);
            }
            if(people.getAge() <18){
                minorPeople.add(people);
            }
            System.out.println(people);
        });







         System.out.println("----------------Lista com maiores de idade ----------------------");
         System.out.println(olderPeople);

        System.out.println("-----------------Lsta com menores de idade --------------------------");
        System.out.println(minorPeople);


    }
}
