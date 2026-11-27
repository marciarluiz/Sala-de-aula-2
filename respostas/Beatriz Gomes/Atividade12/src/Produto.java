public class Produto {
    
    String nome;
    double preco;
    int quantidade;

    
    void adicionarEstoque(int qtd) {
        quantidade += qtd;
        System.out.println("Adicionado " + qtd + " unidades de " + nome + ". Estoque atual: " + quantidade);
    }

    
    void retirarEstoque(int qtd) {
        if (quantidade >= qtd) {
            quantidade -= qtd;
            System.out.println("Retirado " + qtd + " unidades de " + nome + ". Estoque atual: " + quantidade);
        } else {
            System.out.println("Atenção: Estoque insuficiente de " + nome + "! Estoque atual é de apenas " + quantidade + " unidades.");
        }
    }

    
    void mostrarEstoque() {
        System.out.println("Produto: " + nome + " | Preço: R$ " + preco + " | Quantidade em Estoque: " + quantidade);
    }
}