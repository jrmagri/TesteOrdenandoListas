package br.com.school.models;

public class negativeAgeException extends RuntimeException{

    public negativeAgeException(String message){
        super(message);
    }

    public negativeAgeException(){

    }
}
