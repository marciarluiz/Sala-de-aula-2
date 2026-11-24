class Lampada {
    String cor;
    int potencia;
    boolean ligada;

    void ligar() {
        ligada = true;
    }

    void desligar() {
        ligada = false;
    }

    void mostrarEstado() {
        String estado = ligada ? "Ligada" : "Desligada";
        System.out.println("Cor: " + cor + " | Potencia: " + potencia + "W | Estado: " + estado);
    }
}

public class Atividade8 {
    public static void main(String[] args) {
        Lampada l1 = new Lampada();
        l1.cor = "Branca";
        l1.potencia = 15;
        l1.ligar();

        Lampada l2 = new Lampada();
        l2.cor = "Amarela";
        l2.potencia = 9;
        l2.desligar();

        l1.mostrarEstado();
        l2.mostrarEstado();
    }
}