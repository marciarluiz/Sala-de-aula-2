public class Main {
    
    public static void main(String[] args) {
        
        ArCondicionado ar = new ArCondicionado();
        ar.marca = "LG";
        ar.temperatura = 22;
        ar.ligado = false;

        
        System.out.println("--- Estado Inicial ---");
        ar.exibirInformacoes();

        System.out.println("\n--- Simulando o Funcionamento ---");
        ar.ligar();
        ar.aumentarTemperatura(); 
        ar.aumentarTemperatura(); 
        ar.diminuirTemperatura(); 

        System.out.println("\n--- Testando os Limites (Máximo 30 °C) ---");
        ar.temperatura = 29; 
        ar.aumentarTemperatura(); 
        ar.aumentarTemperatura(); 

        System.out.println("\n--- Estado Final Atualizado ---");
        ar.exibirInformacoes();
    }
}

