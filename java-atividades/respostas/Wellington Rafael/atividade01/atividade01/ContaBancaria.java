package atividade01; 

public class ContaBancaria {
    // code
    String  titular;
    int numerononta;
    double saldo;

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido.");
         return;
        }

            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        }

        public void sacar(double valor) {
            if (valor <= 0) {
                System.out.println("Valor de saque inválido.");
            } else if (valor > saldo) {
                System.out.println("Saldo insuficiente para o saque.");
            } else {
                saldo -= valor;
                System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            }
        }

        public void exibirSaldo() {
            System.out.println("Saldo atual: R$" + saldo);
        }


    }
