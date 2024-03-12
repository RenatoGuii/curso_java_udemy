package exercicioClasseMetodoAbstrato;

import java.text.DecimalFormat;

public abstract class Contribuinte {

    protected String nome;
    protected Double rendaAnual;

    public Contribuinte(String nome, Double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public abstract Double imposto();

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        StringBuilder sb = new StringBuilder();

        sb.append(this.nome + ": R$");
        sb.append(df.format(this.imposto()));

        return sb.toString();
    }

}
