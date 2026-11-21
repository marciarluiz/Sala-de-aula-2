package atividade1;

public class Produto {

    // Atributos
    String nome;
    double preco;
    int quantidade;

    // Construtor
    Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Método para calcular o valor do estoque
    double calcularValorEstoque() {
        return preco * quantidade;
    }

    // Método para aplicar desconto
    void aplicarDesconto(double percentual) {
        preco = preco - (preco * percentual / 100);
    }

    // Método para exibir o produto
    void exibirProduto() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor em estoque: R$ " + calcularValorEstoque());
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        // Criando três produtos
        Produto produto1 = new Produto("Notebook", 3000, 5);

        Produto produto2 = new Produto("Mouse", 50, 10);

        Produto produto3 = new Produto("Teclado", 100, 8);

        // Aplicando desconto
        produto1.aplicarDesconto(10);

        // Exibindo produtos
        produto1.exibirProduto();
        produto2.exibirProduto();
        produto3.exibirProduto();
    }
}
