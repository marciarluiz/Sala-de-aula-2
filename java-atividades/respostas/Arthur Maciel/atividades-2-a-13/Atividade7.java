class AlunoNota {
    String nome;
    double nota1;
    double nota2;

    double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    void exibirResultado() {
        double media = calcularMedia();
        String situacao = media >= 7.0 ? "Aprovado" : "Reprovado";
        System.out.println("Aluno: " + nome + " | Media: " + media + " | Situacao: " + situacao);
    }
}

public class Atividade7 {
    public static void main(String[] args) {
        AlunoNota a1 = new AlunoNota();
        a1.nome = "Arthur";
        a1.nota1 = 8.0;
        a1.nota2 = 7.5;

        AlunoNota a2 = new AlunoNota();
        a2.nome = "Pedro";
        a2.nota1 = 5.0;
        a2.nota2 = 6.0;

        a1.exibirResultado();
        a2.exibirResultado();
    }
}