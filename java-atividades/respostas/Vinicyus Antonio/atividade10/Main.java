package atividade10;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("10 + 5 = " + calc.somar(10, 5));
        System.out.println("10 - 5 = " + calc.subtrair(10, 5));
        System.out.println("10 * 5 = " + calc.multiplicar(10, 5));
        System.out.println("10 / 5 = " + calc.dividir(10, 5));
        System.out.println("10 / 0 = " + calc.dividir(10, 0));
    }
}
