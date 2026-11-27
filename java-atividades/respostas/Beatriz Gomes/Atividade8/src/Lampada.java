public class Lampada {
    
    // Atributos
    String cor;
    int potencia; // Ex: em Watts (ex: 9, 12, etc.)
    boolean ligada; // true para ligada, false para desligada

    // Método para ligar a lâmpada
    void ligar() {
        ligada = true;
        System.out.println("A lâmpada (" + cor + ") foi ligada.");
    }

    // Método para desligar a lâmpada
    void desligar() {
        ligada = false;
        System.out.println("A lâmpada (" + cor + ") foi desligada.");
    }

    // Método para mostrar o estado atual da lâmpada
    void mostrarEstado() {
        String status = ligada ? "Ligada (Acesa)" : "Desligada (Apagada)";
        System.out.println("Cor: " + cor + " | Potência: " + potencia + "W | Estado: " + status);
    }
}

