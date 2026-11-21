package atividade1;

public class Cachorro {

    // Atributos
    String nome;
    String raca;
    int idade;

    // Método latir
    void latir() {
        System.out.println(nome + " está latindo: Au au!");
    }

    // Método brincar
    void brincar() {
        System.out.println(nome + " está brincando!");
    }

    // Método exibir dados
    void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raca);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        // Primeiro cachorro
        Cachorro cachorro1 = new Cachorro();

        cachorro1.nome = "Rex";
        cachorro1.raca = "Pastor Alemão";
        cachorro1.idade = 3;

        // Segundo cachorro
        Cachorro cachorro2 = new Cachorro();

        cachorro2.nome = "Bob";
        cachorro2.raca = "Labrador";
        cachorro2.idade = 5;

        // Terceiro cachorro
        Cachorro cachorro3 = new Cachorro();

        cachorro3.nome = "Thor";
        cachorro3.raca = "Poodle";
        cachorro3.idade = 2;

        // Executando métodos do primeiro cachorro
        cachorro1.latir();
        cachorro1.brincar();
        cachorro1.exibirDados();

        // Executando métodos do segundo cachorro
        cachorro2.latir();
        cachorro2.brincar();
        cachorro2.exibirDados();

        // Executando métodos do terceiro cachorro
        cachorro3.latir();
        cachorro3.brincar();
        cachorro3.exibirDados();
    }
}
