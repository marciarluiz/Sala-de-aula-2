public class Main {
    
    public static void main(String[] args) {
        // Criando o primeiro cachorro
        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Rex";
        cachorro1.raca = "Labrador";
        cachorro1.idade = 3;

        // Criando o segundo cachorro
        Cachorro cachorro2 = new Cachorro();
        cachorro2.nome = "Mel";
        cachorro2.raca = "Poodle";
        cachorro2.idade = 5;

        // Criando o terceiro cachorro
        Cachorro cachorro3 = new Cachorro();
        cachorro3.nome = "Thor";
        cachorro3.raca = "Pastor Alemão";
        cachorro3.idade = 2;

        // Exibindo dados e testando os métodos para cada um
        System.out.println("--- Primeiro Cachorro ---");
        cachorro1.exibirDados();
        cachorro1.latir();
        cachorro1.brincar();

        System.out.println("\n--- Segundo Cachorro ---");
        cachorro2.exibirDados();
        cachorro2.latir();
        cachorro2.brincar();

        System.out.println("\n--- Terceiro Cachorro ---");
        cachorro3.exibirDados();
        cachorro3.latir();
        cachorro3.brincar();
    }
}

