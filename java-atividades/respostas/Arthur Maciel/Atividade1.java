
class ContaBancaria {
    String titular;
    int numeroConta;
    double saldo;

    void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Deposito de R$ " + valor + " feito");
        } else {
            System.out.println("Valor invalido pra deposito.");
        }
    }

    void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Saque de R$ " + valor + " feito!");
        } else {
            System.out.println("Saldo insuficiente ou valor invalido.");
        }
    }

    void exibirSaldo() {
        System.out.println("Titular: " + titular + " | Conta: " + numeroConta + " | Saldo: R$ " + saldo);
    }
}

public class Atividade1 {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "Arthur";
        conta1.numeroConta = 12345;
        conta1.saldo = 100.0;

        conta1.exibirSaldo();
        conta1.depositar(50.0);
        conta1.exibirSaldo();
        conta1.sacar(30.0);
        conta1.exibirSaldo();
    }
}