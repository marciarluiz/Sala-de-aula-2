public class Main {
    public static void main(String[] args) {
        // Criando o primeiro carro
        CadastroVeiculo carro1 = new CadastroVeiculo();
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2023;
        carro1.ligado = false;

        // Criando o segundo carro
        CadastroVeiculo carro2 = new CadastroVeiculo();
        carro2.marca = "Honda";
        carro2.modelo = "Civic";
        carro2.ano = 2022;
        carro2.ligado = false;

        // Testando o primeiro carro e o desafio
        carro1.exibirInformacoes();
        carro1.ligar();
        carro1.ligar(); // Tentando ligar de novo para testar o desafio!
        carro1.desligar();
        carro1.exibirInformacoes();

        System.out.println("--------------------------------------------------");

        // Testando o segundo carro
        carro2.exibirInformacoes();
        carro2.ligar();
        carro2.exibirInformacoes();
    }
}