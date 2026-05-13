package Ex5;

public class ContaBancaria {
    public int numeroConta;
    public String titular;
    public float saldo;

    public int getNumeroConta() {
        return numeroConta;
    }
    public String getTitular() {
        return titular;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void depositar(float valor) {
        this.saldo += valor;
    }

    public void sacar(float valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: " + this.saldo);
    }
}
