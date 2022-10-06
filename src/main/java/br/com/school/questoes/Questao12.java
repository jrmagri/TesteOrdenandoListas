package br.com.school.questoes;

public class Questao12 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = false;

        boolean primeiroPt1 = a && b;
        boolean primeiroPt2 = a ^ b;
        boolean primeiroPtFinal = primeiroPt1 || primeiroPt2;

        System.out.println(primeiroPtFinal);

        boolean segPt1 = a || b;
        boolean segPt2 = a && c;
        boolean segPtFinal = segPt1 && segPt2;
        System.out.println(segPtFinal);

        boolean terceiroPt1 = a || c;
        boolean terceiroPt2 = b ^ a;
        boolean terceiroPt3 = !b;
        boolean terceiroPtFinal = terceiroPt1 && terceiroPt2 && terceiroPt3;
        System.out.println(terceiroPtFinal);
    }
}
