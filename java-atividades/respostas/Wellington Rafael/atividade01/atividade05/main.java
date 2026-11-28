package atividade05;

public class main {
    public static void main(String [] args) {
        Celular celular1 = new Celular();
        celular1.marca = "Samsung";
        celular1.modelo = "Galaxy S21";
        celular1.Bateria = 50;

        Celular celular2 = new Celular();
        celular2.marca = "Apple";
        celular2.modelo = "iPhone 13";
        celular2.Bateria = 10;

        celular1.ligar();
        celular2.ligar(); 
        celular1.exibirInformacoes();
        celular2.exibirInformacoes();

        System.out.println();
        celular1.CarregarBateria();
        celular2.CarregarBateria();

        System.out.println();
        celular1.exibirInformacoes();
        celular2.exibirInformacoes();


    }
    
}
