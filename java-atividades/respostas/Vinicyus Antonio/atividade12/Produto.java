package atividade12;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
            System.out.println(quantidade + " unidade(s) de " + nome + " adicionada(s).");
        } else {
            System.out.println("Quantidade inválida.");
        }
    }

    void retirarEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
            System.out.println(quantidade + " unidade(s) de " + nome + " retirada(s).");
        } else {
            System.out.println("Não foi possível retirar " + quantidade + " unidade(s) de " + nome + ": estoque insuficiente.");
        }
    }

    void mostrarEstoque() {
        System.out.printf("Produto: %s | Preço: R$ %.2f | Estoque: %d%n", nome, preco, quantidade);
    }
}
