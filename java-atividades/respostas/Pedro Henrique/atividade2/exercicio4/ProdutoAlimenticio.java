package atividade2.exercicio4;

public class ProdutoAlimenticio extends Produto {

    public ProdutoAlimenticio(String nome, double preco, String dataValidade) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto() {
        return getPreco() * 0.05;
    }
}