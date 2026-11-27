public class Aluno {

    // Atributos
    String nome;
    double nota1;
    double nota2;

    // Método para calcular a média
    double calcularMedia() {
        return (nota1 + nota2) / 2.0;
    }

    // Método para exibir o resultado e a situação do aluno
    void exibirResultado() {
        double media = calcularMedia();
        
        // Regra: aprovado se média >= 7.0, senão reprovado
        String situacao;
        if (media >= 7.0) {
            situacao = "Aprovado";
        } else {
            situacao = "Reprovado";
        }

        System.out.println("Aluno: " + nome + " | Média: " + media + " | Situação: " + situacao);
    }
}

