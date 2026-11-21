package atividade2.exercicio9;

public class Televisao extends Dispositivo {

    private int canal;

    public Televisao(String marca, int canal) {
        super(marca);
        this.canal = canal;
    }

    @Override
    public void ligar() {
        definirLigado(true);
        System.out.println("Televisão ligada no canal informado");
    }

    @Override
    public void exibirEstado() {
        super.exibirEstado();
        System.out.println("Canal: " + canal);
    }
}