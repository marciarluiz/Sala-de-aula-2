public class Cachorro {
    // Atributos
    String nome;
    String raca;
    int idade;

    // Método para o cachorro latir
    void latir() {
        System.out.println(nome + " está latindo: Au! Au!");
    }

    // Método para o cachorro brincar
    void brincar() {
        System.out.println(nome + " está correndo e brincando com a bolinha!");
    }

    // Método para exibir os dados do animal
    void exibirDados() {
        System.out.println("Nome: " + nome + " | Raça: " + raca + " | Idade: " + idade + " anos");
    }
}