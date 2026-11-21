package atividade2.exercicio9;

public class Main {

    public static void main(String[] args) {

        Televisao tv = new Televisao("Samsung", 10);

        Computador pc = new Computador("Dell", "Windows 11");

        System.out.println("=== TELEVISÃO ===");

        tv.ligar();
        tv.exibirEstado();
        tv.desligar();

        System.out.println();

        System.out.println("=== COMPUTADOR ===");

        pc.ligar();
        pc.exibirEstado();
        pc.desligar();
    }
}