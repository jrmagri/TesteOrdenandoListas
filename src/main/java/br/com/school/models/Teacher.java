package br.com.school.models;

public class Teacher extends Person {
    private int numberContract;
    public Teacher(String name, int age, String document, char genre, int numberContract) {
        super(name, age, document, genre);
        setNumberContract(numberContract);
    }

    public void setNumberContract(int numberContract) {
        this.numberContract = numberContract;
    }
    public int getNumberContract() {
        return numberContract;
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
