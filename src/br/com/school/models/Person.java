package br.com.school.models;

import java.util.Objects;

public abstract class Person implements Comparable<Person> {
    protected String name;
    protected int age;
    protected String document;
    protected char genre;

    public Person(String name, int age, String document, char genre) {
        this.name = name;
        if (age <= 0) {
            throw new negativeAgeException("Idade não pode ser 0!!!");
        }
        this.age = age;
        this.document = document;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public char getGenre() {
        return genre;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return
                " Nome : " + name +
                        ", Idade : " + age +
                        ", RG : " + document +
                        ", Sexo : " + genre;
    }

    @Override
    public int compareTo(Person outraIdade) {
        return (this.age - outraIdade.getAge());
    }

    @Override
    public boolean equals(Object outraPessoa) {
        Person person = (Person) outraPessoa;
        return this.name == ((Person) outraPessoa).getName();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, document, genre);
    }
}
