package atividade1;

public class Produto2 {

    // Atributos
    String nome;
    double preco;
    int quantidade;

    // Método para adicionar estoque
    void adicionarEstoque(int quantidade) {
        this.quantidade = this.quantidade + quantidade;
    }

    // Método para retirar estoque
    void retirarEstoque(int quantidade) {
        if (quantidade <= this.quantidade) {
            this.quantidade = this.quantidade - quantidade;
        } else {
            System.out.println("Estoque insuficiente!");
        }
    }

    // Método para mostrar estoque
    void mostrarEstoque() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        // Primeiro produto
        Produto2 produto1 = new Produto2();

        produto1.nome = "Notebook";
        produto1.preco = 3000;
        produto1.quantidade = 10;

        // Segundo produto
        Produto2 produto2 = new Produto2();

        produto2.nome = "Mouse";
        produto2.preco = 50;
        produto2.quantidade = 20;

        // Operações no primeiro produto
        produto1.adicionarEstoque(5);
        produto1.retirarEstoque(3);

        // Operações no segundo produto
        produto2.adicionarEstoque(10);
        produto2.retirarEstoque(5);

        // Tentativa de retirada inválida
        produto2.retirarEstoque(100);

        // Exibindo estoques atualizados
        produto1.mostrarEstoque();
        produto2.mostrarEstoque();
    }
}
