package atividade2.exercicio9;

public class Dispositivo {

    private String marca;
    private boolean ligado;

    public Dispositivo(String marca) {
        this.marca = marca;
        this.ligado = false;
    }

    public void ligar() {
        ligado = true;
        System.out.println("Dispositivo ligado!");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Dispositivo desligado!");
    }

    public void exibirEstado() {
        System.out.println("Marca: " + marca);
        System.out.println("Ligado: " + ligado);
    }

    protected void definirLigado(boolean ligado) {
        this.ligado = ligado;
    }
}