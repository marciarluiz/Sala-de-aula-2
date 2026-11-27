public class Celular {
    

    // Atributos
    String marca;
    String modelo;
    int bateria; // Representa a porcentagem da bateria (ex: 0 a 100)

    // Método para ligar o celular
    void ligar() {
        if (bateria > 0) {
            System.out.println("O celular " + marca + " " + modelo + " foi ligado com sucesso!");
        } else {
            System.out.println("Não foi possível ligar: bateria descarregada (" + bateria + "%).");
        }
    }

    // Método para carregar a bateria
    void carregarBateria(int quantidade) {
        bateria += quantidade;
        if (bateria > 100) {
            bateria = 100; // O máximo é 100%
        }
        System.out.println("Carregando... Nível de bateria atual: " + bateria + "%");
    }

    // Método para exibir as informações do aparelho
    void exibirInformacoes() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Bateria: " + bateria + "%");
    }
}
