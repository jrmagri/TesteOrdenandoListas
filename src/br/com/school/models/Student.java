package br.com.school.models;

public class Student extends Person {
    private int numberRegistration;

    public Student(String name, int age, String document, char genre, int numberRegistration) {
        super(name, age, document, genre);
        setNumberRegistration(numberRegistration);
    }

    public void setNumberRegistration(int numberRegistration) {
        if (numberRegistration <= 0) {
            throw new numberRegistrationException("O numero de matricula não pode ser 0, ou menor que 0!!! ");
        }
        this.numberRegistration = numberRegistration;
    }

    public int getNumberRegistration() {
        return numberRegistration;
    }

    @Override
    public String toString() {
        return super.toString() + ", Numero matricula: " + numberRegistration;
    }

    @Override
    public int compareTo(Person outraIdade) {
        return (this.age - outraIdade.getAge());

    }
}
