package atividade03;  

public class carro {

    String modelo;
    String marca;
    String cor;
    int ano;
    boolean ligado;

    public void ligar() {
        if (ligado) {
            System.out.println(modelo + "O carro está ligado.");
        } else {
            ligado = true;
            System.out.println(modelo + "O carro já está ligado.");
        }
    }
 
    public void desligar() {
            if (!ligado) {
                System.out.println(modelo + "O carro está desligado.");
            } else {
                ligado = false;
                System.out.println(modelo + "O carro já está desligado."); 
            }
        }

        public void exibirinformacoes() {
            System.out.println("Modelo: " + modelo + "| marca: " + marca + "| cor: " + cor + "| ano: " + ano + "| Ligado: " + (ligado? "sim": "não" ));

    }
}
