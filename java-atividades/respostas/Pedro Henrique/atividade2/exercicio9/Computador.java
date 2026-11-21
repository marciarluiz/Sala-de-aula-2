package atividade2.exercicio9;

public class Computador extends Dispositivo {

    private String sistemaOperacional;

    public Computador(String marca, String sistemaOperacional) {
        super(marca);
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public void ligar() {
        definirLigado(true);
        System.out.println("Computador iniciando o sistema operacional");
    }

    @Override
    public void exibirEstado() {
        super.exibirEstado();
        System.out.println("Sistema operacional: " + sistemaOperacional);
    }
}