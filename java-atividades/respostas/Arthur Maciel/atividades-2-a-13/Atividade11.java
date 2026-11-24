class Televisao {
    String marca;
    int volume;
    int canal;

    void aumentarVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    void diminuirVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    void mostrarStatus() {
        System.out.println("TV: " + marca + " | Canal: " + canal + " | Volume: " + volume);
    }
}

public class Atividade11 {
    public static void main(String[] args) {
        Televisao tv = new Televisao();
        tv.marca = "LG";
        tv.volume = 15;
        tv.canal = 5;

        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.diminuirVolume();
        tv.mudarCanal(12);
        tv.mostrarStatus();
    }
}