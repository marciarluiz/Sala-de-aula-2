package atividade2.exercicio10;

public class Main {

    public static void main(String[] args) {

        Onibus onibus1 = new Onibus("Mercedes", 40, 5.50);
        Onibus onibus2 = new Onibus("Volvo", 50, 6.00);

        Bicicleta bicicleta1 = new Bicicleta("Caloi", 1, "Mountain Bike");
        Bicicleta bicicleta2 = new Bicicleta("Oggi", 1, "Urbana");

        System.out.println("=== ÔNIBUS 1 ===");
        onibus1.exibirInformacoes();
        onibus1.mover();

        System.out.println();

        System.out.println("=== ÔNIBUS 2 ===");
        onibus2.exibirInformacoes();
        onibus2.mover();

        System.out.println();

        System.out.println("=== BICICLETA 1 ===");
        bicicleta1.exibirInformacoes();
        bicicleta1.mover();

        System.out.println();

        System.out.println("=== BICICLETA 2 ===");
        bicicleta2.exibirInformacoes();
        bicicleta2.mover();
    }
}