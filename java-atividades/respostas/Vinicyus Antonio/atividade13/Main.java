package atividade13;

public class Main {
    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado();
        ar.marca = "Samsung";
        ar.temperatura = 29;
        ar.ligado = false;

        ar.aumentarTemperatura(); // desligado
        ar.ligar();
        ar.aumentarTemperatura();
        ar.aumentarTemperatura(); // limite 30

        ar.temperatura = 17;
        ar.diminuirTemperatura();
        ar.diminuirTemperatura(); // limite 16

        ar.desligar();
    }
}
