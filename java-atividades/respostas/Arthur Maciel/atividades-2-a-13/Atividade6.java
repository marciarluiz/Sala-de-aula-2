class Cachorro {
    String nome;
    String raca;
    int idade;

    void latir() {
        System.out.println(nome + " diz: Au au!");
    }

    void brincar() {
        System.out.println(nome + " esta brincando.");
    }

    void exibirDados() {
        System.out.println("Nome: " + nome + " | Raca: " + raca + " | Idade: " + idade);
    }
}

public class Atividade6 {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro();
        c1.nome = "Rex";
        c1.raca = "Vira-lata";
        c1.idade = 3;

        Cachorro c2 = new Cachorro();
        c2.nome = "Thor";
        c2.raca = "Labrador";
        c2.idade = 5;

        Cachorro c3 = new Cachorro();
        c3.nome = "Luna";
        c3.raca = "Poodle";
        c3.idade = 2;

        c1.exibirDados();
        c1.latir();
        c1.brincar();

        c2.exibirDados();
        c2.latir();
        c2.brincar();

        c3.exibirDados();
        c3.latir();
        c3.brincar();
    }
}