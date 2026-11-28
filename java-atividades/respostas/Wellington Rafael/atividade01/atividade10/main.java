package atividade10;

public class main {
    public static void main (String [] args) {
        calculadora calc = new calculadora();
        double a = 25;
        double b = 16; 

        System.out.println(a + " + " + b + " = " + calc.somar(a, b));
        System.out.println(a + " - " + b + " = " + calc.subtrair(a, b));
        System.out.println(a + " * " + b + " = " + calc.multiplicar(a, b));
        System.out.println(a + " / " + b + " = " + calc.dividir(a, b));

        System.out.println();
        System.out.println("Testando divisão por zero:");
        double resultado = calc.dividir(a, 0);
        if (!Double.isNaN(resultado)) {
            System.out.println("Resultado: " + resultado);
        }
    }
}
