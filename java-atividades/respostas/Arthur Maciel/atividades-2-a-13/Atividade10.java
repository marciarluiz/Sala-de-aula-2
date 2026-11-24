class Calculadora {
    double somar(double a, double b) {
        return a + b;
    }

    double subtrair(double a, double b) {
        return a - b;
    }

    double multiplicar(double a, double b) {
        return a * b;
    }

    double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: divisao por zero nao permitida.");
            return 0;
        }
        return a / b;
    }
}

public class Atividade10 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Soma: " + calc.somar(10, 5));
        System.out.println("Subtracao: " + calc.subtrair(10, 5));
        System.out.println("Multiplicacao: " + calc.multiplicar(10, 5));
        System.out.println("Divisao: " + calc.dividir(10, 2));
        System.out.println("Divisao por zero: " + calc.dividir(10, 0));
    }
}