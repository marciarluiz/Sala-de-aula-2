package atividade4;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Teclado", 120.0, 10);
        Produto p2 = new Produto("Mouse", 60.0, 25);
        Produto p3 = new Produto("Monitor", 800.0, 5);

        p1.exibirProduto();
        p2.exibirProduto();
        p3.exibirProduto();

        System.out.println("\nAplicando 10% de desconto no Monitor:");
        p3.aplicarDesconto(10);
        p3.exibirProduto();
    }
}
