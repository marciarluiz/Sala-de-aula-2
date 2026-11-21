package atividade1;
public class ContaBancaria {
    
    // Atributos

    String titular;
    int numeroConta;
    double saldo;

    // Método para depositar

    void depositar(double valor){
        saldo = saldo + valor;
    }

     // Método para sacar
    void sacar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    // Método para exibir saldo
    void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo: R$ " + saldo);
    }

    // Método principal
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria();

        conta1.titular = "João";
        conta1.numeroConta = 123;
        conta1.saldo = 500;

        conta1.depositar(200);

        conta1.sacar(100);

        conta1.exibirSaldo();
    }
}












