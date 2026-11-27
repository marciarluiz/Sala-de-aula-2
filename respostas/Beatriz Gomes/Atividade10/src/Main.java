public class Main {
    
    public static void main(String[] args) {
        // Criando o objeto da classe Calculadora
        Calculadora calc = new Calculadora();

        // Realizando as operações básicas
        double resultadoSoma = calc.somar(15.0, 5.0);
        double resultadoSubtracao = calc.subtrair(20.0, 8.0);
        double resultadoMultiplicacao = calc.multiplicar(4.0, 5.0);
        double resultadoDivisao = calc.dividir(20.0, 4.0);

        // Exibindo os resultados no terminal
        System.out.println("--- Operações da Calculadora ---");
        System.out.println("Soma (15 + 5): " + resultadoSoma);
        System.out.println("Subtração (20 - 8): " + resultadoSubtracao);
        System.out.println("Multiplicação (4 * 5): " + resultadoMultiplicacao);
        System.out.println("Divisão (20 / 4): " + resultadoDivisao);

        System.out.println("\n--- Testando o Desafio (Divisão por Zero) ---");
        // Tentando dividir por zero para acionar a segurança do método
        calc.dividir(10.0, 0.0);
    }
}

