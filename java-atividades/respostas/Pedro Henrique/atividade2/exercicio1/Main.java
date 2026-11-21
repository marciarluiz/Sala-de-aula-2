package atividade2;

public class Main {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Carlos", 5000, 1500);

        Vendedor vendedor = new Vendedor("João", 2000, 800);

        System.out.println("=== GERENTE ===");
        gerente.exibirDados();

        System.out.println();

        System.out.println("=== VENDEDOR ===");
        vendedor.exibirDados();
    }
}