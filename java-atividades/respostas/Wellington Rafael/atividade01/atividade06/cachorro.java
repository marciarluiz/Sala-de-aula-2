package atividade06;

public class cachorro {
    String nome;
    String raca;
    int idade;

    public void latir() {
        System.out.println(nome + " está latindo");
    }

    public void brincar() {
        System.out.println(nome + " está brincando");
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome + " | Raça: " + raca + " | Idade: " + idade + " ano(s)");
    }
}
