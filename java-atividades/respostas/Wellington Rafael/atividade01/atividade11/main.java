package atividade11;

public class main {
    public static void main(String[] args) {
        televisao tv = new televisao();
        tv.marca = "LG";
        tv.volume = 98;
        tv.canal = 5;

        tv.exibirInformacoes();

        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume(); // tenta passar de 100
        tv.mudarCanal(12);
        tv.exibirInformacoes();

        tv.volume = 1;
        tv.diminuirVolume();
        tv.diminuirVolume(); // tenta ficar abaixo de 0
        tv.mudarCanal(0);    // canal inválido
        tv.exibirInformacoes();
    }
}
