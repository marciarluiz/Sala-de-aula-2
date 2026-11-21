package atividade1;

public class Televisao {

    // Atributos
    String marca;
    int volume;
    int canal;

    // Método para aumentar o volume
    void aumentarVolume() {
        if (volume < 100) {
            volume++;
        } else {
            System.out.println("Volume máximo atingido!");
        }
    }

    // Método para diminuir o volume
    void diminuirVolume() {
        if (volume > 0) {
            volume--;
        } else {
            System.out.println("Volume mínimo atingido!");
        }
    }

    // Método para mudar de canal
    void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    // Método para exibir informações
    void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Volume: " + volume);
        System.out.println("Canal: " + canal);
    }

    public static void main(String[] args) {

        // Criando objeto
        Televisao tv = new Televisao();

        // Valores iniciais
        tv.marca = "Samsung";
        tv.volume = 50;
        tv.canal = 10;

        // Aumentando volume
        tv.aumentarVolume();
        tv.aumentarVolume();

        // Diminuindo volume
        tv.diminuirVolume();

        // Mudando canal
        tv.mudarCanal(25);

        // Exibindo informações atualizadas
        tv.exibirInformacoes();
    }
}

