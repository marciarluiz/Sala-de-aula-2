package atividade1;

public class Celular {

    // Atributos
    String marca;
    String modelo;
    int bateria;

    // Método para ligar
    void ligar() {
        if (bateria > 0) {
            System.out.println(modelo + " está ligado!");
        } else {
            System.out.println(modelo + " está sem bateria!");
        }
    }

    // Método para exibir informações
    void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Bateria: " + bateria + "%");
        System.out.println("----------------------");
    }

    // Método para carregar bateria
    void carregarBateria() {
        bateria = 100;
        System.out.println(modelo + " foi carregado!");
    }

    public static void main(String[] args) {

        // Primeiro celular
        Celular celular1 = new Celular();

        celular1.marca = "Samsung";
        celular1.modelo = "Galaxy S24";
        celular1.bateria = 30;

        // Segundo celular
        Celular celular2 = new Celular();

        celular2.marca = "Apple";
        celular2.modelo = "iPhone 15";
        celular2.bateria = 50;

        // Exibindo informações iniciais
        celular1.exibirInformacoes();
        celular2.exibirInformacoes();

        // Ligando os celulares
        celular1.ligar();
        celular2.ligar();

        // Carregando as baterias
        celular1.carregarBateria();
        celular2.carregarBateria();

        // Exibindo informações atualizadas
        celular1.exibirInformacoes();
        celular2.exibirInformacoes();
    }
}
