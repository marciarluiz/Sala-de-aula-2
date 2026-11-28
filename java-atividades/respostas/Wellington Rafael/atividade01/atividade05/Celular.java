package atividade05;

public class Celular {
    String marca;
    String modelo;
    int Bateria;
    boolean ligado;

    public void ligar() {
        if (Bateria <= 0) {
            System.out.println(modelo + "Está com a bateria fraca, não é possível ligar o celular");
        } else {
            ligado = true;
            System.out.println(modelo + "ligado");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Bateria: " + Bateria);  
        System.out.println("Ligado: " + ligado);
    }
    public void CarregarBateria () {
        System.out.println("Carregando a bateria do " + modelo);
        while (Bateria < 100); {
            Bateria = Math.min(100, Bateria + 20);
            System.out.println("Bateria: " + Bateria + "%");
        }
        System.out.println(modelo + " totalmente carregado");
    }
}
