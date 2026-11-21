package atividade1;

public class Lampada {

    // Atributos
    String cor;
    int potencia;
    boolean ligada;

    // Método para ligar
    void ligar() {
        ligada = true;
    }

    // Método para desligar
    void desligar() {
        ligada = false;
    }

    // Método para mostrar o estado
    void mostrarEstado() {

        System.out.println("Cor: " + cor);
        System.out.println("Potência: " + potencia + "W");

        if (ligada == true) {
            System.out.println("Estado: Ligada");
        } else {
            System.out.println("Estado: Desligada");
        }

        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        // Primeira lâmpada
        Lampada lampada1 = new Lampada();

        lampada1.cor = "Branca";
        lampada1.potencia = 12;
        lampada1.ligada = true;

        // Segunda lâmpada
        Lampada lampada2 = new Lampada();

        lampada2.cor = "Amarela";
        lampada2.potencia = 9;
        lampada2.ligada = false;

        // Exibindo estados
        lampada1.mostrarEstado();
        lampada2.mostrarEstado();

    }
}
