package atividade3;

public class Carro {
    String modelo;
    String marca;
    int ano;
    boolean ligado;

    void ligar() {
        if (ligado) {
            System.out.println(modelo + " já está ligado!");
        } else {
            ligado = true;
            System.out.println(modelo + " foi ligado.");
        }
    }

    void desligar() {
        if (!ligado) {
            System.out.println(modelo + " já está desligado!");
        } else {
            ligado = false;
            System.out.println(modelo + " foi desligado.");
        }
    }

    void exibirInformacoes() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Ano: " + ano + " | Ligado: " + (ligado ? "Sim" : "Não"));
    }
}
