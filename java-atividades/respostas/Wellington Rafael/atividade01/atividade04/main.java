package atividade04;

public class main {
    public static void main(String [] args) {
        produto p1 = new produto(" Notebook", 5000.0, 5);
        produto p2 = new produto("Teclado", 274.0, 3);
        produto p3 = new produto("Mouse", 150.0, 10);

        p1.exibirProduto();
        p2.exibirProduto();
        p3.exibirProduto();

        System .out.println("Valor total do estoque: " + (p1.calcularValorEstoque() + p2.calcularValorEstoque() + p3.calcularValorEstoque())); 
        System.out.println("Aplicar desconto de 10% no valor do estoque do produto 1: " + (p1.calcularValorEstoque() * 0.9));
    }
    
}
