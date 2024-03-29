package exercicioPolimorfismo1;

import java.text.DecimalFormat;

public class Funcionario {

    private String nome;
    private Integer horas;
    private Double valorPorHora;

    public Funcionario(String nome, Integer horas, Double valorPorHora) {
        this.nome = nome;
        this.horas = horas;
        this.valorPorHora = valorPorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(Double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public Double pagamento() {
        return this.valorPorHora * this.horas;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        StringBuilder sb = new StringBuilder();
        sb.append(this.nome + " - R$");
        sb.append(df.format(this.pagamento()));
        return sb.toString();
    }

}
