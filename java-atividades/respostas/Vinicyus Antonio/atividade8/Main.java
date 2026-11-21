package atividade8;

public class Main {
    public static void main(String[] args) {
        Lampada l1 = new Lampada();
        l1.cor = "Branca";
        l1.potencia = 12;
        l1.ligar();

        Lampada l2 = new Lampada();
        l2.cor = "Amarela";
        l2.potencia = 9;
        l2.desligar();

        l1.mostrarEstado();
        l2.mostrarEstado();
    }
}
