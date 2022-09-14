package br.com.escola.teste;

import br.com.escola.modelos.Diocesano;
import br.com.escola.modelos.School;
import org.junit.Test;

public class SchoolTest {
    @Test
    public void instanciarEscolas(){
        School diocesano = new Diocesano("diocesano");
    }
}
