class ArCondicionado {
    String marca;
    int temperatura;
    boolean ligado;

    void ligar() {
        ligado = true;
        System.out.println("Ar-condicionado " + marca + " ligado.");
    }

    void desligar() {
        ligado = false;
        System.out.println("Ar-condicionado " + marca + " desligado.");
    }

    void aumentarTemperatura() {
        if (temperatura < 30) {
            temperatura++;
        }
    }

    void diminuirTemperatura() {
        if (temperatura > 16) {
            temperatura--;
        }
    }

    void mostrarEstado() {
        System.out.println("Marca: " + marca + " | Ligado: " + ligado + " | Temperatura: " + temperatura + " C");
    }
}

public class Atividade13 {
    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado();
        ar.marca = "Samsung";
        ar.temperatura = 22;
        ar.ligado = false;

        ar.ligar();
        ar.diminuirTemperatura();
        ar.diminuirTemperatura();
        ar.mostrarEstado();

        ar.aumentarTemperatura();
        ar.mostrarEstado();

        ar.desligar();
        ar.mostrarEstado();
    }
}