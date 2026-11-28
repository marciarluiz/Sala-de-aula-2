package atividade01;

public class main {

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "Welligton";
        conta1.numerononta = 201030;
        conta1.saldo = (1000.0);

        conta1.exibirSaldo();
        conta1.depositar(500.0);
        conta1.exibirSaldo();
        conta1.sacar(200.0);
        conta1.exibirSaldo();
    }
    
}
