package br.com.school.teste;

import br.com.school.models.Diocesano;
import br.com.school.models.School;
import org.junit.Test;

public class SchoolTest {
    @Test
    public void instanciarEscolas(){
        School diocesano = new Diocesano("diocesano");
    }
}
