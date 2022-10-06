package br.com.school.questoes;

public class Questao11 {
    public static void main(String[] args) {
        int[] eventos = {10, -20, 61, -15};
        int resultado = getBattery(eventos);
        System.out.println(resultado);
    }

    public static int getBattery(int[] eventos) {
        final int bateriaInicial = 50;
        int cargaAtual = bateriaInicial;
        for (int e : eventos) {
            if (cargaAtual + e > 100) {
                cargaAtual = 100;
            } else {
                cargaAtual += e;
            }
        }
        return cargaAtual;
    }
}
