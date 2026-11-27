public class Televisao {
    
    String marca;
    int volume;
    int canal;

    public Televisao(String marca, int volume, int canal) {

        this.marca = marca;
        this.volume = volume;
        this.canal = canal;
    }

    public Televisao(Object marca2, int volume2, int canal2) {
        
    }

    void aumentarVolume() {

        if (volume < 100) {
            volume++;
            System.out.println("Volume aumentou para:" + volume);
        } else {
            System.out.println("Atencao: A televisao ja esta no volume maximo (100)!");
        }
    }
    void diminuirVolume() {

        if (volume > 0) {

            volume--;
            System.out.println("Volume diminuiu para:" + volume);
        } else {
            System.out.println("Atencao: A televisao ja esta no mudo/volume minimo (0)!");
        }
    }
    void mudarCanal(int novoCnal) {
        int novoCanal = novoCnal;
        if (novoCanal > 0 ) {
            canal = novoCanal;
            System.out.println("Canal alterado para:" + canal);
        } else {
            System.out.println("Canal invalido! O canal deve ser maior que zero.");
        }
    }
    void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Volume atual: " + volume);
        System.out.println("Canal atual: " + canal);
    }

}
