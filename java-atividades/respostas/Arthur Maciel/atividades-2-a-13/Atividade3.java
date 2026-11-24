class Carro {
    String modelo;
    String marca;
    int ano;
    boolean ligado;

    void ligar() {
        if (ligado) {
            System.out.println("O carro ja esta ligado.");
        } else {
            ligado = true;
            System.out.println("Carro ligado.");
        }
    }

    void desligar() {
        ligado = false;
        System.out.println("Carro desligado.");
    }

    void exibirInformacoes() {
        System.out.println(marca + " " + modelo + " (" + ano + ") - Ligado: " + ligado);
    }
}

public class Atividade3 {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.marca = "Fiat";
        c1.modelo = "Uno";
        c1.ano = 2015;

        Carro c2 = new Carro();
        c2.marca = "Honda";
        c2.modelo = "Civic";
        c2.ano = 2020;

        c1.ligar();
        c1.ligar(); // tenta ligar de novo sem desligar
        c1.exibirInformacoes();
        c1.desligar();

        c2.ligar();
        c2.exibirInformacoes();
        c2.desligar();
    }
}