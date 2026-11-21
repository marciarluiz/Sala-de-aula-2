package atividade11;

public class Televisao {
    String marca;
    int volume;
    int canal;

    void aumentarVolume() {
        if (volume < 100) {
            volume++;
        } else {
            System.out.println("Volume já está no máximo (100).");
        }
    }

    void diminuirVolume() {
        if (volume > 0) {
            volume--;
        } else {
            System.out.println("Volume já está no mínimo (0).");
        }
    }

    void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Canal alterado para " + canal);
    }

    void exibirInformacoes() {
        System.out.println("TV " + marca + " | Volume: " + volume + " | Canal: " + canal);
    }
}
