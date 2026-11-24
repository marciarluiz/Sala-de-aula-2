class Celular {
    String marca;
    String modelo;
    int bateria;

    void ligar() {
        if (bateria > 0) {
            System.out.println("Ligando o " + marca + " " + modelo + "... Bateria em " + bateria + "%.");
        } else {
            System.out.println("Nao e possivel ligar o " + marca + " " + modelo + ": bateria zerada.");
        }
    }

    void carregarBateria(int valor) {
        if (valor > 0) {
            bateria = bateria + valor;
            if (bateria > 100) {
                bateria = 100;
            }
            System.out.println("Carregando " + modelo + "... Bateria agora em " + bateria + "%.");
        }
    }

    void exibirInformacoes() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Bateria: " + bateria + "%");
    }
}

public class Atividade5 {
    public static void main(String[] args) {
        Celular cel1 = new Celular();
        cel1.marca = "Samsung";
        cel1.modelo = "Galaxy A55";
        cel1.bateria = 25;

        Celular cel2 = new Celular();
        cel2.marca = "Xiaomi";
        cel2.modelo = "Redmi Note 13";
        cel2.bateria = 0;

        cel1.exibirInformacoes();
        cel1.ligar();
        cel1.carregarBateria(30);
        cel1.exibirInformacoes();

        System.out.println("---");

        cel2.exibirInformacoes();
        cel2.ligar();
        cel2.carregarBateria(50);
        cel2.ligar();
        cel2.exibirInformacoes();
    }
}