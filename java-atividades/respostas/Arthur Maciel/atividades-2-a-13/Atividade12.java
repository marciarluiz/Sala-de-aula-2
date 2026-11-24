class ProdutoEstoque {
    String nome;
    double preco;
    int quantidade;

    void adicionarEstoque(int qtd) {
        if (qtd > 0) {
            quantidade += qtd;
        }
    }

    void retirarEstoque(int qtd) {
        if (qtd > 0 && qtd <= quantidade) {
            quantidade -= qtd;
        } else {
            System.out.println("Quantidade insuficiente em estoque para " + nome + ".");
        }
    }

    void mostrarEstoque() {
        System.out.println("Produto: " + nome + " | Preco: R$ " + preco + " | Quantidade: " + quantidade);
    }
}

public class Atividade12 {
    public static void main(String[] args) {
        ProdutoEstoque p1 = new ProdutoEstoque();
        p1.nome = "Caderno";
        p1.preco = 20.0;
        p1.quantidade = 10;

        ProdutoEstoque p2 = new ProdutoEstoque();
        p2.nome = "Caneta";
        p2.preco = 3.5;
        p2.quantidade = 5;

        p1.adicionarEstoque(5);
        p1.retirarEstoque(8);
        p1.mostrarEstoque();

        p2.retirarEstoque(10); // tenta tirar mais do que tem
        p2.adicionarEstoque(15);
        p2.mostrarEstoque();
    }
}