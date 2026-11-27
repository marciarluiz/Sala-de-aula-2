public class Main {
    public static void main(String[] args) {
        // Criando o primeiro celular
        Celular celular1 = new Celular();
        celular1.marca = "Samsung";
        celular1.modelo = "Galaxy S23";
        celular1.bateria = 15;

        // Criando o segundo celular
        Celular celular2 = new Celular();
        celular2.marca = "Apple";
        celular2.modelo = "iPhone 14";
        celular2.bateria = 5;

        // Exibindo informações e testando o primeiro celular
        celular1.exibirInformacoes();
        celular1.ligar();
        
        System.out.println("\n--- Simulando carregamento do Celular 1 ---");
        celular1.carregarBateria(50);
        celular1.exibirInformacoes();

        System.out.println("\n--------------------------------------------------");

        // Testando o segundo celular
        celular2.exibirInformacoes();
        
        System.out.println("\n--- Simulando carregamento do Celular 2 ---");
        celular2.carregarBateria(80);
        celular2.exibirInformacoes();
        celular2.ligar();
    }
}

