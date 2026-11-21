package atividade1;

public class Calculadora {

    // Método para somar
    double somar(double a, double b) {
        return a + b;
    }

    // Método para subtrair
    double subtrair(double a, double b) {
        return a - b;
    }

    // Método para multiplicar
    double multiplicar(double a, double b) {
        return a * b;
    }

    // Método para dividir
    double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Erro: divisão por zero!");
            return 0;
        }
    }

    public static void main(String[] args) {

        // Criando objeto
        Calculadora calculadora = new Calculadora();

        // Realizando operações
        double soma = calculadora.somar(10, 5);

        double subtracao = calculadora.subtrair(10, 5);

        double multiplicacao = calculadora.multiplicar(10, 5);

        double divisao = calculadora.dividir(10, 5);

        // Exibindo resultados
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);

    }
}
