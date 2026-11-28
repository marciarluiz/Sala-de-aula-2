package atividade07;

public class notas {
    String nome;
    double nota1;
    double nota2;

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }
    
    public void exibirResultado(){
        double media = calcularMedia();
        String resultado = media >= 6 ? "Aprovado" : "Reprovado";
        System.out.printf("Aluno:  %s - Média: %.2f - Resultado: %s%n", nome, media, resultado);
    }
}
