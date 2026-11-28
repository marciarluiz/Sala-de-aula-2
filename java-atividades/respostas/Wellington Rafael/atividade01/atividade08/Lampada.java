package atividade08;

public class Lampada {
    
    String cor;
    int potencia; // em watts
    boolean ligada;
    
    public void ligada() {
        ligada = true;
    }

    public void desligada() {
        ligada = false;
    }

    public void mostrarEstado() { 
        System.out.println("A lapadada " + cor + " de " + potencia + " Whatts está: " + (ligada ? " LIGADA " : " DESLIGADA ") + ".");
        }
}
