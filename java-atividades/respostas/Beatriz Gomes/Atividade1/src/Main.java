public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "Simone";
        conta1.numeroConta = 12345;
        
        conta1.depositar(1000.0);
        conta1.exibirSaldo();
        conta1.sacar(500.0);
        conta1.exibirSaldo();
    }
}