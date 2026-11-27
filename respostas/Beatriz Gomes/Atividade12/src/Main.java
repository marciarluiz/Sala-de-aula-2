public class Main {
    public static void main(String[] args) {
        
        Produto produto1 = new Produto();
        produto1.nome = "Notebook Gamer";
        produto1.preco = 4500.0;
        produto1.quantidade = 10;

        
        Produto produto2 = new Produto();
        produto2.nome = "Mouse Sem Fio";
        produto2.preco = 120.0;
        produto2.quantidade = 25;

        
        System.out.println("--- Estoque Inicial ---");
        produto1.mostrarEstoque();
        produto2.mostrarEstoque();

        System.out.println("\n--- Movimentações no Estoque ---");
        produto1.retirarEstoque(3); 
        produto2.adicionarEstoque(15); 

        System.out.println("\n--- Testando o Desafio (Evitar Estoque Negativo) ---");
        produto1.retirarEstoque(15); 

        System.out.println("\n--- Estoque Final Atualizado ---");
        produto1.mostrarEstoque();
        produto2.mostrarEstoque();
    }
}

