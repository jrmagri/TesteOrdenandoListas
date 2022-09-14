package br.com.school.models;

public class Teacher extends Person {
    public Teacher(String name, int age, String document, char genre) {
        super(name, age, document, genre);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int compareTo(Person outraIdade) {
        return (this.age - outraIdade.getAge());

    }
}
