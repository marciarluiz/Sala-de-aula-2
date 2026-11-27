public class Main {
    
    public static void main(String[] args) {
        // Criando o primeiro objeto Lâmpada
        Lampada lampada1 = new Lampada();
        lampada1.cor = "Branca Fria";
        lampada1.potencia = 12;
        lampada1.ligada = true; // Configurando para estar ligada

        // Criando o segundo objeto Lâmpada
        Lampada lampada2 = new Lampada();
        lampada2.cor = "RGB Colorida";
        lampada2.potencia = 9;
        lampada2.ligada = false; // Configurando para estar desligada

        // Demonstrando o funcionamento com o método mostrarEstado()
        System.out.println("--- Estado Inicial das Lâmpadas ---");
        lampada1.mostrarEstado();
        lampada2.mostrarEstado();

        System.out.println("\n--- Alterando os Estados ---");
        lampada1.desligar();
        lampada2.ligar();

        System.out.println("\n--- Estado Final após as Alterações ---");
        lampada1.mostrarEstado();
        lampada2.mostrarEstado();
    }
}

