package atividade13;

public class main {
    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado();
        ar.marca = "Samsung";
        ar.temperatura = 28;
        ar.ligado = false;

        ar.aumentarTemperatura(); // desligado: não altera
        ar.ligar();
        ar.exibirInformacoes();

        ar.aumentarTemperatura();
        ar.aumentarTemperatura();
        ar.aumentarTemperatura(); // tenta passar de 30
        ar.exibirInformacoes();

        ar.temperatura = 17;
        ar.diminuirTemperatura();
        ar.diminuirTemperatura(); // tenta ficar abaixo de 16
        ar.exibirInformacoes();

        ar.desligar();
        ar.exibirInformacoes();
    }
}