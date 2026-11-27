public class SistemaProduto {
    
    String nome;
    double preco;
    int quantidade;

    public void Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    double calcularValorEstoque() {
        return preco * quantidade;
    }

    void exibirProduto() {
        System.out.println("Produto: " + nome + " | Preço: R$ " + preco + " | Qtd: " + quantidade + " | Valor em Estoque: R$ " + calcularValorEstoque());
    }

    void aplicarDesconto(double percentual) {
        double valorDesconto = preco * (percentual / 100.0);
        preco -= valorDesconto;
        System.out.println("-> Desconto de " + percentual + "% aplicado em " + nome + "! Novo preço: R$ " + preco);
    }
}

