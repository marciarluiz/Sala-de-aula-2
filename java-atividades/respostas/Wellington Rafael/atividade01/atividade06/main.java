package atividade06;

public class main {
    public static void main(String [] args) {
        cachorro dog1 = new cachorro();
        dog1.nome = "Rex";
        dog1.raca = "Labrador";
        dog1.idade = 3;

        cachorro dog2 = new cachorro();
        dog2.nome = "Buddy";
        dog2.raca = "Golden Retriever";
        dog2.idade = 2;

        cachorro dog3 = new cachorro();
        dog3.nome = "Max";
        dog3.raca = "Pastor Alemão";
        dog3.idade = 4;

        dog1.latir();
        dog1.brincar();
        dog2.latir();
        dog2.brincar();
        dog3.latir();
        dog3.brincar();

        System.out.println();
        dog1.exibirDados();
        dog2.exibirDados();
        dog3.exibirDados();


    }
}
