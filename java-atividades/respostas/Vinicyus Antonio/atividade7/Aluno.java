package atividade7;

public class Aluno {
    String nome;
    double nota1;
    double nota2;

    double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    void exibirResultado() {
        double media = calcularMedia();
        String situacao = media >= 7.0 ? "Aprovado" : "Reprovado";
        System.out.printf("Aluno: %s | Média: %.1f | Situação: %s%n", nome, media, situacao);
    }
}
