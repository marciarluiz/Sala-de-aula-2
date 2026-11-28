package atividade11;

public class televisao {
    String marca;
    int volume;
    int canal;

    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
        } else {
            System.out.println("Volume já está no máximo (100).");
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        } else {
            System.out.println("Volume já está no mínimo (0).");
        }
    }

    public void mudarCanal(int novoCanal) {
        if (novoCanal < 1) {
            System.out.println("Canal inválido.");
        } else {
            canal = novoCanal;
        }
    }

    public void exibirInformacoes() {
        System.out.println("TV " + marca + " | Volume: " + volume + " | Canal: " + canal);
    }
}
