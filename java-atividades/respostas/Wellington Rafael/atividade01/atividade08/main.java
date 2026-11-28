package atividade08;
 

public class main {
    public static void main(String [] args) {
        Lampada lampada1 = new Lampada();
        lampada1.cor = "vermelha";
        lampada1.potencia = 60;
        lampada1.ligada = true;

        Lampada lampada2 = new Lampada();
        lampada2.cor = "azul";
        lampada2.potencia = 100;
        lampada2.ligada = false;

        Lampada lampada3 = new Lampada();
        lampada3.cor = "verde";
        lampada3.potencia = 40;
        lampada3.ligada = true;

        lampada1.mostrarEstado();
        lampada2.mostrarEstado();
        lampada3.mostrarEstado();

        System.out.println();
        lampada1.desligada();
        lampada2.ligada();
        lampada3.desligada();
        lampada1.mostrarEstado();
        lampada2.mostrarEstado();
        lampada3.mostrarEstado();
        
    }
}
