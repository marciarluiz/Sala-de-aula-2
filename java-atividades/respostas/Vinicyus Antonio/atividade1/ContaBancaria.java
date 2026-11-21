package atividade1;

public class ContaBancaria {
    String titular;
    int numeroConta;
    double saldo;

    void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado.");
        } else {
            System.out.println("Saque não permitido (valor inválido ou saldo insuficiente).");
        }
    }

    void exibirSaldo() {
        System.out.println("Titular: " + titular + " | Conta: " + numeroConta + " | Saldo: R$ " + saldo);
    }
}
