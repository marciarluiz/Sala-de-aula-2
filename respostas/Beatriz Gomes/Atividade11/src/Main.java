public class Main {
    public static void main(String[] args) {
        Televisao tv = new Televisao("Samsung" , 50, 5);

        System.out.println("--- Estado inicial da TV ---");
        tv.exibirInformacoes();

        System.out.println("\n --- Simulando o uso do controle remoto ---");
        tv.mudarCanal(12);
        tv.aumentarVolume();
        tv.diminuirVolume();

        System.out.println("\n --- Estado atualizado da TV ---");
        tv.exibirInformacoes();
    }
}
