package atividade1;

public class Carro {

    // Atributos
    String modelo;
    String marca;
    int ano;
    boolean ligado = false;

    // Método para ligar
    void ligar() {
        if (ligado == false) {
            ligado = true;
            System.out.println(modelo + " foi ligado!");
        } else {
            System.out.println(modelo + " já está ligado!");
        }
    }

    // Método para desligar
    void desligar() {
        if (ligado == true) {
            ligado = false;
            System.out.println(modelo + " foi desligado!");
        } else {
            System.out.println(modelo + " já está desligado!");
        }
    }

    // Método para exibir informações
    void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Ligado: " + ligado);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        // Primeiro carro
        Carro carro1 = new Carro();

        carro1.modelo = "Civic";
        carro1.marca = "Honda";
        carro1.ano = 2022;

        // Segundo carro
        Carro carro2 = new Carro();

        carro2.modelo = "Corolla";
        carro2.marca = "Toyota";
        carro2.ano = 2023;

        // Testando o primeiro carro
        carro1.ligar();
        carro1.ligar();
        carro1.desligar();
        carro1.exibirInformacoes();

        // Testando o segundo carro
        carro2.ligar();
        carro2.desligar();
        carro2.desligar();
        carro2.exibirInformacoes();
    }
}
