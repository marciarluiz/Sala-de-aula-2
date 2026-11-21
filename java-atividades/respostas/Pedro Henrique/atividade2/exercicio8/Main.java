package atividade2.exercicio8;

public class Main {

    public static void main(String[] args) {

        PagamentoPix pix = new PagamentoPix(150, "123456789");

        PagamentoCartao cartao = new PagamentoCartao(300, 3);

        System.out.println("=== PIX ===");

        pix.processarPagamento();
        pix.exibirComprovante();

        System.out.println();

        System.out.println("=== CARTÃO ===");

        cartao.processarPagamento();
        cartao.exibirComprovante();
    }
}