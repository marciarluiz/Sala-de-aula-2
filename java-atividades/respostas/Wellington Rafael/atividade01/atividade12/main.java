package atividade12;

public class main {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Caderno";
        p1.preco = 15.90;
        p1.quantidade = 50;

        Produto p2 = new Produto();
        p2.nome = "Caneta";
        p2.preco = 2.50;
        p2.quantidade = 100;

        p1.mostrarEstoque();
        p2.mostrarEstoque();

        System.out.println();
        p1.adicionarEstoque(20);
        p1.retirarEstoque(30);
        p2.retirarEstoque(150); // estoque insuficiente
        p2.retirarEstoque(40);

        System.out.println();
        p1.mostrarEstoque();
        p2.mostrarEstoque();
    }
}
