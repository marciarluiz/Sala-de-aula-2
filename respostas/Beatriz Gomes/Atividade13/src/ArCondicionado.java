public class ArCondicionado {
    
    String marca;
    int temperatura;
    boolean ligado;

    
    void ligar() {
        ligado = true;
        System.out.println("O ar-condicionado (" + marca + ") foi ligado.");
    }

    
    void desligar() {
        ligado = false;
        System.out.println("O ar-condicionado (" + marca + ") foi desligado.");
    }

    
    void aumentarTemperatura() {
        if (temperatura < 30) {
            temperatura++;
            System.out.println("Temperatura aumentada para: " + temperatura + " °C");
        } else {
            System.out.println("Atenção: O ar-condicionado já está na temperatura máxima (30 °C)!");
        }
    }

    
    void diminuirTemperatura() {
        if (temperatura > 16) {
            temperatura--;
            System.out.println("Temperatura diminuída para: " + temperatura + " °C");
        } else {
            System.out.println("Atenção: O ar-condicionado já está na temperatura mínima (16 °C)!");
        }
    }


    void exibirInformacoes() {
        String status = ligado ? "Ligado" : "Desligado";
        System.out.println("Marca: " + marca + " | Status: " + status + " | Temperatura: " + temperatura + " °C");
    }
}
