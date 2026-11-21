package atividade2.exercicio4;

public class Main {

    public static void main(String[] args) {

        ProdutoEletronico eletronico1 =
                new ProdutoEletronico("Notebook", 3000, 12);

        ProdutoEletronico eletronico2 =
                new ProdutoEletronico("Celular", 2000, 24);

        ProdutoAlimenticio alimento1 =
                new ProdutoAlimenticio("Arroz", 30, "20/12/2026");

        ProdutoAlimenticio alimento2 =
                new ProdutoAlimenticio("Feijão", 10, "15/12/2026");

        System.out.println("=== ELETRÔNICOS ===");

        eletronico1.exibirProduto();

        System.out.println();

        eletronico2.exibirProduto();

        System.out.println();

        System.out.println("=== ALIMENTÍCIOS ===");

        alimento1.exibirProduto();

        System.out.println();

        alimento2.exibirProduto();
    }
}
