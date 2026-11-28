package atividade13;

public class ArCondicionado {
    String marca;
    int temperatura;
    boolean ligado;

    public void ligar() {
        if (ligado) {
            System.out.println("O ar-condicionado já está ligado.");
        } else {
            ligado = true;
            System.out.println("Ar-condicionado ligado.");
        }
    }

    public void desligar() {
        if (!ligado) {
            System.out.println("O ar-condicionado já está desligado.");
        } else {
            ligado = false;
            System.out.println("Ar-condicionado desligado.");
        }
    }

    public void aumentarTemperatura() {
        if (!ligado) {
            System.out.println("Ligue o aparelho antes de alterar a temperatura.");
        } else if (temperatura >= 30) {
            System.out.println("Temperatura já está no máximo (30 °C).");
        } else {
            temperatura++;
        }
    }

    public void diminuirTemperatura() {
        if (!ligado) {
            System.out.println("Ligue o aparelho antes de alterar a temperatura.");
        } else if (temperatura <= 16) {
            System.out.println("Temperatura já está no mínimo (16 °C).");
        } else {
            temperatura--;
        }
    }

    public void exibirInformacoes() {
        System.out.println("Ar " + marca + " | " + (ligado ? "Ligado" : "Desligado")
                + " | Temperatura: " + temperatura + " °C");
    }
}
