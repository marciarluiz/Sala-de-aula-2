package atividade1;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "Vinicyus Antonio";
        conta1.numeroConta = 12345;
        conta1.saldo = 100.0;

        conta1.exibirSaldo();
        conta1.depositar(250.0);
        conta1.sacar(80.0);
        conta1.sacar(1000.0);
        conta1.exibirSaldo();
    }
}
