package atividade3;

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.modelo = "Civic";
        c1.marca = "Honda";
        c1.ano = 2020;

        Carro c2 = new Carro();
        c2.modelo = "Onix";
        c2.marca = "Chevrolet";
        c2.ano = 2022;

        c1.exibirInformacoes();
        c1.ligar();
        c1.ligar(); // tentativa de ligar duas vezes
        c1.exibirInformacoes();
        c1.desligar();

        System.out.println();

        c2.exibirInformacoes();
        c2.ligar();
        c2.exibirInformacoes();
        c2.desligar();
        c2.desligar(); // tentativa de desligar duas vezes
    }
}
