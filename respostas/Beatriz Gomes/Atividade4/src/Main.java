public class Main {
    
    public static void main(String[] args) {
        SistemaProduto p1 = new SistemaProduto();
        SistemaProduto p2 = new SistemaProduto();

        p1.Produto("Notebook", 3500.0, 4);
        p2.Produto("Mouse Gamer", 150.0, 15);

        p1.exibirProduto();
        p2.exibirProduto();

        System.out.println("--------------------------------------------------");

        // Testando o desafio de desconto
        p1.aplicarDesconto(10.0);
        p1.exibirProduto();
    }
}

