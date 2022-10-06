package br.com.school.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentQuestao11 {

    @Test
    public void numeroDeMatriculaNegativoDeveriaLancarException() {
        Student p = new Student("felipe", 18, "21389123892183", 'M', -213923);

    }
}