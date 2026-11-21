package atividade7;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.nome = "Ana";
        a1.nota1 = 8.0;
        a1.nota2 = 7.5;

        Aluno a2 = new Aluno();
        a2.nome = "Bruno";
        a2.nota1 = 5.0;
        a2.nota2 = 6.0;

        a1.exibirResultado();
        a2.exibirResultado();
    }
}
