package atividade1;

public class ArCondicionado {

    String marca;
    int temperatura;
    boolean ligado;

    void ligar() {
        if (ligado == false) {
            ligado = true;
            System.out.println("Ar-condicionado ligado!");
        } else {
            System.out.println("O aparelho já está ligado.");
        }
    }

    void desligar() {
        if (ligado == true) {
            ligado = false;
            System.out.println("Ar-condicionado desligado!");
        } else {
            System.out.println("O aparelho já está desligado.");
        }
    }

    void aumentarTemperatura() {
        if (temperatura < 30) {
            temperatura++;
            System.out.println("Temperatura aumentada: " + temperatura + " °C");
        } else {
            System.out.println("Temperatura máxima atingida!");
        }
    }

    void diminuirTemperatura() {
        if (temperatura > 16) {
            temperatura--;
            System.out.println("Temperatura diminuída: " + temperatura + " °C");
        } else {
            System.out.println("Temperatura mínima atingida!");
        }
    }

    public static void main(String[] args) {

        ArCondicionado ar = new ArCondicionado();

        ar.marca = "Samsung";
        ar.temperatura = 22;
        ar.ligado = false;

        System.out.println("Marca: " + ar.marca);
        System.out.println("Temperatura inicial: " + ar.temperatura + " °C");

        ar.ligar();

        ar.aumentarTemperatura();
        ar.aumentarTemperatura();

        ar.diminuirTemperatura();

        ar.desligar();
    }
}
