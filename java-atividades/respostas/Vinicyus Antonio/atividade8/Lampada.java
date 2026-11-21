package atividade8;

public class Lampada {
    String cor;
    int potencia;
    boolean ligada;

    void ligar() {
        ligada = true;
    }

    void desligar() {
        ligada = false;
    }

    void mostrarEstado() {
        System.out.println("Lâmpada " + cor + " de " + potencia + "W está " + (ligada ? "LIGADA" : "DESLIGADA"));
    }
}
