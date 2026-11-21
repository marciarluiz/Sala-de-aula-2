package atividade13;

public class ArCondicionado {
    String marca;
    int temperatura;
    boolean ligado;

    void ligar() {
        ligado = true;
        System.out.println("Ar-condicionado " + marca + " ligado.");
    }

    void desligar() {
        ligado = false;
        System.out.println("Ar-condicionado " + marca + " desligado.");
    }

    void aumentarTemperatura() {
        if (!ligado) {
            System.out.println("Ligue o aparelho primeiro.");
        } else if (temperatura < 30) {
            temperatura++;
            System.out.println("Temperatura: " + temperatura + " °C");
        } else {
            System.out.println("Temperatura máxima (30 °C) atingida.");
        }
    }

    void diminuirTemperatura() {
        if (!ligado) {
            System.out.println("Ligue o aparelho primeiro.");
        } else if (temperatura > 16) {
            temperatura--;
            System.out.println("Temperatura: " + temperatura + " °C");
        } else {
            System.out.println("Temperatura mínima (16 °C) atingida.");
        }
    }
}
