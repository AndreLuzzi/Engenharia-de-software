public class Conta {
    private int numeroConta;
    private double saldo;

    public Conta(int numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        // Impedir deposito de valor negativo
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Depósito inválido.");
        }
    }

    public void sacar(double valor) {
        // Impedir saque com valor negativo ou maior que o saldo
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saque inválido.");
        }
    }

    // Getters padrão POJO
    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
