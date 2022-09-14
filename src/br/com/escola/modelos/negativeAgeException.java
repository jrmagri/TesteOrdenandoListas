package br.com.escola.modelos;

public class negativeAgeException extends RuntimeException{

    public negativeAgeException(String message){
        super(message);
    }

    public negativeAgeException(){

    }
}
