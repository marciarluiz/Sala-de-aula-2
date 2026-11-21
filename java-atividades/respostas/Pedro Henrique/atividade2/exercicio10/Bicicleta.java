package atividade2.exercicio10;

public class Bicicleta extends Transporte {

    private String tipo;

    public Bicicleta(String modelo, int capacidadePassageiros, String tipo) {
        super(modelo, capacidadePassageiros);
        this.tipo = tipo;
    }

    @Override
    public void mover() {
        System.out.println("Bicicleta em movimento");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tipo: " + tipo);
    }
}