package atividade5;

public class Celular {
    String marca;
    String modelo;
    int bateria; // porcentagem
    boolean ligado;

    void ligar() {
        ligado = true;
        System.out.println(marca + " " + modelo + " ligado.");
    }

    void exibirInformacoes() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Bateria: " + bateria + "% | Ligado: " + (ligado ? "Sim" : "Não"));
    }

    void carregarBateria() {
        System.out.println("Carregando " + modelo + "...");
        while (bateria < 100) {
            bateria += 10;
            if (bateria > 100) {
                bateria = 100;
            }
            System.out.println("Bateria: " + bateria + "%");
        }
        System.out.println("Bateria completa!");
    }
}
