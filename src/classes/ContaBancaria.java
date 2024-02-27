package classes;

public class ContaBancaria {
    
    private int numeroConta;
    private String titularNome;
    private double saldoConta;

    public ContaBancaria (int numeroConta, String titularNome) {
        this.numeroConta = numeroConta;
        this.titularNome = titularNome;
        this.saldoConta = 0;
    }

    public ContaBancaria (int numeroConta, String titularNome, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.titularNome = titularNome;
        this.saldoConta = depositoInicial;
    }

    public void deposito (double valor) {
        this.saldoConta = this.saldoConta + valor;
    }

    public void saque (double valor) {
        this.saldoConta = (this.saldoConta - valor) - 5;
    }

    public String toString () {
        return "Dados da conta:"
        + String.format("%n")
        + "Conta: "
        + this.numeroConta
        + ", Titular: "
        + this.titularNome
        + ", Saldo: R$"
        + String.format("%.2f", this.saldoConta);
    }

}
