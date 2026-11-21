package atividade5;

public class Main {
    public static void main(String[] args) {
        Celular c1 = new Celular();
        c1.marca = "Samsung";
        c1.modelo = "Galaxy A14";
        c1.bateria = 70;

        Celular c2 = new Celular();
        c2.marca = "Motorola";
        c2.modelo = "Moto G";
        c2.bateria = 40;

        c1.ligar();
        c1.exibirInformacoes();
        c2.ligar();
        c2.exibirInformacoes();

        System.out.println();
        c1.carregarBateria();
        System.out.println();
        c2.carregarBateria();
    }
}
