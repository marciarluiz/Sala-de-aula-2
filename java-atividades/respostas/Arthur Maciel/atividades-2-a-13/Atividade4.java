class Produto {
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

    void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual <= 100) {
            preco = preco - (preco * (percentual / 100.0));
            System.out.println("Desconto de " + percentual + "% aplicado em " + nome + ". Novo preco: R$ " + preco);
        } else {
            System.out.println("Percentual de desconto invalido.");
        }
    }

    void exibirProduto() {
        System.out.println("Produto: " + nome + " | Preco: R$ " + preco + " | Qtd: " + quantidade + " | Total em estoque: R$ " + calcularValorEstoque());
    }
}

public class Atividade4 {
    public static void main(String[] args) {
        Produto p1 = new Produto("Teclado", 120.0, 5);
        Produto p2 = new Produto("Mouse", 60.0, 10);
        Produto p3 = new Produto("Monitor", 900.0, 2);

        p1.exibirProduto();
        p1.aplicarDesconto(10); // desafio: 10% de desconto
        p1.exibirProduto();

        System.out.println("---");

        p2.exibirProduto();
        p3.exibirProduto();
    }
}