package atividade2.exercicio8;

public class PagamentoCartao extends Pagamento {

    private int numeroParcelas;

    public PagamentoCartao(double valor, int numeroParcelas) {
        super(valor);
        this.numeroParcelas = numeroParcelas;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via cartão realizado");
    }

    @Override
    public void exibirComprovante() {
        super.exibirComprovante();
        System.out.println("Parcelas: " + numeroParcelas);
    }
}