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

    // Método para dividir (com o desafio de tratar a divisão por zero)
    double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: Não é possível realizar divisão por zero!");
            return 0; // Retorna 0 para evitar erro fatal no programa
        } else {
            return a / b;
        }
    }
}

