package exercicioExcecoes;

public class ContaBancaria {

    private Integer numero;
    private String titular;
    private Double saldo;
    private Double limiteSaque;

    public ContaBancaria(Integer numero, String titular, Double saldo, Double limiteSaque) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public void deposito(Double valor) {
        this.saldo += valor;
    }

    public void saque(Double valor) {

        if (valor > this.limiteSaque) {
            throw new DomainException("O valor inserido é maior que o limite disponivel para saque!");
        }

        if (valor > this.saldo) {
            throw new DomainException("O valor inserido é maior o saldo disponível!");
        }

        this.saldo -= valor;

    }

}
