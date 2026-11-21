package atividade4;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    double calcularValorEstoque() {
        return preco * quantidade;
    }

    void aplicarDesconto(double percentual) { // desafio
        if (percentual > 0 && percentual <= 100) {
            preco = preco - (preco * percentual / 100);
        } else {
            System.out.println("Percentual de desconto inválido.");
        }
    }

    void exibirProduto() {
        System.out.printf("Produto: %s | Preço: R$ %.2f | Quantidade: %d | Valor em estoque: R$ %.2f%n",
                nome, preco, quantidade, calcularValorEstoque());
    }
}
