package atividade12;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public void adicionarEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para entrada.");
            return;
        }
        this.quantidade += quantidade;
        System.out.println("Entrada de " + quantidade + " unidade(s) de " + nome + ".");
    }

    public void retirarEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para saída.");
        } else if (quantidade > this.quantidade) {
            System.out.println("Estoque insuficiente de " + nome + " (disponível: " + this.quantidade + ").");
        } else {
            this.quantidade -= quantidade;
            System.out.println("Saída de " + quantidade + " unidade(s) de " + nome + ".");
        }
    }

    public void mostrarEstoque() {
        System.out.printf("Produto: %s | Preço: R$ %.2f | Em estoque: %d%n", nome, preco, quantidade);
    }
}
