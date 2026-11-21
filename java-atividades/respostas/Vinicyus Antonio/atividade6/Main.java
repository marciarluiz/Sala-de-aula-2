package atividade6;

public class Main {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro();
        c1.nome = "Rex";
        c1.raca = "Pastor Alemão";
        c1.idade = 4;

        Cachorro c2 = new Cachorro();
        c2.nome = "Bolinha";
        c2.raca = "Poodle";
        c2.idade = 2;

        Cachorro c3 = new Cachorro();
        c3.nome = "Thor";
        c3.raca = "Vira-lata";
        c3.idade = 6;

        c1.latir();
        c1.brincar();
        c2.latir();
        c2.brincar();
        c3.latir();
        c3.brincar();

        System.out.println();
        c1.exibirDados();
        c2.exibirDados();
        c3.exibirDados();
    }
}
