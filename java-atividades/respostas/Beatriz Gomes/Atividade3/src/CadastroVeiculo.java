public class CadastroVeiculo {
    String modelo;
    String marca;
    int ano;
    boolean ligado;

    void ligar() {
        if (ligado) {
            System.out.println("Atenção: O carro já está ligado!");
        } else {
            ligado = true;
            System.out.println("O carro foi ligado com sucesso.");
        }
    }

    void desligar() {
        if (!ligado) {
            System.out.println("O carro já está desligado!");
        } else {
            ligado = false;
            System.out.println("O carro foi desligado.");
        }
    }

    void exibirInformacoes() {
        String status = ligado ? "Ligado" : "Desligado";
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Ano: " + ano + " | Status: " + status);
    }
}