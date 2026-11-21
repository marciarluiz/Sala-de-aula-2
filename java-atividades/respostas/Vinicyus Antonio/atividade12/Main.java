package atividade12;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Caderno";
        p1.preco = 15.90;
        p1.quantidade = 20;

        Produto p2 = new Produto();
        p2.nome = "Caneta";
        p2.preco = 2.50;
        p2.quantidade = 50;

        p1.mostrarEstoque();
        p2.mostrarEstoque();
        System.out.println();

        p1.adicionarEstoque(10);
        p1.retirarEstoque(5);
        p2.retirarEstoque(60); // maior que o estoque
        p2.retirarEstoque(20);

        System.out.println();
        p1.mostrarEstoque();
        p2.mostrarEstoque();
    }
}
