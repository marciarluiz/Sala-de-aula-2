package atividade2.exercicio8;

public class PagamentoPix extends Pagamento {

    private String chavePix;

    public PagamentoPix(double valor, String chavePix) {
        super(valor);
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via Pix realizado");
    }

    @Override
    public void exibirComprovante() {
        super.exibirComprovante();
        System.out.println("Chave Pix: " + chavePix);
    }
}