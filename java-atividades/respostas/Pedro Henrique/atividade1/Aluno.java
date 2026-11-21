package atividade1;

public class Aluno {

    // Atributos
    String nome;
    double nota1;
    double nota2;

    // Método para calcular a média
    double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    // Método para exibir o resultado
    void exibirResultado() {

        double media = calcularMedia();

        System.out.println("Nome: " + nome);
        System.out.println("Média: " + media);

        if (media >= 7.0) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }

        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        // Primeiro aluno
        Aluno aluno1 = new Aluno();

        aluno1.nome = "João";
        aluno1.nota1 = 8.0;
        aluno1.nota2 = 9.0;

        // Segundo aluno
        Aluno aluno2 = new Aluno();

        aluno2.nome = "Maria";
        aluno2.nota1 = 5.0;
        aluno2.nota2 = 6.0;

        // Exibindo resultados
        aluno1.exibirResultado();
        aluno2.exibirResultado();
    }
}
