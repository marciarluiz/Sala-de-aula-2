package atividade6;

public class Cachorro {
    String nome;
    String raca;
    int idade;

    void latir() {
        System.out.println(nome + " diz: Au au!");
    }

    void brincar() {
        System.out.println(nome + " está brincando.");
    }

    void exibirDados() {
        System.out.println("Nome: " + nome + " | Raça: " + raca + " | Idade: " + idade + " anos");
    }
}
